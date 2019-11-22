package com.ustglobal.jdbcpsm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DynamicSelect {

	public static void main(String[] args) throws ClassNotFoundException  {

		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {

//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url,"root","root");

			String sql="select * from emp where id=?";
			pstmt=conn.prepareStatement(sql);
			
			String eid=args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1, id);
			
			rs=pstmt.executeQuery();

			while(rs.next()) {
				int id1=rs.getInt("id");
				String name1=rs.getString("name");
				int salary1=rs.getInt("salary");
				String gender1=rs.getString("gender");


				System.out.println(id1);
				System.out.println(name1);
				System.out.println(salary1);
				System.out.println(gender1);
			}



		}catch(SQLException e) {
			System.out.println("exception");
			e.printStackTrace();
		}finally {
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

			}catch(SQLException e) {
				e.printStackTrace();
			}

		}



	}

}
