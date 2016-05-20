<%--
  Created by IntelliJ IDEA.
  User: yinrong
  Date: 2016/5/2
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Upload a file please</title>
</head>
<body>
<h1>Please upload a file</h1>
<form method="post" action="/form" enctype="multipart/form-data">
    <input type="text" name="name"/>
    <input type="file" name="file"/>
    <input type="submit"/>
</form>
</body>
</html>
