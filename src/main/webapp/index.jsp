<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>登录</title>  
</head>  
<body>  
<form action="api/user/login" method="post" id="loginForm">  
<table>  
<tbody>  
<tr>  
<th>用户名：</th><td><input name="userName"  /></td>  
</tr>  
<tr>  
<th>密码：</th><td><input name="password"  type="password"/></td>  
</tr>  
<tr>  
<td colspan="2"><input type="submit" name="submit" value="登录" /><input type="reset" value="重置"/></td>  
</tr>  
</tbody>  
</table>  
</form>  
</body>  
</html> 