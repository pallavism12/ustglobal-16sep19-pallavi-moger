package com.ustglobal.webapp.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCnotextAttributeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context=getServletContext();
		Object obj=context.getAttribute("obj");
		
		Object obj1=req.getAttribute("obj");
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>");
		out.println(obj);
		out.println("</h1>");
		
		out.println("<h1>");
		out.println(obj1);
		out.println("</h1>");
		
	}

}
