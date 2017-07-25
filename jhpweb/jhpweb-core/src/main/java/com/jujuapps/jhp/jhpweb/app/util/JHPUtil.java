package com.jujuapps.jhp.jhpweb.app.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

public class JHPUtil {
	public static List convertListOfXToListOfY(List fromBeanList, Class toBeanClass) throws Exception {
		List resultList = null;
		if(fromBeanList != null) {
			resultList = new ArrayList();
			for(Object obj : fromBeanList) {
				Object dest = toBeanClass.newInstance();
				BeanUtils.copyProperties(obj, dest);
				resultList.add(dest);
			}
		}
		return resultList;
	}
	
	
}
