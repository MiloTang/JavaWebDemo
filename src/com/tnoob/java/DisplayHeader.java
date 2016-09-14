package com.tnoob.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayHeader
 */
@WebServlet("/DisplayHeader")
public class DisplayHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayHeader() {
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
		response.setContentType("text/html;charset=UTF-8");
		/*
		 * Cookie[] getCookies()
		 * 
		 * 返回一个数组，包含客户端发送该请求的所有的 Cookie 对象。
		 * 
		 * Enumeration getAttributeNames()
		 * 
		 * 返回一个枚举，包含提供给该请求可用的属性名称。
		 * 
		 * Enumeration getHeaderNames()
		 * 
		 * 返回一个枚举，包含在该请求中包含的所有的头名。
		 * 
		 * Enumeration getParameterNames()
		 * 
		 * 返回一个 String 对象的枚举，包含在该请求中包含的参数的名称。
		 * 
		 * HttpSession getSession()
		 * 
		 * 返回与该请求关联的当前 session 会话，或者如果请求没有 session 会话，则创建一个。
		 * 
		 * HttpSession getSession(boolean create)
		 * 
		 * 返回与该请求关联的当前 HttpSession，或者如果没有当前会话，且创建是真的，则返回一个新的 session 会话。
		 * 
		 * Locale getLocale()
		 * 
		 * 基于 Accept-Language 头，返回客户端接受内容的首选的区域设置。
		 * 
		 * Object getAttribute(String name)
		 * 
		 * 以对象形式返回已命名属性的值，如果没有给定名称的属性存在，则返回 null。
		 * 
		 * ServletInputStream getInputStream()
		 * 
		 * 使用 ServletInputStream，以二进制数据形式检索请求的主体。
		 * 
		 * String getAuthType()
		 * 
		 * 返回用于保护 Servlet 的身份验证方案的名称，例如，"BASIC" 或 "SSL"，如果JSP没有受到保护则返回 null。
		 * 
		 * String getCharacterEncoding()
		 * 
		 * 返回请求主体中使用的字符编码的名称。
		 * 
		 * String getContentType()
		 * 
		 * 返回请求主体的 MIME 类型，如果不知道类型则返回 null。
		 * 
		 * String getContextPath()
		 * 
		 * 返回指示请求上下文的请求 URI 部分。
		 * 
		 * String getHeader(String name)
		 * 
		 * 以字符串形式返回指定的请求头的值。
		 * 
		 * String getMethod()
		 * 
		 * 返回请求的 HTTP 方法的名称，例如，GET、POST 或 PUT。
		 * 
		 * String getParameter(String name)
		 * 
		 * 以字符串形式返回请求参数的值，或者如果参数不存在则返回 null。
		 * 
		 * String getPathInfo()
		 * 
		 * 当请求发出时，返回与客户端发送的 URL 相关的任何额外的路径信息。
		 * 
		 * String getProtocol()
		 * 
		 * 返回请求协议的名称和版本。
		 * 
		 * String getQueryString()
		 * 
		 * 返回包含在路径后的请求 URL 中的查询字符串。
		 * 
		 * String getRemoteAddr()
		 * 
		 * 返回发送请求的客户端的互联网协议（IP）地址。
		 * 
		 * String getRemoteHost()
		 * 
		 * 返回发送请求的客户端的完全限定名称。
		 * 
		 * String getRemoteUser()
		 * 
		 * 如果用户已通过身份验证，则返回发出请求的登录用户，或者如果用户未通过身份验证，则返回 null。
		 * 
		 * String getRequestURI()
		 * 
		 * 从协议名称直到 HTTP 请求的第一行的查询字符串中，返回该请求的 URL 的一部分。
		 * 
		 * String getRequestedSessionId()
		 * 
		 * 返回由客户端指定的 session 会话 ID。
		 * 
		 * String getServletPath()
		 * 
		 * 返回调用 JSP 的请求的 URL 的一部分。
		 * 
		 * String[] getParameterValues(String name)
		 * 
		 * 返回一个字符串对象的数组，包含所有给定的请求参数的值，如果参数不存在则返回 null。
		 * 
		 * boolean isSecure()
		 * 
		 * 返回一个布尔值，指示请求是否使用安全通道，如 HTTPS。
		 * 
		 * int getContentLength()
		 * 
		 * 以字节为单位返回请求主体的长度，并提供输入流，或者如果长度未知则返回 -1。
		 * 
		 * int getIntHeader(String name)
		 * 
		 * 返回指定的请求头的值为一个 int 值。
		 * 
		 * int getServerPort()
		 * 
		 * 返回接收到这个请求的端口号。
		 */
		PrintWriter out = response.getWriter();
		String title = "HTTP Header 请求实例 - 实例";
		String docType = "<!DOCTYPE html> \n";
		out.println(docType + "<html>\n"
				+ "<head><meta charset=\"utf-8\"><title>" + title
				+ "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n"
				+ "<table width=\"100%\" border=\"1\" align=\"center\">\n"
				+ "<tr bgcolor=\"#949494\">\n"
				+ "<th>Header 名称</th><th>Header 值</th>\n" + "</tr>\n");

		Enumeration<String> headerNames = request.getHeaderNames();

		while (headerNames.hasMoreElements()) {
			String paramName = (String) headerNames.nextElement();
			out.print("<tr><td>" + paramName + "</td>\n");
			String paramValue = request.getHeader(paramName);
			out.println("<td> " + paramValue + "</td></tr>\n");
		}
		out.println("</table>\n客户端IP是"+request.getRemoteAddr()+"<br>\n客户端名称是"+request.getRemoteHost()+"</body></html>");

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
