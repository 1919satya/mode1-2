package com.hcl.function;

public class InstanceMain {
public static void main(String[] args) {
	InstanceInterface ins=()->{System.out.println("Hai");
		};
		ins.myInt();
		InstanceMethodRef ins2=new InstanceMethodRef();
		ins=ins2::saySome;
		ins.myInt();
		
} 
}
