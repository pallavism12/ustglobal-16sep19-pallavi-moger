package com.ustglobal.psm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		ServletContext context=getServletContext();
		String cn=context.getInitParameter("cn");
		
		ServletConfig config=getServletConfig();
		String bn=getInitParameter("bn");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		out.println("<html>");
		out.println("<body>");
		
		
		Date date=new Date();
		
		out.println("<h1  style ='color:Red'>date and time</h1>");
		out.println("<h1>");
		out.println(date.toString());
		out.println("<h1>");
		
		out.println("<h2>");
		out.println(cn);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(bn);
		out.println("</h2>");
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
