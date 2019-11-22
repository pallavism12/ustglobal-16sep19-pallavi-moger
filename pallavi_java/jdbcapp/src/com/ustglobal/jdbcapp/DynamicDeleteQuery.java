package com.ustglobal.jdbcapp;


import java.sql.*;
public class DynamicDeleteQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="delete from employee_info where id=? ";
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {
			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);

			String eid=args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1, id);

			int count=pstmt.executeUpdate();
			System.out.println(count+" deleted");


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

			}catch(Exception e) {
				e.printStackTrace();
			}

		}
	}

}

