<%--
  Created by IntelliJ IDEA.
  User: Ken
  Date: 2019/11/20
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>学号</td><td>密码</td>
    </tr>
  <%--  <tr>
        <td>${studnets.studentid}</td>
        <td>${studnets.password}</td>
    </tr>--%>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.studentid}</td>
            <td>${student.password}</td>
            <td><a>修改</a></td>
            <td><a>删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
