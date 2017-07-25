package com.jujuapps.jhp.jhpweb.web.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.jujuapps.jhp.jhpweb.app.bean.HomeBean;
import com.jujuapps.jhp.jhpweb.app.service.UserService;

public class HomeAction extends ActionSupport implements ModelDriven<HomeBean> {
	Logger log = Logger.getLogger(HomeAction.class);
	UserService userService;
	HomeBean homeBean = new HomeBean();
	
	public String execute() {
		return SUCCESS;
	}
	
	public String getUserList(){
		try {
			homeBean.setUserBeanList(userService.getUserList());
		} catch (Exception e) {
			log.error("An error has occured while retrieving User List", e);
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String addUser() {
		try {
			homeBean.setUserBean(userService.getaddUser(homeBean.getUserBean()));
		} catch (Exception e) {
			homeBean.getUserBean().setAddUserSuccess("N");
			log.error("An error has occured while retrieving User List", e);
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public HomeBean getModel() {
		return homeBean;
	}
}
