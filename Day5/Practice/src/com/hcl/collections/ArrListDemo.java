package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * main.
 * @author coalesce sai.
 *
 */

public class ArrListDemo {
  /**
   * main class.
   * @param args argument.
   */
  public static void main(String[] args) {
    /**
     * main method.
     */
    ArrayList lstNames = new ArrayList();
    lstNames.add("anubhav");
    lstNames.add("satya");
    lstNames.add("sai");
    lstNames.add("raju");
    lstNames.add("rakesh");
    System.out.println("names are");
    //for (Object object : lstNames) {
    //System.out.println(object);
    //}
    System.out.println("JDK 1.8");
    lstNames.forEach(System.out::println);
    /* Edit*/
    lstNames.set(2,"pream");
    System.out.println("list after update");
    lstNames.forEach(System.out::println);
    System.out.println("list after removing by index");
    lstNames.remove(1);
    lstNames.forEach(System.out::println);
    System.out.println("list after removing by object");
    lstNames.remove("satya");
    lstNames.forEach(System.out::println);
  }
}
