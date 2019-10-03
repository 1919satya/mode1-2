package Com.hcl.Ex;

public class Div {
		
public static void main(String[] args) {
	int a,b,c;
	try {
		a= Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;
		System.out.println("division"+ c);
	} catch(ArithmeticException e){
		System.out.println("division  by zero is not possible");
	} catch(NumberFormatException e){
		System.out.println("string can not be converted to int ");
	}catch (ArrayIndexOutOfBoundsException e){
		System.out.println(" args are not found");
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		System.out.println("program by hcl");
	}
	
}
}
