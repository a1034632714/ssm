<%--
  Created by IntelliJ IDEA.
  User: Ken
  Date: 2019/11/19
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.4.1/jquery.js">
    </script>
    <title>Title</title>
    <script>
        function checkForm() {
            var studentid = $("#studentid").val();
            var password = $("#password").val();
            if (studentid==""||password==""||studentid.length==0||password.length==0){
                alert("empty");
                return false;
            }
        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/stu/save.do" method="post" onsubmit="checkForm();">
    <c:if test="${pageContext.request.getParameter('id')}!=null">
        <input type="text" name="id" value="${pageContext.request.getParameter("id")}" style="visibility: hidden">
    </c:if>
    studentid<input name="studentid" type="text" id="studentid">
    password<input name="password" type="password" id="password">
    <input type="submit" >
</form>
</body>
</html>
