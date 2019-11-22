package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
public class PropertyDeleteQuery {
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

			String sql=p.getProperty("delete");
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


