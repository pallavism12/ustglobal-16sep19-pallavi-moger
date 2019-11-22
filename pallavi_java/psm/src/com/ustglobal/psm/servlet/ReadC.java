package com.ustglobal.psm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadC extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Cookie[] c=req.getCookies();
		PrintWriter out=resp.getWriter();
		if(c==null) {
			out.println("<h1 style='color:pink'>cookie not found</h1>");
		}else {
			for(Cookie r:c) {
				String names=r.getName();
				if(names.equals("name")) {
					out.println("<h1> reading name of cookie");
					out.println(r.getValue());
				out.println("</h1>");
				
				}
				
			}
		}
		
	}
}
