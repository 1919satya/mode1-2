package Com.hcl.Ex;

public class ArrEx {
	public static void main(String[] args) {
		try {
			int[] a=new int[]{12,5};
			a[10]=77;
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("arry size is small");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
