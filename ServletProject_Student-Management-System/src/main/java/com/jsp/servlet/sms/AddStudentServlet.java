package com.jsp.servlet.sms;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.cj.jdbc.Driver;

@WebServlet("/add-student")
public class AddStudentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int studentId = Integer.parseInt(req.getParameter("studentId"));
		String studentName = req.getParameter("studentName");
		String studentEmail = req.getParameter("studentEmail");
		int studentAge = Integer.parseInt(req.getParameter("studentAge"));
		String studentCourse = req.getParameter("studentCourse");
		String studentCity = req.getParameter("studentCity");

		// JDBC Logic
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_student-management-system", "root",
					"DHIraj@2002");

			ps = conn.prepareStatement("INSERT INTO student VALUES(?, ?, ?, ?, ?, ?)");
			
			ps.setInt(1, studentId);
			ps.setString(2, studentName);
			ps.setString(3, studentEmail);
			ps.setInt(4, studentAge);
			ps.setString(5, studentCourse);
			ps.setString(6, studentCity);

			ps.execute();

			resp.sendRedirect("index.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null && ps != null)
				try {
					conn.close();
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
