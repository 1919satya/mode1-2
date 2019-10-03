package com.hcl.collections;
 interface IHello{
	 void sayHello();
 }
 interface ICalc{
	 int calc(int a,int b);
 }
public class Lambda2 {
	public static void main(String[] args) {
		IHello h1= () ->{
			System.out.println("hello from ram");
		};
		IHello h2= () ->{
			System.out.println("hello from sai");
		};
		IHello h3= () ->{
			System.out.println("hello from raju");
		};
		IHello[] arr=new IHello[]{h1,h2,h3};
		for (IHello iHello : arr) {
			iHello.sayHello();
			
		}
		ICalc ad1=(a,b)->{
			System.out.println("sum");
			return a+b;
		};
		ICalc ad2=(a,b) ->(a-b);
		ICalc ad3=(a,b) ->(a*b);
		
		System.out.println(ad1.calc(12,5));
		System.out.println(ad2.calc(5, 3));
		System.out.println(ad3.calc(44, 34));
	//	h1.sayHello();
	//	h2.sayHello();
	//	h3.sayHello();
	}

}
