package Java;

public class arrayindexoutofbound {

	public static void main(String[] args) {
		try {
		int a[]=new int [5];
		System.out.println("Array element is: "+a[5]);
		}
		catch(Exception e) {
			System.out.println("array size is smaller: "+e);
		}
	}

}
