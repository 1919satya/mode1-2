package Com.hcl.abs;
abstract class Employ{
	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
class Janani extends Employ{

	public Janani(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
class Raghu extends Employ{

	public Raghu(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

public class AbsCon {
	public static void main(String[] args) {
		Employ ob1=new Janani(1,"janai",56473);
		Employ ob2=new Raghu(2,"raghu",45674);
		
		Employ[] arr =new Employ[]{ob1,ob2};
		for (Employ employ : arr) {
			System.out.println();
			
		}
	}

}
