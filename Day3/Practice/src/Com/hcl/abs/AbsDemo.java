package Com.hcl.abs;

abstract class Training{
	abstract void name();
	abstract void email();
	
}
class Anubhav extends Training{

	@Override
	void name() {
	System.out.println("Name is Anubhav...");
		
	}

	@Override
	void email() {
System.out.println("Anubhav1818@gmail.com");
		
	}
	
}
class SaiKrishna extends Training{

	@Override
	void name() {
		System.out.println("Name is SaiKrishna..");
		
	}

	@Override
	void email() {
	System.out.println("sai1919@gmail.com");	
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Training t1=new Anubhav();
		Training t2=new SaiKrishna();
		
		Training[] arr=new Training[]
				{
				new Anubhav(),new SaiKrishna()};
	
	for(Training t:arr){
	t.name();
	t.email();
	}

	}
}
