package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * main.
 * @author coalesce sai.
 *
 */

public class ArrEmploy {
  /**
   * arrEmploy is class. 
   * @param args argument.
   */
  public static void main(String[] args) {
    /**
     * main function.
     */
    List lstEmploy = new ArrayList();
    lstEmploy.add(new Employ(1,"anisha",56437));
    lstEmploy.add(new Employ(2,"sai",45378));
    lstEmploy.add(new Employ(3,"ram",34562));
    lstEmploy.add(new Employ(4,"raju",76854));
    lstEmploy.add(new Employ(5,"rajesh",87654));
    for (Object object : lstEmploy) {
      Employ e = (Employ)object;
      System.out.println(e);
    }
  }
}
