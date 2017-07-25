package com.jujuapps.jhp.jhpweb.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jujuapps.jhp.jhpweb.app.bean.UserBean;
import com.jujuapps.jhp.jhpweb.app.entity.User;
import com.jujuapps.jhp.jhpweb.app.util.JHPUtil;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@SuppressWarnings({"deprecation","unchecked"})
	public List<UserBean> getUserList() throws Exception {
		List<UserBean> userBeanList = new ArrayList<UserBean>();
		try {
		
			Query query  = getSession().createQuery("from User");
			List<User> userList = (List<User>) query.list();
			if(userList!=null && userList.size()>0)
				userBeanList = JHPUtil.convertListOfXToListOfY(userList, UserBean.class);
		}
		catch(Exception e) {
			throw e;
		}
		return userBeanList;
	}

	public UserBean addUser(UserBean userBean) throws Exception {
		List<UserBean> userBeanList = new ArrayList<UserBean>();
		try {
			User user = new User();
			BeanUtils.copyProperties(userBean, user);
			getHibernateTemplate().merge(user);
			BeanUtils.copyProperties(user, userBean);
			userBean.setAddUserSuccess("Y");
		}
		catch(Exception e) {
			userBean.setAddUserSuccess("N");
			throw e;
		}
		return userBean;
	}
	
}
