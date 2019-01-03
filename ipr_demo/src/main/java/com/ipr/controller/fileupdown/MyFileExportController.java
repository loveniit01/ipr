package com.ipr.controller.fileupdown;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.ipr.dao.DownloadDataDao;
import com.ipr.form.MyDownloadFile;
import com.ipr.form.MyUploadForm;
import com.ipr.utils.DateUtils;
import com.ipr.utils.WriteCsvToResponse;

@Controller
public class MyFileExportController {

	private static final Logger logger = LoggerFactory.getLogger(MyFileExportController.class);

	public MyFileExportController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	DownloadDataDao downloadDao;
	@Autowired
	DateUtils dateUtil;

	// GET: Show download form page.
	@RequestMapping(value = "/downloadOneFile", method = RequestMethod.GET)
	public String uploadOneFileHandler(Model model) {

		MyUploadForm myDownloadForm = new MyUploadForm();
		model.addAttribute("myDownloadForm", myDownloadForm);
		logger.info("file download page");
		return "fileupdown/downloadOneFile";
	}

	// POST: Do download
	@RequestMapping(value = "/downloadOneFile", method = RequestMethod.POST, produces = "text/csv")
	public String uploadOneFileHandlerPOST(HttpServletRequest request, HttpServletResponse response, //
			Model model, //
			@ModelAttribute("myDownloadForm") MyUploadForm myDownloadForm) throws IOException {

		logger.info("redirect to dodownload");

		List<Object[]> downloadDataFile = downloadDao.getalldata(myDownloadForm.getC_date1());
		List<MyDownloadFile> downloadData = new ArrayList<>();
		for (Object[] obj : downloadDataFile) {
			MyDownloadFile downloadFile = new MyDownloadFile();
			downloadFile.setId(Long.parseLong( obj[0].toString()));
			downloadFile.setLink((String) obj[1]);

			downloadFile.setDomain((String) obj[2]);
			downloadFile.setSource_link((String) obj[3]);
//			String project_id=  obj[3].toString();
			downloadFile.setProject_id(Long.parseLong(obj[4].toString()));
			downloadFile.setProject_name((String) obj[5]);
			downloadFile.setChannel_name((String) obj[6]);
			downloadFile.setProject_type((String) obj[7]);
			downloadFile.setClient_name((String) obj[8]);
			downloadFile.setProject_url((String) obj[9]);
			
//			downloadFile.setUploaded_by((String) obj[9]);
			
			downloadFile.setUploaded_by((String) obj[10]);

			downloadFile.setUploaded_date((obj[11].toString()));
			downloadFile.setNote1((String) obj[12]);
			downloadFile.setNote2((String) obj[13]);
			downloadFile.setNote3((String) obj[14]);
			downloadFile.setWhitelist(Integer.parseInt( obj[15].toString()));
			downloadFile.setGreylist(Integer.parseInt(obj[16].toString()));
			downloadFile.setLinkType(Integer.parseInt(obj[17].toString()));
			downloadData.add(downloadFile);
		}

		{
//			csv creation block

			String csvFileName = "exportData.csv";
			response.setContentType("application/csv");
			String headerKey = "Content-Disposition";
			String headerValue = String.format("attachment; filename=\"%s\"", csvFileName);
			response.setHeader(headerKey, headerValue);

			ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

			String[] header = { "ID", "Link", "Domain Name","Source Link", "Project ID", "Project Name", "Project Type",
					"Channel Name", "Account Name", "Project URL", "Note1", "Note2", "Note3", "User Name",
					"Upload Date", "White List", "Grey List","Link Type" };
			csvWriter.writeHeader(header);
			
			String[]headercompair = {"id","link","domain","source_link","project_id","project_name","project_type","channel_name","client_name","project_url","note1","note2","note3","uploaded_by","uploaded_date", "whitelist","greylist","linkType"};

			for (MyDownloadFile aBook : downloadData) {
				csvWriter.write(aBook, headercompair);
			}

			csvWriter.close();
		}

//		WriteCsvToResponse.writeData_M(response.getWriter(), downloadDataFile);

//	      return this.doDownload(request, model, myDownloadForm);
		return "fileupdown/downloadOneFile";
	}

}
