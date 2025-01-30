package com.jsp.servlet.sms;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/display-all-students")
public class DisplayAllStudentsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_student-management-system", "root",
					"DHIraj@2002");

			ps = conn.prepareStatement("SELECT * FROM student ");

			rs = ps.executeQuery();
			
			req.setAttribute("resultSet", rs);
			
			RequestDispatcher rd = req.getRequestDispatcher("DisplayAllStudents.jsp");
			rd.forward(req, resp);

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			if(conn != null && ps != null && rs != null)
				try {
					conn.close();
					ps.close();
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

		}
	}
}
