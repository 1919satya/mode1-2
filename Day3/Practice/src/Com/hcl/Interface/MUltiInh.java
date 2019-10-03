package Com.hcl.Interface;
interface IOne{
	void name();
}
interface ITwo{
	void email();
	
}
class Test implements IOne,ITwo{

	@Override
	public void email() {
		System.out.println("HCl@mail.com");
		
	}

	@Override
	public void name() {
		System.out.println("Company is Hcl");
		
	}
	
}

public class MUltiInh {
	public static void main(String[] args) {
		Test ob=new Test();
		ob.email();
		ob.name();
	}

}
