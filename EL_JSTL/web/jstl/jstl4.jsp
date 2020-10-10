<%@ page import="test.javabean.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List list = new ArrayList();
    list.add(new User("阿瑟东",12));
    list.add(new User("水滴",19));
    list.add(new User("而非",21));
    request.setAttribute("list",list);
%>
<table border="1" width="500" align="center">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count %2 != 0 }">
            <tr bgcolor="red">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
            </tr>
        </c:if>
        <c:if test="${s.count %2 == 0 }">
            <tr bgcolor="green">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>

</body>
</html>
