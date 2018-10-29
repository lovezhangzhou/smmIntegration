<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/fileUploadPage" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile"  multiple="multiple"/><br/>
    <input type="submit" value="上传" />
</form>

</body>
</html>
