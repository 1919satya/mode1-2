package Com.hcl.abs;
 abstract class Animal{
abstract void name();
abstract void type();
	 
 }
 class Lion extends Animal{

	@Override
	void name() {
		System.out.println("Name is Lion...");
		
	}

	@Override
	void type() {
		System.out.println("It is wild animal");
	}
 }
	class Bear extends Animal{

		@Override
		void name() {
		System.out.println("Name is Bear");
		
			
		}

		@Override
		void type() {
System.out.println("It is a carnivorus");			
		}
		
	}
	 
 
public class AbsTest {
	public static void main(String[] args) {
		Animal[] arr=new Animal[]{new Lion(),new Bear() 
				};
		for (Animal animal : arr) {
			animal.name();
			animal.type();
			
		}
	}

}
