package com.ipr.controller.manager;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipr.dao.GreylistDataDaoImpl;
import com.ipr.dao.security.AppUserDAO;
import com.ipr.entity.other.GreylistData;
import com.ipr.form.MixDataForm;

@Controller
public class GreyListController {

	public GreyListController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	GreylistDataDaoImpl greylistDao;
	
	@Autowired
	AppUserDAO userDao;
	
	@RequestMapping(value = "/manager/newGrey", method = RequestMethod.GET)
	public String execute1(Model model) {
//		List<greylistData> all_white = new ArrayList<>();
		List<GreylistData> all_grey = greylistDao.allData();
		model.addAttribute("all_grey", all_grey);
		return "/adminarea/greyList_new";
	}
	
	
	@RequestMapping(value = "/manager/newGrey", method = RequestMethod.POST)
	public String createNewWhiteList(HttpServletRequest request, //
			Model model, @ModelAttribute("whiteDTL") MixDataForm greyDTL,Principal principal) {
		try {
			
			GreylistData greylistData =  new GreylistData();
			greylistData.setDomainName(greyDTL.getDomain_name());
			greylistData.setAppUser(userDao.findUserAccount(principal.getName()));
			greylistDao.save(greylistData);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		List<GreylistData> all_grey =greylistDao.allData(); 
		model.addAttribute("all_grey", all_grey);
		return "/adminarea/greyList_new";
	}
	
}
