package com.jsp.servlet.sms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;

@WebServlet("/find-by-id")
public class FindStudentByIdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int studentId = Integer.parseInt(req.getParameter("studentId"));
		
		// JDBC LOGIC
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_student-management-system", "root",
					"DHIraj@2002");

			ps = conn.prepareStatement("SELECT * FROM student WHERE studentId=? ");
			ps.setInt(1, studentId);

			rs = ps.executeQuery();
			
			req.setAttribute("resultSet", rs);
			
			RequestDispatcher rd = req.getRequestDispatcher("UpdateStudent.jsp");
			rd.forward(req, resp);

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {
		        if (rs != null) rs.close();
		        if (ps != null) ps.close();
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		}
	}

}
