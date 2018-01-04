<%--
  Created by IntelliJ IDEA.
  User: sss
  Date: 20/10/2017
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form method="post" action="register_execute.action">

    <table>
        <tr>
            <td>Name:</td><td><input type="text" name="name" ></td>
        </tr>
        <tr>
            <td>Id Card:</td><td><input type="text" name="idcard" ></td>
        </tr>
        <tr>
            <td>Email:</td><td><input type="email" name="email" ></td>
        </tr>
        <tr>
            <td>QQ:</td><td><input type="text" name="qq" ></td>
        </tr>
        <tr>
            <td>Tel:</td><td><input type="tel" name="tel" ></td>
        </tr>
        <tr>
            <td>Wechat:</td><td><input type="text" name="wechat" ></td>
        </tr>
        <tr>
            <td><input type="reset"></td><td><input type="submit"></td>
        </tr>

    </table>



</form>


</body>
</html>
