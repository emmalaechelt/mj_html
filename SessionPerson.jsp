<%@page import="common.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 영역</title>
</head>
<body>
<h2>페이지 이동 후 session 영역의 속성 읽기</h2>
	<%
	ArrayList<Person> persons = (ArrayList<Person>)session.getAttribute("persons");
	for (Person str : persons)
		out.print(str + "<br/>");
	%>
</body>
</html>