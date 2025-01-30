<%@ page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Student Details Page</title>

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
	padding: 20px;
	background: #f4f4f9;
	display: flex;
	flex-direction: column;
	align-items: center;
}

h1 {
	font-size: 2rem;
	color: #333;
	margin-bottom: 20px;
	text-align: center;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

th, td {
	padding: 12px;
	text-align: left;
	border: 1px solid #ddd;
}

th {
	background-color: #007BFF;
	color: white;
}

td {
	background-color: #fff;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

a {
	text-decoration: none;
	padding: 8px 16px;
	border-radius: 5px;
	font-weight: bold;
	margin: 0 5px;
}

.update {
	background-color: #28a745;
	color: white;
}

.delete {
	background-color: #dc3545;
	color: white;
}

.update:hover {
	background-color: #218838;
}

.delete:hover {
	background-color: #c82333;
}

.back-link {
	text-align: center;
	margin-top: 30px;
}

.back-link a {
	font-size: 1.2rem;
	color: #007BFF;
	text-decoration: none;
	font-weight: bold;
}

.back-link a:hover {
	text-decoration: underline;
}

/* Media Query for responsive design */
@media ( max-width : 768px) {
	table {
		overflow-x: auto;
		display: block;
	}
	th, td {
		font-size: 14px;
		padding: 8px;
	}
	h1 {
		font-size: 1.5rem;
	}
}
</style>

<!-- JavaScript -->
<script>
        function confirmDelete() {
            return confirm("Are you sure you want to delete this student?");
        }
    </script>
</head>
<body>
	<h1>All Student Details</h1>

	<table>
		<tr>
			<th>StudentId</th>
			<th>StudentName</th>
			<th>StudentEmail</th>
			<th>StudentAge</th>
			<th>StudentCourse</th>
			<th>StudentCity</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
		ResultSet rs = (ResultSet) request.getAttribute("resultSet");
		if(rs != null){
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getInt(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6)%></td>
			<td><a href="find-by-id?studentId=<%=rs.getInt(1)%>"
				class="update">UPDATE</a></td>
			<td><a href="delete-student?studentId=<%=rs.getInt(1)%>"
				class="delete" onclick="return confirmDelete();">DELETE</a></td>
		</tr>
		<%
		}
		}else{
			%>
		<tr>
			<td colspan="8">No Student data found.</td>
		</tr>
		<% 
		}
		%>

	</table>

	<div class="back-link">
		<h2>
			<a href="index.jsp">Go Back to DashBoard</a>
		</h2>
	</div>
</body>
</html>
