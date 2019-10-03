package com.hcl.soap;

import java.rmi.RemoteException;

public class MainApplication {
public static void main(String[] args) {
	int result=0;
	int result1=0;
	CalculatorProxy calculatorProxy=new CalculatorProxy();
	try {
		result=calculatorProxy.mul(2, 4);
		result1=calculatorProxy.add(4, 6);
		System.out.println("multiplication of 2 numbers :"+result);
		System.out.println("addition of 2 numbers :"+result1);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
