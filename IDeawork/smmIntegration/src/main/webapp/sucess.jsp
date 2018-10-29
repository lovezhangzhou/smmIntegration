<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/20
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<script>

    <%--alert('${sessionScope.ta}')--%>
    <%--console.log(${sessionScope.ta});--%>
</script>
<body>
<h1>88888888888添加成功</h1>
<%--${sessionScope.userBeans}--%>
<table>
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>年龄</th>
        <th>地址</th>
    </tr>
<%--<c:forEach items='${userBean}' var='us'>--%>
    <%--<td>${us.Tname}***</td>--%>
    <%--<td>${us.Tid}***</td>--%>
    <%--<td>${us.u_pwd}***</td>--%>
    <%--<td>${us.u_sex}***</td>--%>
    <%--<td>${us.u_age}***</td>--%>
    <%--<td>${us.a_ddress}</td><br/>--%>
<%--</c:forEach>--%>
    <%--${sessionScope.ta}--%>
    <c:forEach items="${ta}" var="t">
        <tr><td>${t.tid}</td>
    <td>${t.tname}</td></tr><tr/>
    </c:forEach>
</table>

</body>
</html>
