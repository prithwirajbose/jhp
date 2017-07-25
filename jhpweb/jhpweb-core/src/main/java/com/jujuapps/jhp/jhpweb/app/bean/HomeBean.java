package com.jujuapps.jhp.jhpweb.app.bean;

import java.util.ArrayList;
import java.util.List;

public class HomeBean {
	List<UserBean> userBeanList = new ArrayList<UserBean>();
	UserBean userBean = new UserBean();

	public List<UserBean> getUserBeanList() {
		return userBeanList;
	}

	public void setUserBeanList(List<UserBean> userBeanList) {
		this.userBeanList = userBeanList;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
}
