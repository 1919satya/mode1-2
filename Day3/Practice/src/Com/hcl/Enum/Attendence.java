package Com.hcl.Enum;

public class Attendence {
	public static void display(Object...ob){
		for(Object object:ob){
			System.out.print(object +" ");
		}
	}
	public  static void show(String... name){
		for(String s: name){
			System.out.print(s +"  ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		show();
		show("vizag","pream");
		show("ram","Raju" ,"sai");
		display();
		display(12,"ram",123.4);
	}

}
