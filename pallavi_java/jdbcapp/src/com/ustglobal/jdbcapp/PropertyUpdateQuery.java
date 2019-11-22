
package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
public class PropertyUpdateQuery {
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

			String sql=p.getProperty( "update");
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

