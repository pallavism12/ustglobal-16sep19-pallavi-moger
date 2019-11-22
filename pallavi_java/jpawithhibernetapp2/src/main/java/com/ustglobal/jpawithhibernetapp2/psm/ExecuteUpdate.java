package com.ustglobal.jpawithhibernetapp2.psm;
import java.sql.*;
public class ExecuteUpdate {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="update employee set name=?,sal=?,gender=? where id=? ";
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {
			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);

			String eid=args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(4, id);

			String name=args[1];
			pstmt.setString(1, name);

			String salary=args[2];
			int sal=Integer.parseInt(salary);
			pstmt.setInt(2, sal);

			String gender=args[3];
			pstmt.setString(3, gender);



			int count=pstmt.executeUpdate();
			System.out.println(count+" updated");


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


