package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.*;

import java.util.Properties;


public class PropertySelectQuery {
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		FileReader reader=null;
		
		

		try {
			 reader=new FileReader("db.properties");
			Properties p=new Properties();
			p.load(reader);
			
			Class.forName(p.getProperty("driver"));

			String url=p.getProperty("url");
			conn=DriverManager.getConnection(url,p);

			String sql=p.getProperty("select");
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

