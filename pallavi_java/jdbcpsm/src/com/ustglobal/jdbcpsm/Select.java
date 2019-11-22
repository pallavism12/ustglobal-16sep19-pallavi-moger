package com.ustglobal.jdbcpsm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Select {

	public static void main(String[] args) throws ClassNotFoundException  {

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {

//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url,"root","root");

			String sql="select * from emp";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int salary=rs.getInt("salary");
				String gender=rs.getString("gender");


				System.out.println(id);
				System.out.println(name);
				System.out.println(salary);
				System.out.println(gender);
			}



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
				if(rs!=null) {
					rs.close();
				}

			}catch(SQLException e) {
				e.printStackTrace();
			}

		}



	}

}
