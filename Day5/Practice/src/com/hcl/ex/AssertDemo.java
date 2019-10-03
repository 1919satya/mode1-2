package com.hcl.ex;
/**
 * main class is management.
 * @author coalesce user is sai.
 *
 */

public class AssertDemo {
  /**
   * class is AssertDemo.
   */
  public void incr() {
    /**
     * method.
     */
    int basic = 30000;
    for (int i = 0;i < 8;i++) {
basic=basic + 4000;
			assert basic <48000;
			System.out.println("salary "+ basic);
		}
	}
	public static void main(String[] args) {
		/**
		 * void method is Assert.
		 */
		new AssertDemo().incr();
	}

}
