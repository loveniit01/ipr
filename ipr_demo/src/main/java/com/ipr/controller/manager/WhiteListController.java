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

import com.ipr.dao.WhitelistDataDaoImpl;
import com.ipr.dao.security.AppUserDAO;
import com.ipr.entity.other.WhitelistData;
import com.ipr.form.MixDataForm;

@Controller
public class WhiteListController {

	public WhiteListController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	WhitelistDataDaoImpl whitelistDao;
	
	@Autowired
	AppUserDAO userDao;
	
	@RequestMapping(value = "/manager/newWhite", method = RequestMethod.GET)
	public String execute1(Model model) {
//		List<WhitelistData> all_white = new ArrayList<>();
		List<WhitelistData> all_white = whitelistDao.allData();
		model.addAttribute("all_white", all_white);
		return "/adminarea/whiteList_new";
	}
	
	
	@RequestMapping(value = "/manager/newWhite", method = RequestMethod.POST)
	public String createNewWhiteList(HttpServletRequest request, //
			Model model, @ModelAttribute("whiteDTL") MixDataForm whiteDTL,Principal principal) {
		try {
			
			WhitelistData whitelistData =  new WhitelistData();
			whitelistData.setDomainName(whiteDTL.getDomain_name());
			whitelistData.setAppUser(userDao.findUserAccount(principal.getName()));
			whitelistDao.save(whitelistData);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		List<WhitelistData> all_white = 	whitelistDao.allData(); 
		model.addAttribute("all_white", all_white);
		return "/adminarea/whiteList_new";
	}
	
}
