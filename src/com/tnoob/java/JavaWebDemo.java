package com.tnoob.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaWeb3
 */
@WebServlet("/JavaWeb3")
public class JavaWebDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JavaWebDemo() {
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
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String title = "Get 实例测试";
		String docType = "<!DOCTYPE html> \n";
		out.println(docType
				+ "<html>\n"
				+ "<head><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\"><title>"
				+ title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "  <li><b>名字</b>：" + request.getParameter("first_name")
				+ "\n" + "  <li><b>姓氏</b>：" + request.getParameter("last_name")
				+ "\n" + "</ul>\n" + "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String title = "Post 实例";
		String docType = "<!DOCTYPE html> \n";
		out.println(docType
				+ "<html>\n"
				+ "<head><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\"><title>"
				+ title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "  <li><b>名字</b>：" + request.getParameter("first_name")
				+ "\n" + "  <li><b>姓氏</b>：" + request.getParameter("last_name")
				+ "\n" + "</ul>\n" + "</body></html>");
	}

}
