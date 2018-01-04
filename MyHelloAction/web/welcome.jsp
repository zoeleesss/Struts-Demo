<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="bean.User" %><%--
  Created by IntelliJ IDEA.
  User: sss
  Date: 17/10/2017
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h1>el method: welcome！ username： ${user.name} </h1>
<h1>normal method: welcome！ username： <%= ((User)(ActionContext.getContext().get("user"))).getName() %> </h1>
</body>
</html>