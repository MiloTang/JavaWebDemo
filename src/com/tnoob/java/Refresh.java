package com.tnoob.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Refresh
 */
@WebServlet("/Refresh")
public class Refresh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Refresh() {
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
		 * String encodeRedirectURL(String url)
		 * 
		 * 为 sendRedirect 方法中使用的指定的 URL 进行编码，或者如果编码不是必需的，则返回 URL 未改变。
		 * 
		 * String encodeURL(String url)
		 * 
		 * 对包含 session 会话 ID 的指定 URL 进行编码，或者如果编码不是必需的，则返回 URL 未改变。
		 * 
		 * boolean containsHeader(String name)
		 * 
		 * 返回一个布尔值，指示是否已经设置已命名的响应报头。
		 * 
		 * boolean isCommitted()
		 * 
		 * 返回一个布尔值，指示响应是否已经提交。
		 * 
		 * void addCookie(Cookie cookie)
		 * 
		 * 把指定的 cookie 添加到响应。
		 * 
		 * void addDateHeader(String name, long date)
		 * 
		 * 添加一个带有给定的名称和日期值的响应报头。
		 * 
		 * void addHeader(String name, String value)
		 * 
		 * 添加一个带有给定的名称和值的响应报头。
		 * 
		 * void addIntHeader(String name, int value)
		 * 
		 * 添加一个带有给定的名称和整数值的响应报头。
		 * 
		 * void flushBuffer()
		 * 
		 * 强制任何在缓冲区中的内容被写入到客户端。
		 * 
		 * void reset()
		 * 
		 * 清除缓冲区中存在的任何数据，包括状态码和头。
		 * 
		 * void resetBuffer()
		 * 
		 * 清除响应中基础缓冲区的内容，不清除状态码和头。
		 * 
		 * void sendError(int sc)
		 * 
		 * 使用指定的状态码发送错误响应到客户端，并清除缓冲区。
		 * 
		 * void sendError(int sc, String msg)
		 * 
		 * 使用指定的状态发送错误响应到客户端。
		 * 
		 * void sendRedirect(String location)
		 * 
		 * 使用指定的重定向位置 URL 发送临时重定向响应到客户端。
		 * 
		 * void setBufferSize(int size)
		 * 
		 * 为响应主体设置首选的缓冲区大小。
		 * 
		 * void setCharacterEncoding(String charset)
		 * 
		 * 设置被发送到客户端的响应的字符编码（MIME 字符集）例如，UTF-8。
		 * 
		 * void setContentLength(int len)
		 * 
		 * 设置在 HTTP Servlet 响应中的内容主体的长度，该方法设置 HTTP Content-Length 头。
		 * 
		 * void setContentType(String type)
		 * 
		 * 如果响应还未被提交，设置被发送到客户端的响应的内容类型。
		 * 
		 * void setDateHeader(String name, long date)
		 * 
		 * 设置一个带有给定的名称和日期值的响应报头。
		 * 
		 * void setHeader(String name, String value)
		 * 
		 * 设置一个带有给定的名称和值的响应报头。
		 * 
		 * void setIntHeader(String name, int value)
		 * 
		 * 设置一个带有给定的名称和整数值的响应报头。
		 * 
		 * void setLocale(Locale loc)
		 * 
		 * 如果响应还未被提交，设置响应的区域。
		 * 
		 * void setStatus(int sc)
		 * 
		 * 为该响应设置状态码。
		 */
		response.setIntHeader("Refresh", 1);
		response.setContentType("text/html;charset=UTF-8");
		Calendar cale = Calendar.getInstance();
		Date tasktime = cale.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowTime = df.format(tasktime);
		PrintWriter out = response.getWriter();
		String title = "自动刷新时间";
		String docType = "<!DOCTYPE html>\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
				+ "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n" + "<p>当前时间是："
				+ nowTime + "</p>\n");
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
