package Com.hcl.Enum;

class Employ{
	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
class Amit extends Employ{

	public Amit(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
class Vinod extends Employ{

	public Vinod(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
public class SupCon {
	public static void main(String[] args) {
		Employ e1=new Amit(1,"Amit",67566);
		Employ e2=new Vinod(3,"Vinod",65473);
		System.out.println(e1);
		System.out.println(e2);
		Employ[] arrEmploy=new Employ[]{e1,e2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
			
		}
		
	}

}

