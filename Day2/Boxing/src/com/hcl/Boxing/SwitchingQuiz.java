package com.hcl.Boxing;

public class SwitchingQuiz {
	public void show(int x){
switch(x){
case 1:
System.out.println("Hi 1");
break;
case 2:
	System.out.println("Bye 2");
	break;
case 3:
	System.out.println("hello 1");
case 4:
	System.out.println("hai ");
	
}

	}
	public static void main(String[] args) {
	SwitchingQuiz obj=new SwitchingQuiz();
	obj.show(3);
	}
}
