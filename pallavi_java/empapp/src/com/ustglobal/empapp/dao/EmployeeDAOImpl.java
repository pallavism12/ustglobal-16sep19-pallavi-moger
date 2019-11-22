package com.ustglobal.empapp.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;
import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			// 1. load the driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);

			//2. get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);

			//3. issue sql query
			stmt=conn.createStatement();
			String sql="select * from employee_info";
			rs=stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result=new ArrayList<EmployeeBean>();
			while(rs.next()) {

				EmployeeBean bean=new EmployeeBean();

				int id=rs.getInt("id");
				bean.setId(id);

				String name=rs.getString("name");
				bean.setName(name);

				int sal=rs.getInt("sal");
				bean.setSal(sal);

				String gender=rs.getString("gender");//"gender"
				bean.setGender(gender);

				result.add(bean);
			}
			return result;
		}catch(SQLException e){
			e.printStackTrace();
			return null;

		}finally {
			//5. close all JDBC object
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();


			}
		}//end of finally

	}
	//method:
	public EmployeeBean searchEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info where id=?";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;

		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			conn=DriverManager.getConnection(url);
			stmt=conn.prepareStatement(sql) ;
			stmt.setInt(1, id);
			rs=stmt.executeQuery();

			if(rs.next()) {

				EmployeeBean bean=new EmployeeBean();

				int id1=rs.getInt("id");
				bean.setId(id1);

				String name=rs.getString("name");
				bean.setName(name);

				int sal=rs.getInt("sal");
				bean.setSal(sal);

				String gender=rs.getString("gender");//"gender"
				bean.setGender(gender);


				return bean;
			}else {
				return null;
			}

		}catch(SQLException e){
			e.printStackTrace();
			return null;

		}finally {
			//5. close all JDBC object
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}//end of finally
	}
}
