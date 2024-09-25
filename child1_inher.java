package Java;

  class Parent{
	void  show() {
	System.out.println("From parent class");
}}


public class child1_inher extends Parent{
	
	void display() {
	System.out.println("From child class");
	}
	public static void main(String[] args) {
		 
		child1_inher c= new child1_inher();
		c.display();
		c.show();
		
		
		
	}

}
