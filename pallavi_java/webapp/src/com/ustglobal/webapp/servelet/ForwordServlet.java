package com.ustglobal.webapp.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwordServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		Object obj=new Object();
		req.setAttribute("obj", obj);
		
	RequestDispatcher dispatcher=req.getRequestDispatcher("/first");
	//	RequestDispatcher dispatcher=req.getRequestDispatcher("/form");//405 error
		dispatcher.forward(req, resp);
		
		
	}
}
