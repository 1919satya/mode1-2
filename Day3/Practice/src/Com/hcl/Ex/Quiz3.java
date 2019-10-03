package Com.hcl.Ex;
class Employ{
	String name;
	public Employ(String name){
		this.name=name;
	
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
}
class HrEmploy extends Employ{

	public HrEmploy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class JavaEmploy extends Employ{

	public JavaEmploy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
public class Quiz3 {
	public static void main(String[] args) {
		Employ[] arr=new Employ[]{
				new HrEmploy("sagar.."),
				new JavaEmploy("Naga Raju"),
				new HrEmploy("sai.."),
				new JavaEmploy("Rama Raju"),
				new HrEmploy("satya.."),
				new JavaEmploy("Padma Raju"),
				new JavaEmploy("sailu.."),
				new JavaEmploy("Yesh Raj")
		};
		for(Employ employ: arr ){
			if(employ instanceof HrEmploy){
				System.out.println(employ);
			}
		}
	}
}
