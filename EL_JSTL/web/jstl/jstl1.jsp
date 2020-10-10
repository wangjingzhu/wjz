<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add("aaa");
        request.setAttribute("list",list);
        request.setAttribute("number",3);
    %>
    <c:if test="${not empty list}">         <%--test后为booler类型，为true才显示里面内容，flase不显示--%>
        遍历集合。。。
    </c:if>
    <c:if test="%{number % 2 != 0 }">
        ${number}为奇数
    </c:if>

</body>
</html>
