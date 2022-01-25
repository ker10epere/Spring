<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
form {
	border: 2px;
	border-color: black;
	border-style: solid;
	margin: 2rem auto;
	display: flex;
	align-content: start;
	justify-content: center;
	padding: 3rem;
	text-align: center;
}

</style>
<title>Insert title here</title>
</head>
<body>
	<form action="processForm" method="post">
		<div>
			<h3>processForm</h3>
			<input type="text" name="name" /> <input type="submit"
				value="Submit">
		</div>
	</form>
	<form action="processFormShout" method="post">
		<div>
			<h3>processFormShout</h3>
			<input type="text" name="name" /> <input type="submit"
				value="Submit">
		</div>
	</form>
</body>
</html>