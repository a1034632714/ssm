<%--
  Created by IntelliJ IDEA.
  User: Ken
  Date: 2019/11/14
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/stu/search.do">
    <input type="text" name="str"><input type="submit">
</form>
<table border="1">
    <tr>
        <td>学号</td><td>密码</td>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.studentid}</td>
            <td>${student.password}</td>
            <td><a href="${pageContext.request.contextPath}/stu/tosave.do?id=${student.id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath}/stu/delete.do?id=${student.id}">删除</a></td>
        </tr>
    </c:forEach>
    <c:if test="${not empty search}" >
        <tr>
            <td>${search.studentid}</td>
            <td>${search.password}</td>
            <td><a href="${pageContext.request.contextPath}/stu/tosave.do?id=${search.id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath}/stu/delete.do?id=${student.id}">删除</a></td>
        </tr>
        <td><a href="/stu/info.do">返回</a></td>
    </c:if>

<a href="/stu/tosave.do">添加新的学生</a>
</table>
</body>
</html>
