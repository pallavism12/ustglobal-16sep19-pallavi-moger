package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
public class PropertyInsertQuery {
	public static void main(String[] args) {
				
		Connection conn=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;

		try {
			
			reader=new FileReader("db.properties");
			Properties p=new Properties();
			p.load(reader);
			
			Class.forName(p.getProperty("driver"));

			String url=p.getProperty("url");
			conn=DriverManager.getConnection(url,p);

			String sql=p.getProperty("insert") ;
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

