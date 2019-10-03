package Com.hcl.Enum;

enum Student{
	Anisha,Laksh,Rishib,Satya,Raju
	
}
public class Enum3 {
	public  static void  display(){
		Student[] objStudent=Student.values();
		for(Student Student: objStudent){
			System.out.println(Student);
		}
	}

	public static void main(String[] args) {
		display();
	}
}
