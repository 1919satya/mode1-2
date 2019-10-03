package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * main function.
 * @author coalesce is sai. 
 *
 */
public class DepartmentDelete {
  /**
   * department.
   * @param args is argument.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int deptno;
    System.out.println("enter department no ");
    deptno = sc.nextInt();
    String cmd = "delete from department where deptno=?";
    Connection con = DaoConnection.getConnection();
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1,deptno);
      pst.executeUpdate();
      System.out.println("*** record deleted***");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

