package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int empno,basic;
	String desig;
	System.out.println("enter employ no ");
	empno=sc.nextInt();
	System.out.println("designation");
	desig=sc.next();
	System.out.println("basic....");
	basic=sc.nextInt();
	String cmd="update employ set Desig=?, basic=? where empno=?";
	Connection con=DaoConnection.getConnection();
	try {
		PreparedStatement pst= con.prepareStatement(cmd);
		pst.setString(1,desig);
		pst.setInt(2,basic);
		pst.setInt(3,empno);
		pst.executeUpdate();
		System.out.println("*** record updated***");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
