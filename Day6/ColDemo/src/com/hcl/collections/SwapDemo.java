package com.hcl.collections;

class Data<T>{
	public void swap(T x,T y){
		T t;
		t=x;
		x=y;
		y=t;
		System.out.println("X value "+x+"Y value "+y);
		
	}
}
public class SwapDemo {
public static void main(String[] args) {
	Data ob=new Data();
	int x,y;
	x=12;
	y=13;		
	ob.swap(x, y);
	double b1=12.5,b2=67.55;
	ob.swap(b1,b2);
	String s1="hello",s2="world";
	ob.swap(s1, s2);
	boolean f1=true,f2=false;
	ob.swap(f1,f2);
}
}
