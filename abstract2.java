package Java;
import java.util.*;
interface shape{
	
	
	 abstract void calarea();
	 abstract void getinput();
}
 class circle implements shape{
	 double r,c;
	 public void getinput() { System.out.println("Enter the radius");
		 Scanner s=new Scanner (System.in);
		  r=s.nextInt();
}
	 
	public  void calarea() {
		   c=3.14*r*r;
		  System.out.println("area of circle is: "+c);
	  }
 }
 
 class traingle implements shape {
	 double b,h,c;
	public void getinput() {System.out.println("Enter the  base and height");
		 Scanner s=new Scanner (System.in);
		  b=s.nextDouble();
		  h=s.nextDouble();
		  
	 }
		 
	 
	public void calarea() {
		  c=0.5*b*h;
		 System.out.println("area of triangle is: "+c);
	 }
 }
 class rectangle implements shape{
	 double l, b,c;
  public void getinput() {System.out.println("Enter the  length and breadth");
	 Scanner s=new Scanner (System.in);
	  l=s.nextDouble();
	  b=s.nextDouble();
	  
 }
	 
	 
	public void calarea() {
		  c=2*l+2*b;
		 System.out.println("area of rectangle is: "+c); 
	 }
 }



public class abstract2 {

	public static void main(String[] args) {
  shape p=new circle ();
  p.getinput();
  p.calarea();
  
  shape p1=new  traingle ();
  p1.getinput();
  p1.calarea();
  shape p2=new  rectangle ();
  p2.getinput();
  p2.calarea();

	}

}
