package Java;
public class Exception_Handling {

	public static void main(String[] args) {
	int i=100;
	int j=0;
	try {
		int k=i/j;
		System.out.println("Division is: "+k);
	}
	catch(Exception e) {
		System.out.println("No number is divisible by zero"+e);
	}
int l=i+j;
System.out.println("Addition is: "+l);
	}}



