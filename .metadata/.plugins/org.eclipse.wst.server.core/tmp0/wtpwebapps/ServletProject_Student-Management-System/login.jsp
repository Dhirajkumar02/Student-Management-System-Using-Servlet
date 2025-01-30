<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	text-align: center;
	margin-top: 100px;
}

.container {
	width: 300px;
	margin: auto;
}

input {
	width: 100%;
	padding: 10px;
	margin: 5px 0;
}

button {
	width: 100%;
	padding: 10px;
	background: blue;
	color: white;
	border: none;
}
</style>
</head>
<body>
	<h2>Login</h2>
	<div class="container">
		<form action="LoginServlet" method="post">
			<input type="text" name="username" placeholder="Enter Username"
				required><br> <input type="password" name="password"
				placeholder="Enter Password" required><br>
			<button type="submit">Login</button>
		</form>
	</div>
</body>
</html>
