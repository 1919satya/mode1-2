package com.hcl.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * main memory is defined.
 * @author coalesce is sai.
 *
 */
public class SetDemo {
  /**
     * memory is in set demo.
     * @param args hi.
     */
  public static void main(String[] args) {
   /**
    * main method.
    */
    Set s=new LinkedHashSet();
		s.add("vinod");
		s.add("hema");
		s.add("raju");
		s.add("keerthana");
		
		s.add("vinod");
		s.add("hema");
		s.add("raju");
		s.add("keerthana");
		
	  s.add("vinod");
	  s.add("hema");
	  s.add("raju");
	  s.add("keerthana");
	System.out.println("Hashset data");
	s.forEach(System.out::println);
	}
}
