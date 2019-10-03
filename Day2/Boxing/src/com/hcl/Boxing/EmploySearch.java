package com.hcl.Boxing;

public class EmploySearch {
	
	public Employ showEmploy(int empno){
		Employ employ=null;
		if(empno==1){
			employ =new Employ();
			employ.empno=100;
			employ.name="satya";
			employ.basic=8821;
		}
		if(empno==3){
			employ =new Employ();
			employ.empno=200;
			employ.name="pream";
			employ.basic=43516;
			
		}
		return employ;
	}
	public static void main(String[] args) {
		EmploySearch objsearch=new EmploySearch();
		Employ res=objsearch.showEmploy(1);
		if(res!=null){
			System.out.println(res);
		}else{
			System.out.println("Employ not Found...");
		}
		
		
	}

}
