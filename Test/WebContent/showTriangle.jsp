<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<jsp:useBean id="triangle" class="com.bean.tri.Triangle" scope="page"/>
  <jsp:setProperty name="triangle" property="*"/>
  <p>
    三角形的三边是:<BR>
		边A：<jsp:getProperty name="triangle" property="sideA" /><br>
		边B：<jsp:getProperty name="triangle" property="sideB" /><br>
		边C：<jsp:getProperty name="triangle" property="sideC" /><br>
  <p>
  这三个边能构成一个三角形吗？
  <jsp:getProperty name="triangle" property="triangle"/>
  <p>
  面积是:
  <jsp:getProperty name="triangle" property="area"/>
  周长是：
  <jsp:getProperty name="triangle" property="lenght"/>
</body>
</html>