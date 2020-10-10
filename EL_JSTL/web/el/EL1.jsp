<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setAttribute("asd","你");
  session.setAttribute("zxc","我");%>

${requestScope.asd}           <%--EL表达式--%>
<%=request.getAttribute("asd")%>  <%--JSP--%>
</body>
</html>
