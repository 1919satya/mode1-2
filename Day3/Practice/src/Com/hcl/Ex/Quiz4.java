package Com.hcl.Ex;

public class Quiz4 {
	public static void main(String[] args) {
		Object[] arr=new Object[]{12,"Welcome",125,"hcl",2,2.4};
	for(Object object: arr){
		if(object instanceof Integer){
			System.out.println(object);
	
		}if(object instanceof String){
			System.out.println(object);
		}if (object instanceof Double){
			System.out.println(object);
		}
			
	}
	}
}
