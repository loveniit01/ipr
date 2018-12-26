package com.ipr.controller.fileupdown;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipr.form.MyUploadForm;

@Controller
public class MyFileExportController {

	private static final Logger logger = LoggerFactory.getLogger(MyFileExportController.class);
	public MyFileExportController() {
		// TODO Auto-generated constructor stub
	}

	// GET: Show download form page.
	   @RequestMapping(value = "/downloadOneFile", method = RequestMethod.GET)
	   public String uploadOneFileHandler(Model model) {
	 
	      MyUploadForm myUploadForm = new MyUploadForm();
	      model.addAttribute("myUploadForm", myUploadForm);
	      logger.info("file download page");
	      return "fileupdown/downloadOneFile";
	   }
	
	   
	   // POST: Do Upload
	   @RequestMapping(value = "/downloadOneFile", method = RequestMethod.POST)
	   public String uploadOneFileHandlerPOST(HttpServletRequest request, //
	         Model model, //
	         @ModelAttribute("myUploadForm") MyUploadForm myUploadForm) {
		   
		   logger.info("redirect to dodownload");
	 
	      return this.doDownload(request, model, myUploadForm);
	 
	   }
	   
	   private String doDownload(HttpServletRequest request, Model model, //
		         MyUploadForm myUploadForm) {
		   
		   
		   
		   return "fileupdown/downloadOneFile";
	   }
	   
}
