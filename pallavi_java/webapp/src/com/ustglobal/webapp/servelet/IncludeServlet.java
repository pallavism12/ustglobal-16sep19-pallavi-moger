package com.ustglobal.webapp.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1>This is IncludeServlet</h1>");
		
		out.println("</html>");
		out.println("/<body>");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/first");
		dispatcher.include(req, resp);
		
		
		
		
	}
}