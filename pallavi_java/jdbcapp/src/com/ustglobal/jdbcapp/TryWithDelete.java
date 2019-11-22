package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.*;

import java.util.Properties;

public class TryWithDelete {
	public static void main(String[] args) {


		try(FileReader reader=new FileReader("db.properties")){

			Properties p=new Properties();
			p.load(reader);
			String url=p.getProperty( "url");
			String sql=p.getProperty("delete");

			Class.forName(p.getProperty( "driver"));

			try(Connection conn=DriverManager.getConnection(url, p);
					PreparedStatement pstmt=conn.prepareStatement(sql) )
			{

				String eid=args[0];
				int id=Integer.parseInt(eid);
				pstmt.setInt(1, id);
				int count=pstmt.executeUpdate();
				System.out.println(count+"deleted");

			}


		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}

