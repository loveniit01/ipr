package com.ipr.controller.fileupdown;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.ipr.entity.AppUser;
import com.ipr.form.MyUploadForm;

 
@Controller
public class MyFileUploadController {
	private static final Logger logger = LoggerFactory.getLogger(MyFileUploadController.class);
   @RequestMapping(value = "/")
   public String homePage() {
 
      return "index";
   }
   
   @Autowired
	HttpServletRequest request;
 
   // GET: Show upload form page.
   @RequestMapping(value = "/uploadOneFile", method = RequestMethod.GET)
   public String uploadOneFileHandler(Model model) {

//	   HttpSession session=request.getSession();
//	   System.out.println( session.getAttribute("userid"));
	   
      MyUploadForm myUploadForm = new MyUploadForm();
      model.addAttribute("myUploadForm", myUploadForm);
 
      return "fileupdown/uploadOneFile";
   }
 
   // POST: Do Upload
   @RequestMapping(value = "/uploadOneFile", method = RequestMethod.POST)
   public String uploadOneFileHandlerPOST(HttpServletRequest request, //
         Model model, //
         @ModelAttribute("myUploadForm") MyUploadForm myUploadForm) {
	   
      return this.doUpload(request, model, myUploadForm);
 
   }
 
   // GET: Show upload form page.
  /* @RequestMapping(value = "/uploadMultiFile", method = RequestMethod.GET)
   public String uploadMultiFileHandler(Model model) {
 
      MyUploadForm myUploadForm = new MyUploadForm();
      model.addAttribute("myUploadForm", myUploadForm);
 
      return "uploadMultiFile";
   }*/
 
   // POST: Do Upload
 /*  @RequestMapping(value = "/uploadMultiFile", method = RequestMethod.POST)
   public String uploadMultiFileHandlerPOST(HttpServletRequest request, //
         Model model, //
         @ModelAttribute("myUploadForm") MyUploadForm myUploadForm) {
 
      return this.doUpload(request, model, myUploadForm);
 
   }*/
 
   private String doUpload(HttpServletRequest request, Model model, //
         MyUploadForm myUploadForm) {
	   
	   // get user id
 
      String description = myUploadForm.getDescription();
      logger.info("Description: " + description);
      // Root Directory.
      String uploadRootPath = request.getServletContext().getRealPath("upload");
      logger.info("uploadRootPath=" + uploadRootPath);
      File uploadRootDir = new File(uploadRootPath);
      // Create directory if it not exists.
      if (!uploadRootDir.exists()) {
         uploadRootDir.mkdirs();
      }
      MultipartFile[] fileDatas = myUploadForm.getFileDatas();
      //
      List<File> uploadedFiles = new ArrayList<File>();
      List<String> failedFiles = new ArrayList<String>();
 
      for (MultipartFile fileData : fileDatas) {
 
         // Client File Name
         String name = fileData.getOriginalFilename();
         logger.info("Client File Name = " + name);
         if (name != null && name.length() > 0) {
            try {
               // Create the file at server
               File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);
 
               BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
               stream.write(fileData.getBytes());
               stream.close();
               //
               uploadedFiles.add(serverFile);
               logger.info("Write file: " + serverFile);
               //--- read csv file================
               
        	   
        	   String csvFile = serverFile.getAbsolutePath();
        	   BufferedReader br = null;
               String line = "";
               String cvsSplitBy = ",";
               
               try {

                   br = new BufferedReader(new FileReader(csvFile));
                   while ((line = br.readLine()) != null) {

                       // use comma as separator
                       String[] country = line.split(cvsSplitBy);

//                       logger.info("Country [code= " + country[0] + " , name=" + country[1] + "]");
                       for(String pp:country)
                       {
                    	   System.out.print(pp+" | ");
                       }
                       System.out.println();
                       
                       //data upload code will be call from here
                       
                       
                   }

               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               } finally {
                   if (br != null) {
                       try {
                           br.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
               }
        	   
               //----- end read CSV------
        	   
        	 
               
               
               
               
               
            } catch (Exception e) {
               logger.info("Error Write file: " + name);
               failedFiles.add(name);
            }
         }
      }
      model.addAttribute("description", description);
      model.addAttribute("uploadedFiles", uploadedFiles);
      model.addAttribute("failedFiles", failedFiles);
      
      model.addAttribute("error", failedFiles);
      
      return "fileupdown/uploadResult";
   }
 
}
