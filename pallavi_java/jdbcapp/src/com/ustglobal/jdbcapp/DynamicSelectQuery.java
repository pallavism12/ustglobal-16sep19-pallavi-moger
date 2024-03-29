package com.ustglobal.jdbcapp;
import java.sql.*;
public class DynamicSelectQuery {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);

			String eid=args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1, id);



			rs=pstmt.executeQuery();

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
	}

}
