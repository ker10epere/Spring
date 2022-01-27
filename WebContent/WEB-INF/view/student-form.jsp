<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form
		action="${ pageContext.request.contextPath }/student/processForm"
		modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<form:errors path="lastName"/>
		<br>
		Country : <form:select path="country">
			<form:options items="${country}" />
		</form:select>
		<input type="submit" value="Submit" >
	</form:form>
</body>
</html>