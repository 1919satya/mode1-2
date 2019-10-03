package Com.hcl.Ex;

public class Quiz {
	public static void main(String[] args) {
	try {
		int[] a=new int[]{12,5,3};
		a[6]=5/0;
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("arry size is small");
	}catch(ArithmeticException e){
		System.out.println("division by zero is not possible");
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
