<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student Details</title>

<!-- Google Fonts -->
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
	font-family: 'Poppins', sans-serif;
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(165deg, purple, aqua);
}

form {
	/*   border: 2px solid black; */
	background: #fff;
	padding: 30px;
	width: 100%;
	max-width: 500px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	gap: 20px;
	border-radius: 15px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
}

h1 {
	font-size: 2rem;
	color: #333;
	text-align: center;
	font-weight: 600;
}

input {
	height: 40px;
	width: 300px;
	padding-left: 10px;
	font-size: 16px;
	border: 2px solid #ccc;
	border-radius: 10px;
	transition: border-color 0.3s;
}

input:focus {
	border-color: #007BFF;
	outline: none;
}

#add_btn {
	height: 50px;
	width: 120px;
	background-color: #007BFF;
	color: #fff;
	border: none;
	font-size: 18px;
	border-radius: 10px;
	cursor: pointer;
	transition: background-color 0.3s, transform 0.2s;
}

#add_btn:hover {
	background-color: #0056b3;
	transform: scale(1.05);
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
	form {
		padding: 20px;
		width: 90%;
	}
	h1 {
		font-size: 1.5rem;
	}
	input, #add_btn {
		font-size: 14px;
	}
}
</style>
</head>
<body>
	<form action="add-student" method="post">
		<div>
			<h1>Enter Student Details</h1>
		</div>
		<div>
			<input type="number" placeholder="Enter studentId" name="studentId"
				required="required">
		</div>

		<div>
			<input type="text" placeholder="Enter studentName" name="studentName"
				required="required">
		</div>

		<div>
			<input type="text" placeholder="Enter studentEmail"
				name="studentEmail" required="required">
		</div>

		<div>
			<input type="number" placeholder="Enter studentAge" name="studentAge"
				required="required">
		</div>

		<div>
			<input type="text" placeholder="Enter studentCourse"
				name="studentCourse" required="required">
		</div>

		<div>
			<input type="text" placeholder="Enter studentCity" name="studentCity"
				required="required">
		</div>

		<div>
			<button type="submit" id="add_btn" value="Add">Add</button>
		</div>

		<div>
			<h2>
				<a href="index.jsp">Back</a>
			</h2>
		</div>
	</form>
</body>
</body>
</html>