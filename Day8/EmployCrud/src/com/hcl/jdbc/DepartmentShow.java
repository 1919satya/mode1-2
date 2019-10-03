package com.hcl.jdbc;


	

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	/**
	 * main function.
	 * @author coalesce is sai.
	 *
	 */
	public class DepartmentShow {
	
	  /**
	   * method sai.
	   * @param args is argument.
	   */
	  public static void main(String[] args) {
		
		Connection con=DaoConnection.getConnection();
		String cmd="select * from department";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while (rs.next()) {
				System.out.println("deptno" +rs.getInt("deptno"));
				System.out.println("dname " +rs.getString("dname"));
				System.out.println("loc " +rs.getString("loc"));
				System.out.println("head " +rs.getString("head"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

