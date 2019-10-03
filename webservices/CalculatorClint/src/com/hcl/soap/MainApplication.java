package com.hcl.soap;

import java.rmi.RemoteException;

import com.RishabProxy;
import com.nagendra.NagendraProxy;

public class MainApplication {
public static void main(String[] args) {
	int res=0;
	int res1=0;
	RishabProxy rishabProxy=new RishabProxy();
	NagendraProxy nagendraProxy=new NagendraProxy();
	int result;
	try {
		res=rishabProxy.getSap();
		res1=nagendraProxy.getSap();
		CalculatorProxy calculatorProxy=new CalculatorProxy();
		System.out.println(rishabProxy.getSap());
		System.out.println(nagendraProxy.getSap());
		System.out.println("Details are "+calculatorProxy.add(res1, res));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
