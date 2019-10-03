package com.hcl.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * main.
 * @author coalesce sai.
 *
 */

public class DateDemo {
  /**
   * main function.
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
     * mainmethod.
     */
    Date dt = new Date();
    System.out.println(dt);
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    System.out.println(sdf.format(dt));
    String strDate = "09/03/2019";
    Date obj;
    try {
      obj = sdf.parse(strDate);
      System.out.println(obj);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
