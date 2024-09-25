package Java;
 class bank{
	 int add (int i,int j) {
		 return i+j;
	 }
	 int rot() {
		 return 9;
	 }	 
 }
 class SBI extends bank{
	 int add (int i,int j) {
		 return i+j;
	 }
	 int rot() {
		 return 7;
	 } 
 }
 class BOB extends bank{
	 int add (int i,int j) {
		 return i+j;
	 }
	 int rot() {
		 return 3;
	 }
 }
public class Overriding {
	public static void main(String[] args) {
		bank b=new bank();
		System.out.println(" Addition is: "+b.add(2,4));
		System.out.println(" Rate of intrest for bank: "+b.rot());
		SBI s=new  SBI();
		System.out.println(" Addition is: "+s.add(10,5));
		System.out.println(" Rate of intrest for SBI: "+s.rot());
        BOB B=new BOB();
        System.out.println(" Addition is: "+B.add(16,32));
        System.out.println(" Rate of intrest for BOB: "+B.rot());
	}
}
