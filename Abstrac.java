package Java;


abstract class Bank{
	
	
	void info() {
		
		
		String y="Abhishek";
	       System.out.println("name:Abhishek\nmob.number:9860104987\nadhhar number:431172903985\nadress:Kopargaon");
		
	}
	abstract void deposit() ;
	
	abstract void withdraw() ;
	abstract void checkbal() ;
	
}
class saving extends Bank{
	void deposit() {
		System.out.println("Rs:50000 deposited in saving account");
	}
	
	 void withdraw() {
		 
		 System.out.println("Rs:5000 withdraw from saving account");
	 };
	 void checkbal() {
		 System.out.println("Rs: 2500000 is availablei in saving account");
	 };
}
class current extends Bank{
	void deposit() {
		System.out.println("Rs:2000000 deposited in current account");
	}
	
	 void withdraw() {
		 
		 System.out.println("Rs:40000 withdraw from current account");
	 };
	 void checkbal() {
		 System.out.println("Rs: 50000000 is available in current account");
	 };
	
}

public class Abstrac {

	public static void main(String[] args) {
		Bank b= new saving ();
		b.info();
		b.deposit();
		b.withdraw() ;
		b.checkbal() ;
		Bank b1= new saving ();
		
		b1.deposit();
		b1.withdraw() ;
		b1.checkbal() ;

	}

}
