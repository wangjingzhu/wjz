<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<jsp:useBean id="studentbean" class="com.bean.stu.Studentbean" scope="page"/>
<jsp:setProperty property="*" name="studentbean"/>
姓名：<jsp:getProperty property="stuName" name="studentbean"/><br>
学号：<jsp:getProperty property="stuNum" name="studentbean"/><br>
性别：<jsp:getProperty property="stuSex" name="studentbean"/><br>
年龄：<jsp:getProperty property="stuAge" name="studentbean"/><br>
专业：<jsp:getProperty property="stuZY" name="studentbean"/><br>
籍贯：<jsp:getProperty property="sutJg" name="studentbean"/>

</body>
</html>