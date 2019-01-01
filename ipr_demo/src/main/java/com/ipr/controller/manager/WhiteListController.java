package com.ipr.controller.manager;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipr.entity.AppUser;
import com.ipr.entity.other.WhitelistData;
import com.ipr.form.MixDataForm;

@Controller
public class WhiteListController {

	public WhiteListController() {
		// TODO Auto-generated constructor stub
	}

	
	@RequestMapping(value = "/manager/newWhite", method = RequestMethod.GET)
	public String execute(Model model) {
		List<WhitelistData> all_white = new ArrayList<>();
		model.addAttribute("all_white", all_white);
		return "/adminarea/whiteList_new";
	}
	
	
	@RequestMapping(value = "/manager/newUser", method = RequestMethod.POST)
	public String createNewWhiteList(HttpServletRequest request, //
			Model model, @ModelAttribute("whiteDTL") MixDataForm whiteDTL) {
		try {
			
			
			
			
			List<WhitelistData> all_white = new ArrayList<>();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "/adminarea/whiteList_new";
	}
	
}
