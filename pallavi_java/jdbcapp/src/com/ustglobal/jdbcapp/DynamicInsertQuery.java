package com.ustglobal.jdbcapp;
import java.sql.*;
public class DynamicInsertQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into employee_info values (?,?,?,?) ";
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {
			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);

			String eid=args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1, id);

			String name=args[1];
			pstmt.setString(2, name);

			String salary=args[2];
			int sal=Integer.parseInt(salary);
			pstmt.setInt(3, sal);

			String gender=args[3];
			pstmt.setString(4, gender);



			int count=pstmt.executeUpdate();
			System.out.println(count+" inserted");


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

