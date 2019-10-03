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

public class DepartmentInsert {
  /**
   * department.
   * @param args is argument.
   */
  public static void main(String[] args) {
    int deptno;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter department no ");
    deptno = Integer.parseInt(sc.nextLine());
    System.out.println("name of department");
    String dname = sc.nextLine();
    System.out.println("department location");
    String loc = sc.nextLine();
    System.out.println("head is");
    String head = sc.nextLine();
    String cmd = "insert into department values(?,?,?,?)";
    Connection con = DaoConnection.getConnection();
    PreparedStatement pst;
    try {
      pst = con.prepareStatement(cmd);
      pst.setInt(1, deptno);
      pst.setString(2,dname);
      pst.setString(3,loc);
      pst.setString(4,head);
      pst.executeUpdate();
      System.out.println("**** racord inserted***");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

