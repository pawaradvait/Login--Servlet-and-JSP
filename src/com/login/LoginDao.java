package com.login;

import java.sql.*;

public class LoginDao {

	String sql ="select * from login where username=? and password=?";
	String insert = "insert into login values(?,?)";
	public boolean check(String username,String password)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","springstudent","springstudent");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, username);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
		  return true;
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
				
				return false;
	}
	
	public boolean createUser(String username,String password) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","springstudent","springstudent");
			PreparedStatement st = con.prepareStatement(insert);
			st.setString(1, username);
			st.setString(2, password);
			int row =st.executeUpdate();
			System.out.println(row);
			if(row>=1) {
				return true;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}
	
}
