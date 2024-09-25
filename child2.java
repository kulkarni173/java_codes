package Java;
class Parent1{
	public Parent1() {
		System.out.println("In parent class");
	}
	void  show() {
	System.out.println("From parent class");
}}
public class child2 {
	public child2() {
	System.out.println("In child class");}

	void display() {
	System.out.println("From child class");
	}
	public static void main(String[] args) {
	child2 c2= new Parent1 ();
     c2.show;
     c2.display;     //it shows the error because parents constructor not acces childs function
	}

}
