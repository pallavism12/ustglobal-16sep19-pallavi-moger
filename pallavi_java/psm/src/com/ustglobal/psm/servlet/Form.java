package com.ustglobal.psm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("empname");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");		
		out.println("<body>");	
		
		out.println("<h1>");
		out.println(name);	
		out.println("</h1>");	
		
		out.println("<h1>");
		out.println(email);	
		out.println("</h1>");	
		
		out.println("<h1>");
		out.println(password);	
		out.println("</h1>");
		
		
		out.println("</body>");		
		out.println("</html>");		
		
	}
}
