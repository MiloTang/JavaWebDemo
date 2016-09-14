package com.tnoob.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MyCookie
 */
@WebServlet("/MyCookie")
public class MyCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyCookie() {
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
		/*
		 * public void setDomain(String pattern)
		 * 
		 * 该方法设置 cookie 适用的域，例如 w3cschool.cc。
		 * 
		 * public String getDomain()
		 * 
		 * 该方法获取 cookie 适用的域，例如 w3cschool.cc。
		 * 
		 * public void setMaxAge(int expiry)
		 * 
		 * 该方法设置 cookie 过期的时间（以秒为单位）。如果不这样设置，cookie 只会在当前 session 会话中持续有效。
		 * 
		 * public int getMaxAge()
		 * 
		 * 该方法返回 cookie 的最大生存周期（以秒为单位），默认情况下，-1 表示 cookie 将持续下去，直到浏览器关闭。
		 * 
		 * public String getName()
		 * 
		 * 该方法返回 cookie 的名称。名称在创建后不能改变。
		 * 
		 * public void setValue(String newValue)
		 * 
		 * 该方法设置与 cookie 关联的值。
		 * 
		 * public String getValue()
		 * 
		 * 该方法获取与 cookie 关联的值。
		 * 
		 * public void setPath(String uri)
		 * 
		 * 该方法设置 cookie 适用的路径。如果您不指定路径，与当前页面相同目录下的（包括子目录下的）所有 URL 都会返回 cookie。
		 * 
		 * public String getPath()
		 * 
		 * 该方法获取 cookie 适用的路径。
		 * 
		 * public void setSecure(boolean flag)
		 * 
		 * 该方法设置布尔值，表示 cookie 是否应该只在加密的（即 SSL）连接上发送。
		 * 
		 * public void setComment(String purpose)
		 * 
		 * 设置cookie的注释。该注释在浏览器向用户呈现 cookie 时非常有用。
		 * 
		 * public String getComment()
		 * 
		 * 获取 cookie 的注释，如果 cookie 没有注释则返回 null。
		 */

		Cookie name = new Cookie("name", URLEncoder.encode(
				request.getParameter("name"), "utf-8"));
		Cookie url = new Cookie("url", request.getParameter("url"));
		name.setMaxAge(60 * 60 * 24);
		url.setMaxAge(60 * 60 * 24);
		response.addCookie(name);
		response.addCookie(url);
		
		response.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = response.getWriter();
		String title = "设置 Cookie 实例";
		String docType = "<!DOCTYPE html>\n";
		out.println(docType +
		        "<html>\n" +
		        "<head><title>" + title + "</title></head>\n" +
		        "<body bgcolor=\"#f0f0f0\">\n" +
		        "<h1 align=\"center\">" + title + "</h1>\n" +
		        "<ul>\n" +
		        "  <li><b>站点名：</b>："
		        + request.getParameter("name") + "\n</li>" +
		        "  <li><b>站点 URL：</b>："
		        + request.getParameter("url") + "\n</li>" +
		        "</ul>\n" +
		        "</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
