<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>       <%-- for（int i=0；i<10;i++）
                属性：
                    begin：开始值
                    end：结束值
                    var：临时变量    相当于i
                    step：步长      为1时候，相当于i++
                    varStatus:循环状态对象  idex：容器中元素的索引，从0开始  count：循环次数，从1开始--%>
<c:forEach begin="1" end="10" var="i" step="1">
    ${i}<br>
</c:forEach>
<hr>
             <%--遍历容器
             List<User> list;
             for(User user : list){
             }
             属性：
                items：容器对象          相当于list
                var：容器中元素的临时变量  相当于user
                varStatus:循环状态对象  idex：容器中元素的索引，从0开始  count：循环次数，从1开始 --%>
<%
    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    request.setAttribute("list",list);
%>
<c:forEach items="${list}" var="str" varStatus="s">
    ${s.index} ${s.count} ${str}<br>

</c:forEach>


</body>
</html>
