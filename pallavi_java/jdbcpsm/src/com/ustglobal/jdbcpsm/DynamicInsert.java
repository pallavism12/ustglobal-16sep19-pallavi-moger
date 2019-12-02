package com.ustglobal.jdbcpsm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DynamicInsert {

	public static void main(String[] args)   {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into emp values(?,?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;

		try {

			//			Driver driver=new Driver();
			//			DriverManager.registerDriver(driver);

			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);


			String eid=args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1, id);

			String name=args[1];
			pstmt.setString(2, name);

			String esalary=args[2];
			int salary=Integer.parseInt(esalary);
			pstmt.setInt(3, salary);

			String gender=args[3];
			pstmt.setString(4, gender);


			int count=pstmt.executeUpdate();
			System.out.println("inserted....");

		}catch(Exception e) {
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
			}catch(Exception e) {
				e.printStackTrace();
			}

		}



	}

}