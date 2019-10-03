package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShow {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
				"root","root");
		//System.out.println("connected");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employ");
		while(rs.next()){
			System.out.println("Empno "+ rs.getInt("empno"));
			System.out.println("name is "+rs.getString("name"));
			System.out.println("department is"+rs.getString("dept"));
			System.out.println("designation is"+rs.getString("desig"));
			System.out.println("basic is"+rs.getDouble("Basic"));
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
