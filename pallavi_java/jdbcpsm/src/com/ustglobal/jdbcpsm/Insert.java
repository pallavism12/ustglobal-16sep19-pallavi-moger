package com.ustglobal.jdbcpsm;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;


public class Insert {

	public static void main(String[] args) throws ClassNotFoundException  {

		Connection conn=null;
		Statement stmt=null;

		try {

			//			Driver driver=new Driver();
			//			DriverManager.registerDriver(driver);

			Class.forName("com.mysql.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url,"root","root");

			String sql="insert into emp values(4,'arvika',40000,'f')";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql);
			System.out.println("inserted....");

		}catch(SQLException e) {
			System.out.println("exception");
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}

		}



	}

}