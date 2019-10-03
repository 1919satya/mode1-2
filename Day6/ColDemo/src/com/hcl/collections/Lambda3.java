package com.hcl.collections;

@FunctionalInterface
interface ICtoF {
	 double calc(double c);
}
/**
 * 
 * @author coalesce
 *
 */
public class Lambda3 {
	/**
	 * Lambda class.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * main function.
		 */
		ICtoF cf=(c)->{
			double f=((9*c)/5)+32;
			return f;
		};
		ICtoF k1=(c)->{
			double k=c+273;
			return k;
	};
	System.out.println(cf.calc(37));
	System.out.println(k1.calc(45));
	}
}
