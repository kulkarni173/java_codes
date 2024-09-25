package Java;


	class Parent1{
		public Parent1() {
			System.out.println("In parent class");
		}
		void  show() {
		System.out.println("From parent class");
	}}
	
	
	public class child3  extends Parent1{
		public child3() {
		System.out.println("In child class");}

		void display() {
		System.out.println("From child class");
		}
		
	public static void main(String[] args) {
		child3 c3=new  child3 ();
   
	}}


