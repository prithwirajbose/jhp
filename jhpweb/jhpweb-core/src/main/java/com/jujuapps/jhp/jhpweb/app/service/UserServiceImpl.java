package com.jujuapps.jhp.jhpweb.app.service;

import java.util.List;

import com.jujuapps.jhp.jhpweb.app.bean.UserBean;
import com.jujuapps.jhp.jhpweb.app.dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<UserBean> getUserList() throws Exception {
		return userDao.getUserList();
	}

	public UserBean getaddUser(UserBean userBean) throws Exception {
		return userDao.addUser(userBean);
	}

}
