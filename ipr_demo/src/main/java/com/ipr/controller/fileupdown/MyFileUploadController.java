package com.ipr.controller.fileupdown;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

import com.ipr.dao.GreylistDataDaoImpl;
import com.ipr.dao.UploadDataDaoImpl;
import com.ipr.dao.WhitelistDataDaoImpl;
import com.ipr.entity.AppUser;
import com.ipr.entity.other.UploadData;
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

	@Autowired
	WhitelistDataDaoImpl whiteIMPL;

	@Autowired
	GreylistDataDaoImpl greyIMPL;

	@Autowired
	UploadDataDaoImpl uploadIMPL;

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
	/*
	 * @RequestMapping(value = "/uploadMultiFile", method = RequestMethod.GET)
	 * public String uploadMultiFileHandler(Model model) {
	 * 
	 * MyUploadForm myUploadForm = new MyUploadForm();
	 * model.addAttribute("myUploadForm", myUploadForm);
	 * 
	 * return "uploadMultiFile"; }
	 */

	// POST: Do Upload
	/*
	 * @RequestMapping(value = "/uploadMultiFile", method = RequestMethod.POST)
	 * public String uploadMultiFileHandlerPOST(HttpServletRequest request, // Model
	 * model, //
	 * 
	 * @ModelAttribute("myUploadForm") MyUploadForm myUploadForm) {
	 * 
	 * return this.doUpload(request, model, myUploadForm);
	 * 
	 * }
	 */

	private String doUpload(HttpServletRequest request, Model model, //
			MyUploadForm myUploadForm) {

		// get user id
		HttpSession session = request.getSession();
//		   System.out.println( session.getAttribute("userid"));

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
		Map<String, String> errorDetails = new HashMap<>();

		/**
		 * ======== white List data==================
		 */

		List<String> whiteListDomains = whiteIMPL.allDomain();

		/**
		 * ======== grey list data================
		 */
		List<String> greyListDomains = greyIMPL.allDomain();

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
					// --- read csv file================

					String csvFile = serverFile.getAbsolutePath();
					BufferedReader br = null;
					String line = "";
					String cvsSplitBy = ",";

					try {

						br = new BufferedReader(new FileReader(csvFile));
						while ((line = br.readLine()) != null) {
							// use comma as separator
							String[] country = line.split(cvsSplitBy);

							/**
							 * ==== compair white & grey list = == = = =
							 */
							int wt = compairWhiteList(country[1], whiteListDomains);
							int gy = 0;
							if (wt == 0) {
								gy = compairGreyList(country[1], greyListDomains);
							}

							/**
							 * country[0]= link; country[1]= domain; country[2]= project_id; country[3]=
							 * source_link; country[5]= note1; country[6]= note2; country[0]= note3;
							 */

							/*
							 * if (country[0].startsWith("http://") || country[0].startsWith("http://")) {
							 * 
							 * 
							 * } else { errorDetails.put(country[0], "http:// or https:// missing"); }
							 */

							// data upload code will be call from here
							UploadData uploadData = new UploadData();
//							for (String pp : country) {
							try {
								uploadData.setLink(country[0].trim());
								uploadData.setDomainName(country[1].trim());
								uploadData.setProjectId(Long.parseLong(country[2].trim()));
								uploadData.setSourceLink(country[3].trim());
								if (country[3].trim().length() < 1) {
									uploadData.setLinkType((byte) 0);
								} else {
									uploadData.setLinkType((byte) 1);
								}
								uploadData.setNote1(country[4].trim());
								uploadData.setNote2(country[5].trim());
								uploadData.setNote3(country[6].trim());
								uploadData.setIsWhitelist((byte) wt);
								uploadData.setIsGreylist((byte) gy);
								uploadData
										.setUserId(Integer.parseInt(session.getAttribute("userid").toString().trim()));
								uploadIMPL.saveUploadData(uploadData);
								
							}
							catch (NumberFormatException e) {
								// TODO: handle exception
								logger.error("project id is wrong...");
							}

							catch (Exception e) {
								// TODO: handle exception
								e.printStackTrace();
							}
//							}

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

					// ----- end read CSV------

				} catch (Exception e) {
					e.printStackTrace();
					logger.info("Error Write file: " + name);
					failedFiles.add(name);
				}
			}
		}
		model.addAttribute("description", description);
		model.addAttribute("uploadedFiles", uploadedFiles);
		model.addAttribute("failedFiles", failedFiles);
		model.addAttribute("errorDetails", errorDetails);
		model.addAttribute("error", failedFiles);

		return "fileupdown/uploadResult";
	}

	public Integer compairWhiteList(String domain_name, List<String> domains) {
		if (domains.contains(domain_name.toLowerCase().trim())) {
			return 1;
		} else {
			return 0;
		}
	}

	public Integer compairGreyList(String domain_name, List<String> domains) {
		if (domains.contains(domain_name.toLowerCase().trim())) {
			return 1;
		} else {
			return 0;
		}
	}

}
