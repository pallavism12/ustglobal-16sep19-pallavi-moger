package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.*;

import java.util.Properties;

public class TryWithUpdate {
	public static void main(String[] args) {


		try(FileReader reader=new FileReader("db.properties")){

			Properties p=new Properties();
			p.load(reader);
			String url=p.getProperty( "url");
			String sql=p.getProperty("update");

			Class.forName(p.getProperty( "driver"));

			try(Connection conn=DriverManager.getConnection(url, p);
					PreparedStatement pstmt=conn.prepareStatement(sql) )
			{

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
				System.out.println(count+"updated");

			}


		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}



