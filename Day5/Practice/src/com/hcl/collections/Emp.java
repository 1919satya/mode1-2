package com.hcl.collections;
/**
 * mainmethod.
 * @author coalesce is sai.
 *
 */

public class Emp implements Comparable {
  /**
   * implement to Emp.
   */
  int empno;
  String name;
  double basic;
  /**
   * String name.
   */
  
  public Emp(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
  
  @Override
public String toString() {
    /**
     * go to the string.
     */
    return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  
  @Override
public int compareTo(Object o) {
    /**
     * main method.
     */
    Emp e = (Emp)o;
    return e.name.compareTo(name);
  }
}
