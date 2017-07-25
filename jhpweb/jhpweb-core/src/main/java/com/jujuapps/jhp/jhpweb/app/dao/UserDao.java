package com.jujuapps.jhp.jhpweb.app.dao;

import java.util.List;

import com.jujuapps.jhp.jhpweb.app.bean.UserBean;

public interface UserDao {
	public List<UserBean> getUserList() throws Exception;

	public UserBean addUser(UserBean userBean) throws Exception;
}
