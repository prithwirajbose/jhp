<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
<style type="text/css">
body {
	font:12px Arial;
}

table.grid td {
	border-bottom:1px solid #aaa;
}

table.grid th {
	border-bottom:2px solid #888;
	color:#fff;
	background:#666;
}
</style>
</head>
<body>
<h2>User List</h2>
<table border="0" cellpadding="5" cellspacing="0" class="grid">
<tr><th>Email ID</th><th>First Name</th><th>Last Name</th><!-- <th></th> --></tr>
<s:iterator value="userBeanList">
<tr><td><s:property value="emailId" /></td><td><s:property value="firstName" /></td><td><s:property value="lastName" /></td></tr>
</s:iterator>
</table>
<h2>Add User</h2>
<s:if test='%{userBean.getAddUserSuccess() eq "Y"}'>
<h4 style="color:green">User Added Successfully</h4>
</s:if>
<form name="addUserForm" method="post" action="<%=request.getContextPath()%>/user/addUser">
<table border="0" cellpadding="5" cellspacing="0">
<tr><td>Email</td><td><input type="text" name="userBean.emailId" /></td></tr>
<tr><td>Password</td><td><input type="password" name="userBean.password" /></td></tr>
<tr><td>First Name</td><td><input type="text" name="userBean.firstName" /></td></tr>
<tr><td>Last Name</td><td><input type="text" name="userBean.lastName" /></td></tr>
<tr><td><input type="submit" name="submit" value="Save" /></td><td>&nbsp;</td></tr>
</table>
</form>
</body>
</html>