package com.ustglobal.empappexercise.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empappexercise.dto.EmployeeBean;
public class EmployeeDaoImpl implements EmployeeDAO {

	public List<EmployeeBean>  getAllEmployeeData(){

		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info ";

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result =new ArrayList<EmployeeBean>();
			while(rs.next()) {
				EmployeeBean bean =new EmployeeBean();

				int id=rs.getInt("id");
				bean.setId(id);

				String name=rs.getString("name");
				bean.setName(name);

				int sal=rs.getInt("sal");
				bean.setSal(sal);

				String gender=rs.getString("gender");
				bean.setGender(gender);

				result.add(bean );
			}
			return result;



		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
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
			}catch(Exception e) {
				e.printStackTrace();
			}

		}

	}


	public EmployeeBean searchEmployeeData(int id) {

		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info where id=? ";

		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.prepareStatement(sql);

			stmt.setInt(1, id);
			rs=stmt.executeQuery();


			if(rs.next()) {
				EmployeeBean bean =new EmployeeBean();

				int id1=rs.getInt("id");
				bean.setId(id1);

				String name1=rs.getString("name");
				bean.setName(name1);

				int sal1=rs.getInt("sal");
				bean.setSal(sal1);

				String gender1=rs.getString("gender");
				bean.setGender(gender1);

				return bean;
			}else {
				return null;
			}

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
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
			}catch(Exception e) {
				e.printStackTrace();
			}


		}


	}


	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into employee_info values (?,?,?,?) ";
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {
			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, sal);
			pstmt.setString(4, gender);



			int count=pstmt.executeUpdate();
			return count;


		}catch(Exception e) {
			e.printStackTrace();
			return (Integer)null;

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


	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="update  employee_info set name=?,sal=? gender=? where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {
			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);

			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);



			int count=pstmt.executeUpdate();
			return count;


		}catch(Exception e) {
			e.printStackTrace();
			return (Integer)null;

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


	@Override
	public int deleteEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="delete from  employee_info where id=? ";
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {
			Class.forName("com.mysql.jdbc.Driver");


			conn=DriverManager.getConnection(url);


			pstmt=conn.prepareStatement(sql);

			pstmt.setInt(1, id);
			



			int count=pstmt.executeUpdate();
			return count;


		}catch(Exception e) {
			e.printStackTrace();
			return (Integer)null;

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