/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2025-01-30 07:46:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class DisplayAllStudents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("java.sql.ResultSet");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Student Details Page</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	font-family: 'Poppins', sans-serif;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	background: #f4f4f9;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("	font-size: 2rem;\r\n");
      out.write("	color: #333;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("	padding: 12px;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	border: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("	background-color: #007BFF;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	padding: 8px 16px;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin: 0 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".update {\r\n");
      out.write("	background-color: #28a745;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete {\r\n");
      out.write("	background-color: #dc3545;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".update:hover {\r\n");
      out.write("	background-color: #218838;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete:hover {\r\n");
      out.write("	background-color: #c82333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-link {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-link a {\r\n");
      out.write("	font-size: 1.2rem;\r\n");
      out.write("	color: #007BFF;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-link a:hover {\r\n");
      out.write("	text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Media Query for responsive design */\r\n");
      out.write("@media ( max-width : 768px) {\r\n");
      out.write("	table {\r\n");
      out.write("		overflow-x: auto;\r\n");
      out.write("		display: block;\r\n");
      out.write("	}\r\n");
      out.write("	th, td {\r\n");
      out.write("		font-size: 14px;\r\n");
      out.write("		padding: 8px;\r\n");
      out.write("	}\r\n");
      out.write("	h1 {\r\n");
      out.write("		font-size: 1.5rem;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript -->\r\n");
      out.write("<script>\r\n");
      out.write("        function confirmDelete() {\r\n");
      out.write("            return confirm(\"Are you sure you want to delete this student?\");\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>All Student Details</h1>\r\n");
      out.write("\r\n");
      out.write("	<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>StudentId</th>\r\n");
      out.write("			<th>StudentName</th>\r\n");
      out.write("			<th>StudentEmail</th>\r\n");
      out.write("			<th>StudentAge</th>\r\n");
      out.write("			<th>StudentCourse</th>\r\n");
      out.write("			<th>StudentCity</th>\r\n");
      out.write("			<th>Update</th>\r\n");
      out.write("			<th>Delete</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		");

		ResultSet rs = (ResultSet) request.getAttribute("resultSet");
		if(rs != null){
			while (rs.next()) {
		
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print(rs.getInt(1));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getInt(4));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getString(6));
      out.write("</td>\r\n");
      out.write("			<td><a href=\"find-by-id?studentId=");
      out.print(rs.getInt(1));
      out.write("\"\r\n");
      out.write("				class=\"update\">UPDATE</a></td>\r\n");
      out.write("			<td><a href=\"delete-student?studentId=");
      out.print(rs.getInt(1));
      out.write("\"\r\n");
      out.write("				class=\"delete\" onclick=\"return confirmDelete();\">DELETE</a></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

		}
		}else{
			
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=\"8\">No Student data found.</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");
 
		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"back-link\">\r\n");
      out.write("		<h2>\r\n");
      out.write("			<a href=\"index.jsp\">Go Back to DashBoard</a>\r\n");
      out.write("		</h2>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
