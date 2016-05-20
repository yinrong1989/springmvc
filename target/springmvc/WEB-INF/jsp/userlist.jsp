<%--
  Created by IntelliJ IDEA.
  User: yinrong
  Date: 2016/4/30
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>
<c:forEach var="user" items="${userList}">
    <li>
     <ul>
         <li>${user.name}</li>
         <li>${user.age}</li>
         <li>${user.sex}</li>

     </ul>
    </li>
</c:forEach>
</ul>
</body>
</html>
