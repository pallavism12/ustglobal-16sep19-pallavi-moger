package com.ustglobal.psm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateC extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie c=new Cookie("name", "Arvika");
		
		resp.addCookie(c);
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>cookie created</h1>");
		
		
	}
}