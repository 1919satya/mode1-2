package Com.hcl.Ex;
class C1{
	void test(){
		System.out.println("welcome");
	}
}
class C2 extends C1{
	void test(){
		System.out.println("bye....");
	}
}

public class P28 {
	public static void main(String[] args) {
		C2 obj=new C2();
		obj.test();
	
	}

}
