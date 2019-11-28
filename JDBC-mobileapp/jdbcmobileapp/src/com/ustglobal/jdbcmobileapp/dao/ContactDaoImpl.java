package com.ustglobal.jdbcmobileapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.jdbcmobileapp.dto.ContactBean;

public class ContactDaoImpl implements ContactDAO{
	String url="jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
	String driver="com.mysql.jdbc.Driver";


	@Override
	public List<ContactBean> getAllNames() {

		String sql="select * from contact";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {

			Class.forName(driver);

			conn=DriverManager.getConnection(url);

			stmt=conn.createStatement();

			rs=stmt.executeQuery(sql);

			ArrayList<ContactBean> result=new ArrayList<ContactBean>();

			while(rs.next()) {

				ContactBean bean=new ContactBean();

				String name=rs.getString("name");
				bean.setName(name);

				result.add(bean);
			}
			return result;


		}catch(Exception e) {
			e.printStackTrace();
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

		return null;
	}


	@Override
	public ContactBean searchContact(String name) {

		String sql="select * from contact where name=?";
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;

		try {

			Class.forName(driver);

			conn=DriverManager.getConnection(sql);

			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);

			rs=pstmt.executeQuery();

			if(rs.next()) {

				ContactBean bean=new ContactBean();

				String name1=rs.getString("name");
				bean.setName(name1);

				int number1=rs.getInt("number");
				bean.setNumber(number1);

				String groupname=rs.getString("group_name");
				bean.setGroup_name(groupname);
				return bean;

			}else {
				return null;
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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

		return null;
	}


	@Override
	public int addContact(ContactBean bean) {
		String sql="insert into contact values(?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			
			String name2=bean.getName();
			int number2=bean.getNumber();
			String group_name2=bean.getGroup_name();
			
			Class.forName(driver);

			conn=DriverManager.getConnection(url);

			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, name2);
			pstmt.setInt(2, number2);
			pstmt.setString(3, group_name2);

			

			int count=pstmt.executeUpdate();
			return count;
			
			

		}catch(Exception e) {
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

		return 0;
	}


	@Override
	public int deleteContact(ContactBean be) {
		
		String sql="delete from contact where name=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			
			String name2=be.getName();
			
			Class.forName(driver);

			conn=DriverManager.getConnection(url);

			pstmt=conn.prepareStatement(sql);

			
			
			pstmt.setString(1, name2);
			int count=pstmt.executeUpdate();
			return count;
			
			
		}catch(Exception e) {
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
		
		return 0;
	}


	@Override
	public int editContact(ContactBean bean) {
		
		String sql="update  contact set number=?, group_name=? where name=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			
			String name2=bean.getName();
			int number2=bean.getNumber();
			String group_name2=bean.getGroup_name();
			
			Class.forName(driver);

			conn=DriverManager.getConnection(url);

			pstmt=conn.prepareStatement(sql);

			
			
			pstmt.setString(3, name2);
			pstmt.setInt(1, number2);
			pstmt.setString(2, group_name2);

			
			int count=pstmt.executeUpdate();
			return count;
			
			

		}catch(Exception e) {
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

		return 0;
		
		
	}

}
