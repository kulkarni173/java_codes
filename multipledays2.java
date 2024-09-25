package Java;
import java.util.*;
interface sanjivanicoe{
	 abstract void salory();
}
interface sanjivanipoly{
	abstract void salory();
}
class employee implements sanjivanicoe,sanjivanipoly{
	public void salory() {
		System.out.println("Enter the number of working hours in month and salory per working hour");
		Scanner s=new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		int z= x*y;
		System.out.println("Salory per month is: "+z);
	 }
}
public class multipledays2 {

	public static void main(String[] args) {
		employee e=new employee ();
		e.salory();

	}

}
