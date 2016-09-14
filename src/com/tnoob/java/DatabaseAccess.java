package com.tnoob.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class DatabaseAccess
 */
@WebServlet("/DatabaseAccess")
public class DatabaseAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/milo";
	static final String USER = "root";
	static final String PASS = "milo2007";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DatabaseAccess() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String title = "Servlet Mysql 测试";
		String docType = "<!DOCTYPE html>\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
				+ "</title></head>\n" + "<body bgcolor=\"#fff0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n");
		try {
			// 注册 JDBC 驱动器
			Class.forName("com.mysql.jdbc.Driver");

			// 打开一个连接
			conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);

			// 执行 SQL 查询
			stmt = (Statement) conn.createStatement();
			String sql;
			sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);

			// 展开结果集数据库
			out.println("个人信息输出");

			while (rs.next()) {
				// 通过字段检索
				int id = rs.getInt("uid");
				String name = rs.getString("name");
				String age = rs.getString("age");
				String email = rs.getString("email");

				// 输出数据
				out.println("UID: " + id);
				out.println(", 名字: " + name);
				out.println(", 年龄: " + age);
				out.println(", 电子邮件: " + email);
				out.println("<br />");
			}
			out.println("</body></html>");

			// 完成后关闭
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// 处理 JDBC 错误
			se.printStackTrace();
		} catch (Exception e) {
			// 处理 Class.forName 错误
			e.printStackTrace();
		} finally {
			// 最后是用于关闭资源的块
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
