package com.hcl.java;
/**
 * package of class.
 * @author coalesce user sai.
 *
 */

public class ArrayDemo {
  /**
   * ArryDemo is in main memory.
   * @param args of argument.
   */
  public static void main(String[] args) {
    /**
    * void main function.
    */
    String[] names = new String[]{
      "keerthana","Rishab","Sai","Laksh","Anisha"};
    for (String string : names) {
      System.out.println(string);
    }
  }

}
