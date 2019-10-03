package com.hcl.Boxing;

public class OverLoad {
	public void show(int x){
		System.out.println("show method w.r.t Int"+x);
		
	}
public void show(String x){
	System.out.println("show method w.r.t String"+x);
}
public void show(boolean x){
	System.out.println("show method w.r.t Boolean"+x);
}
public void show(double x){
	System.out.println("show method w.r.t double"+x);
}
public static void main(String[] args) {
	OverLoad obj=new OverLoad();
	obj.show(12);
	obj.show(false);
}
}
