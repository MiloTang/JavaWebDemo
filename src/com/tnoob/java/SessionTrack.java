package com.tnoob.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTrack
 * 
 * public Object getAttribute(String name)
 * 
 * 该方法返回在该 session 会话中具有指定名称的对象，如果没有指定名称的对象，则返回 null。
 * 
 * public Enumeration getAttributeNames()
 * 
 * 该方法返回 String 对象的枚举，String 对象包含所有绑定到该 session 会话的对象的名称。
 * 
 * public long getCreationTime()
 * 
 * 该方法返回该 session 会话被创建的时间，自格林尼治标准时间 1970 年 1 月 1 日午夜算起，以毫秒为单位。
 * 
 * public String getId()
 * 
 * 该方法返回一个包含分配给该 session 会话的唯一标识符的字符串。
 * 
 * public long getLastAccessedTime()
 * 
 * 该方法返回客户端最后一次发送与该 session 会话相关的请求的时间自格林尼治标准时间 1970 年 1 月 1 日午夜算起，以毫秒为单位。
 * 
 * public int getMaxInactiveInterval()
 * 
 * 该方法返回 Servlet 容器在客户端访问时保持 session 会话打开的最大时间间隔，以秒为单位。
 * 
 * public void invalidate()
 * 
 * 该方法指示该 session 会话无效，并解除绑定到它上面的任何对象。
 * 
 * public boolean isNew()
 * 
 * 如果客户端还不知道该 session 会话，或者如果客户选择不参入该 session 会话，则该方法返回 true。
 * 
 * public void removeAttribute(String name)
 * 
 * 该方法将从该 session 会话移除指定名称的对象。
 * 
 * public void setAttribute(String name, Object value)
 * 
 * 该方法使用指定的名称绑定一个对象到该 session 会话。
 * 
 * public void setMaxInactiveInterval(int interval)
 * 
 * 该方法在 Servlet 容器指示该 session 会话无效之前，指定客户端请求之间的时间，以秒为单位。
 * 
 * 
 */
@WebServlet("/SessionTrack")
public class SessionTrack extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionTrack() {
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
		HttpSession session = request.getSession(true);
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
	    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	
		String title = "Servlet Session 实例";
		Integer visitCount = new Integer(0);
		String visitCountKey = new String("visitCount");
		String userIDKey = new String("userID");
		String userID = new String("Tnoob");
		if (session.isNew()){
			title = "Servlet Session 实例";
		 	session.setAttribute(userIDKey, userID);
		} else {
		 	visitCount = (Integer)session.getAttribute(visitCountKey);
		 	visitCount = visitCount + 1;
		 	userID = (String)session.getAttribute(userIDKey);
		}
		session.setAttribute(visitCountKey,  visitCount);
	
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		String docType = "<!DOCTYPE html>\n";
		out.println(docType +
		        "<html>\n" +
		        "<head><title>" + title + "</title></head>\n" +
		        "<body bgcolor=\"#f0f0f0\">\n" +
		        "<h1 align=\"center\">" + title + "</h1>\n" +
		         "<h2 align=\"center\">Session 信息</h2>\n" +
		        "<table border=\"1\" align=\"center\">\n" +
		        "<tr bgcolor=\"#949494\">\n" +
		        "  <th>Session 信息</th><th>值</th></tr>\n" +
		        "<tr>\n" +
		        "  <td>id</td>\n" +
		        "  <td>" + session.getId() + "</td></tr>\n" +
		        "<tr>\n" +
		        "  <td>创建时间</td>\n" +
		        "  <td>" +  df.format(createTime) + 
		        "  </td></tr>\n" +
		        "<tr>\n" +
		        "  <td>最后访问时间</td>\n" +
		        "  <td>" + df.format(lastAccessTime) + 
		        "  </td></tr>\n" +
		        "<tr>\n" +
		        "  <td>用户 ID</td>\n" +
		        "  <td>" + userID + 
		        "  </td></tr>\n" +
		        "<tr>\n" +
		        "  <td>访问统计：</td>\n" +
		        "  <td>" + visitCount + "</td></tr>\n" +
		        "</table>\n" +
		        "</body></html>");
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
