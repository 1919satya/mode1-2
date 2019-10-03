package Com.hcl.Interface;
interface ITraining{
	void name();
	void email();
	
}
class Hema implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is Hema ..");
		
	}

	@Override
	public void email() {
	System.out.println("1919hema@gmail.com");
		
	}
	
	
}

class Satya implements ITraining{

	@Override
	public void name() {
		System.out.println("Name is Satya...");
		
	}

	@Override
	public void email() {
		System.out.println("1919Saty@gmail.com");
		
	}
	
}
public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arr=new ITraining[]{new Hema(),new Satya()};
		for (ITraining iTraining : arr) {
			iTraining.name();
			iTraining.email();
			
		}
	}

}
