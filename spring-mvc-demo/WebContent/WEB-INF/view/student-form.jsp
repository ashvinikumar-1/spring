<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
		<br>
		<br>
	Last Name: <form:input path="lastName" />
		<br>
		<br>
		Country:
		<form:select path="country">
			<!----  	<form:option value="Brazil" label="Brazil" />
			<form:option value="India" label="India" />
			<form:option value="SA" label="SA" />
			<form:option value="Japan" label="Japan" /> 
			 --->
			<form:options items="${theCountryOptions}" />
		</form:select>
		<br>
		<br>
		Favorite Language:
		C <form:radiobutton path="favoriteLanguage" value="C"/>
		C++ <form:radiobutton path="favoriteLanguage" value="java"/>
		java <form:radiobutton path="favoriteLanguage" value="java"/>
		python <form:radiobutton path="favoriteLanguage" value="python"/>
		<br><br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>