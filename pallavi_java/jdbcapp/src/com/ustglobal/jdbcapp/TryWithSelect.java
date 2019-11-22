package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TryWithSelect {
	public static void main(String[] args) {


		try(FileReader reader=new FileReader("db.properties")){

			Properties p=new Properties();
			p.load(reader);
			String url=p.getProperty( "url");
			String sql=p.getProperty("select");

			Class.forName(p.getProperty( "driver"));

			try(Connection conn=DriverManager.getConnection(url, p);
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql)) {

				while(rs.next()) {
					System.out.println("id"+rs.getInt("id"));
					System.out.println("name"+rs.getString("name"));
					System.out.println("sal"+rs.getInt("sal"));
					System.out.println("gender"+rs.getString("gender"));
				}

			}


		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}

