package Com.hcl.Interface;
interface IFirst{
	 default void name(){
		 System.out.println("Name From IFirst is...");
	 }
}
interface ISecond{
	default void name(){
		System.out.println("Name From ISecon is...");
	}
	
}
interface IThird{
	 default void name(){
		 System.out.println("Name From IThird is....");
	 }
}
class Demo implements IFirst,ISecond,IThird{

	@Override
	public void name() {
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
		
	}
	
}

public class IntfTest {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.name();
	}

}
