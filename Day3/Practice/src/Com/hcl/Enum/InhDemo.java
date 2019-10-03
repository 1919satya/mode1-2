package Com.hcl.Enum;

class First{
	public void show(){
		System.out.println("Show the method from class First.. ");
		
	}}
	class Second extends First{
		public void show(){
			super.show();       //super constructor
			System.out.println("show the class second..");
		}
	}

public class InhDemo {
	public static void main(String[] args) {
		Second obj=new Second();
		obj.show();
		
		First obj1=new Second();
		obj1.show();
		
		First ob1=new First();
		Second ob2=new Second();
		
		First f1=(First)ob2;
		f1.show();
		
		First f2=(Second)ob2;
		f2.show();
		
		
	}

}
