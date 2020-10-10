<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--EL表达式从域对象中获取对象的值 ￥{域名.键名.属性值}
    例如：<% User user = new User     user.setName("张三")   requset.setAttribute("user",user)%>
        ￥{requestScope.user.name} 获取的就是user中getername的值--%>
<%request.setAttribute("asd","你");
  session.setAttribute("zxc","我");%>

${requestScope.asd}           <%--EL表达式--%>
<%=request.getAttribute("asd")%>  <%--JSP--%>
</body>
</html>
