package com.ustglobal.webapp.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	
	public FormServlet() {
		
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("service");
		System.out.println("xtra line of code");
		
		ServletContext context=getServletContext();
		String companyName=context.getInitParameter("company-name");
		
		ServletConfig config=getServletConfig();
		String batchName=config.getInitParameter("batch-name");
		
		
		String empName=req.getParameter("empname");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		out.println(" <h1>");
		out.println(empName);
		out.println("</h1>");
		
		out.println(" <h1>");
		out.println(email);
		out.println("</h1>");
		
		out.println(" <h1>");
		out.println(password);
		out.println("</h1>");
		
		out.println("</body>");
		out.println("</html>");
		
		
	}//end of doGet
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}//end of FormServlet 
