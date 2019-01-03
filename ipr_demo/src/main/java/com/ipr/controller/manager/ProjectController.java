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

import com.ipr.dao.AccountDao;
import com.ipr.dao.ProjectDao;
import com.ipr.dao.ProjectTypesDao;
import com.ipr.dao.security.AppUserDAO;
import com.ipr.entity.other.Account;
import com.ipr.entity.other.Project;
import com.ipr.entity.other.ProjectTypes;
import com.ipr.form.MixDataForm;
import com.ipr.form.MyProject;

@Controller
public class ProjectController {

	public ProjectController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	ProjectDao projectDao;
	@Autowired
	AccountDao accoutDao;
	@Autowired
	ProjectTypesDao projectTypesDao;
	@Autowired
	AppUserDAO appUserDAO;
	String message = null;

	@RequestMapping(value = "/manager/newProject", method = RequestMethod.GET)
	public String execute(Model model) {
		List<Project> all_project = projectDao.getAllProject();
		List<Account> all_account = accoutDao.getAllAccount();
		List<ProjectTypes> all_projectTypes = projectTypesDao.getAllProjectTypes();
		model.addAttribute("all_projectTypes", all_projectTypes);
		model.addAttribute("all_project", all_project);
		model.addAttribute("all_account", all_account);
		model.addAttribute("message", message);
		return "/adminarea/project_new";
	}

	@RequestMapping(value = "/manager/newProject", method = RequestMethod.POST)
	public String createNewUser(HttpServletRequest request, //
			Model model, @ModelAttribute("projectDTL") MyProject projectDTL, Principal principal) {

		try {
			Project project = new Project();
			project.setAccount(accoutDao.findAccount(projectDTL.getAccountId()));
			project.setProjectTypes(projectTypesDao.findProjectType(projectDTL.getProjectTypesId()));
			project.setAppUser(appUserDAO.findUserAccount(principal.getName()));

			project.setChannelName(projectDTL.getChannelName());
			project.setContractUrl(projectDTL.getContractUrl());
			project.setProjectName(projectDTL.getProjectName());
			project.setProjectUrl(projectDTL.getProjectUrl());

			projectDao.save(project);

			message = "<h2 style='color:green'>Success!!</h2><br>Project Created..";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			message = "<h2 style='color:red'>Fail!!</h2><br> Error on create new project";
		} finally {

			List<Project> all_project = projectDao.getAllProject();
			List<Account> all_account = accoutDao.getAllAccount();
			List<ProjectTypes> all_projectTypes = projectTypesDao.getAllProjectTypes();
			model.addAttribute("all_projectTypes", all_projectTypes);
			model.addAttribute("all_project", all_project);
			model.addAttribute("all_account", all_account);
			model.addAttribute("message", message);
		}
		return "/adminarea/project_new";
	}

}
