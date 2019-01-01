package com.ipr.controller.manager;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipr.dao.security.AppUserDAO;
import com.ipr.dao.security.UserRoleDao;
import com.ipr.entity.AppRole;
import com.ipr.entity.AppUser;
import com.ipr.entity.UserRole;
import com.ipr.form.MixDataForm;
import com.ipr.form.MyUploadForm;
import com.ipr.utils.DateUtils;
import com.ipr.utils.EncrytedPasswordUtils;

@Controller
public class UserController {

	@Autowired
	EncrytedPasswordUtils passwordUtils;

	@Autowired
	DateUtils dateUtils;

	@Autowired
	AppUserDAO appUserDAO;

	@Autowired
	UserRoleDao userRoleDao;

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/manager/newUser", method = RequestMethod.GET)
	public String execute(Model model) {
		List<String> users = new ArrayList<String>();
		List<AppUser> all_users = appUserDAO.getAlluser();
		model.addAttribute("all_users", all_users);
		model.addAttribute("users", users);
		return "/adminarea/user_new";
	}

	@RequestMapping(value = "/manager/newUser", method = RequestMethod.POST)
	public String createNewUser(HttpServletRequest request, //
			Model model, @ModelAttribute("userDTL") MixDataForm userDTL) {
		List<String> users = new ArrayList<String>();
//		Long user__id;
		try {
			AppUser appUser = new AppUser();
			appUser.setUserName(userDTL.getUser_id());
			appUser.setEncrytedPassword(passwordUtils.encrytePassword(userDTL.getUser_id()));
			appUser.setEnabled(true);
			appUser.setUserId(appUserDAO.saveData(appUser));
			// -apply user role
			AppRole appRole = new AppRole();
			appRole.setRoleId(userDTL.getUser_type());
			UserRole userRole = new UserRole();
			userRole.setAppUser(appUser);
			userRole.setAppRole(appRole);

			userRoleDao.saveData(userRole);

			users.add("User_Name : " + userDTL.getUser_id());
			users.add("Password  : " + userDTL.getUser_id());

		} catch (Exception e) {
			// TODO: handle exception
			users.add("error..");
		}

		List<AppUser> all_users = appUserDAO.getAlluser();
		model.addAttribute("all_users", all_users);
		model.addAttribute("users", users);
		return "/adminarea/user_new";
	}

	public void getAlluser() {
		List<AppUser> users = appUserDAO.getAlluser();

	}

}
