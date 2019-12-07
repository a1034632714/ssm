<%--
  Created by IntelliJ IDEA.
  User: Ken
  Date: 2019/11/16
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/stu/info.do">getStudentInfo</a>
<form method="post" action="${pageContext.request.contextPath}/stu/search.do">
    <input type="text" name="str"><input type="submit">
</form>
<form method="post" action="${pageContext.request.contextPath}/stu/upload.do" enctype="multipart/form-data">
<input type="file" name="file">
<input type="submit">
</form>
</body>
</html>
