package Java;
class Parent2{
	public Parent2() {
		System.out.println("In parent class");
	}
	void  show() {
	System.out.println("From parent class");
}}


public class child4 {
	public child4() {
	System.out.println("In child class");}

	void display() {
	System.out.println("From child class");
	}
	
public static void main(String[] args) {
	Parent2 p4=new  child4 ();

}}

