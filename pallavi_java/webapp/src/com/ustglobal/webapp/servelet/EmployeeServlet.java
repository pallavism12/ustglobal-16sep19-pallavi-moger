package com.ustglobal.webapp.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
	//...............
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			
			String id2=req.getParameter("id");
			int id=Integer.parseUnsignedInt(id2);
			pstmt.setInt(1, id);



			rs=pstmt.executeQuery();
			
			
			
		PrintWriter out=resp.getWriter();
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>id</td>");
			out.println("<td>name</td>");
			out.println("<td>sal</td>");
			out.println("<td>gender</td>");
			out.println("</tr>");
			out.println("</table>");
			

			if(rs.next()) {
				int id1=rs.getInt("id");
				String name1=rs.getString("name");
				int salary1=rs.getInt("sal");
				String gender1=rs.getString("gender");	

				System.out.println(id1);
				System.out.println(name1);
				System.out.println(salary1);
				System.out.println(gender1);


			}
		}catch(Exception e) {
			e.printStackTrace();

		}finally{
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		//...............
		
	}

}
