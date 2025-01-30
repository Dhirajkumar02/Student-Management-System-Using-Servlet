<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="javax.servlet.http.HttpSession"%>
<%
HttpSession session1 = request.getSession(false);
if (session1 == null || session1.getAttribute("username") == null) {
	response.sendRedirect("login.jsp");
	return;
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management System</title>
<!-- Google font -->
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap"
	rel="stylesheet">

<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	height: 100vh;
	font-family: 'Poppins', sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	background-image:
		url("https://img.freepik.com/free-vector/abstract-technology-particle-background_23-2148426649.jpg?t=st=1731783141~exp=1731786741~hmac=10eaf2a165591029c8e21d216b239000be18b5405140acd69eaa6284c6d77839&w=996");
	/* 	background: linear-gradient(165deg, purple, blue); */
}

div {
	/* border: 2px solid black; */
	height: 600px;
	width: 500px;
	background: white;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	gap: 30px;
	border-radius: 20px;
	text-align: center;
}

div img {
	height: 180px;
	width: 180px;
}

h1 {
	font-size: 28px;
	background: linear-gradient(to right, #6a11cb, #2575fc);
	-webkit-background-clip: text;
	color: transparent;
	/* margin-bottom: 20px; */
}

a {
	text-decoration: none;
	color: white;
	padding: 10px 20px;
	background-color: #007BFF;
	border-radius: 5px;
	font-size: 16px;
	font-weight: 500;
	transition: all 0.3s ease;
}

a:hover {
	background-color: #0056b3;
	box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
}

/* Media Query for responsive design */
@media ( max-width : 600px) {
	div {
		width: 90%;
		padding: 20px;
	}
	h1, h2 {
		font-size: 18px;
	}
	a {
		padding: 8px 15px;
		font-size: 14px;
	}
}
</style>
</head>
<body>
	<div>
		<img alt="emoji"
			src="https://s3.amazonaws.com/pix.iemoji.com/images/emoji/apple/ios-12/256/man-student.png">
		<h1>
			Welcome,
			<%=session1.getAttribute("username")%>!
		</h1>

		<h2>
			<a href="AddStudent.jsp">ADD NEW STUDENT</a>
		</h2>
		<h2>
			<a href="display-all-students">DISPLAY ALL STUDENTS</a>
		</h2>

		<!-- Logout Link -->
		<h2>
			<a href="LogoutServlet"
				onclick="return confirm('Are you sure you want to logout?');">LOGOUT</a>
		</h2>
	</div>
</body>
</html>