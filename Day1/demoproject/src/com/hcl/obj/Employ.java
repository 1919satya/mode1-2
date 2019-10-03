package com.hcl.obj;

public class Employ {
	int empno;
	String name;
	double basic;
	
	public Employ[] showEmploy(){
		Employ[] arrEmploy=new Employ[3];
		arrEmploy[0]=new Employ();
		arrEmploy[0].empno=1;
		arrEmploy[0].name="SatyaSai";
		arrEmploy[0].basic=83444;
		
		arrEmploy[1]=new Employ();
		arrEmploy[1].empno=2;
        arrEmploy[1].name="Rishib";
        arrEmploy[1].basic=9987;
        
        arrEmploy[2]=new Employ();
        arrEmploy[2].empno=3;
        arrEmploy[2].name="Raju";
        arrEmploy[2].basic=9876;

        return arrEmploy;
}
public static void main(String[] args) {
	Employ[] result=new Employ().showEmploy();
	for (Employ e:result){
		System.out.println(e.empno +" "+e.name +" "+e.basic);
	}
}
}