package com.jujuapps.jhp.jhpweb.app.service;

import java.util.List;

import com.jujuapps.jhp.jhpweb.app.bean.UserBean;

public interface UserService {
	public List<UserBean> getUserList() throws Exception;

	public UserBean getaddUser(UserBean userBean) throws Exception;
}
