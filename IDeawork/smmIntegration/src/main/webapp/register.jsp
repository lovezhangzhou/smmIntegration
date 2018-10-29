<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/20
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/UserCon/Insert" method="post">
    <table>
        <td>
            <tr>用户名：</tr><tr><input type="text" name="u_name"></tr>
        </td> <br>
        <td>
            <tr>密码：</tr><tr><input type="password" name="u_pwd"></tr>
        </td> <br>
        <td>
            <tr>性别：</tr><tr><input type="text" name="u_sex"></tr>
        </td> <br>
        <td>
            <tr>年龄：</tr><tr><input type="text" name="u_age"></tr>
        </td> <br>
        <td>
            <tr>地址：</tr><tr><input type="text" name="a_ddress"></tr>
        </td> <br>
        <td>
            <tr><input type="submit" name="提交"></tr>
        </td> <br>

    </table>
</form>

</body>
</html>
