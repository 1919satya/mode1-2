package com.hcl.java;
/**
 * mainmethod.
 * @author coalesce user sai.
 *
 */

public class ArrayDemo1 {
  /**
   * memory main.
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
     * main function is Arry.
     */
    int[] a = new int[] {12,3,55,2,89,76};
    System.out.println("Elements of array are");
    // for(int i=0;i<a.length;i++){
    // System.out.println(a[i]);
    //}
    for (int i:a) {
      System.out.println(i);
    }
  }
}
