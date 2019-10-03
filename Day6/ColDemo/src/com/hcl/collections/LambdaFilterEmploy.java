package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * filter.
 * @author coalesce is sai.
 *
 */

public class LambdaFilterEmploy {
  /**
   * Lambda class.
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
     * main function.
     */
    List<Employ> list = new ArrayList<Employ>();
    list.add(new Employ(1,"ram",35000));
    list.add(new Employ(2,"raju",30000));
    list.add(new Employ(3,"rakhi",29000));
    list.stream().filter(p -> p.basic >= 20000).forEach(x->{
			System.out.println(x);
		});
		System.out.println("names starts with r");
		list.stream().filter(p ->p.name.startsWith("r")).forEach(x ->{
			System.out.println(x);
	});
}
	}

