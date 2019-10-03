package com.hcl.jdbc;


	import java.sql.Connection;
    import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	

	public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("employ num is");
		empno=sc.nextInt();
		Connection con=DaoConnection.getConnection();
		 String cmd="select * from Employ where empno=?";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("employ name "+rs.getString("name"));
				System.out.println("department is" +rs.getString("dept"));
				System.out.println("designation is"+rs.getString("desig"));
				System.out.println("salary"+rs.getDouble("basic"));
			} else {
				System.out.println("*** record not found ***");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

