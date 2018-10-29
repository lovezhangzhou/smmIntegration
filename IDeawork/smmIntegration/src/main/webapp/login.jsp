<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/21
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body> <!-- /RedisTest/getall-->
<form action="/UserCon/Login" method="post">
    <table>
        <td>
            <tr>用户名：<input type="text" name="u_name"/></tr><br/>
        </td>
        <td>
            <tr>密码：<input type="password" name="u_pwd"/></tr><br/>
        </td>
        <td>
            <tr><input type="submit" value="登录"/></tr>
            <tr><a href="/RedisTest/getTA">测试</a></tr>
            <tr><a href="/pagingTa">测试分页</a></tr>
            <tr><input type="button" value="注册" onclick="location.href='register.jsp'"/></tr>
        </td>
    </table>

</form>

</body>
</html>
