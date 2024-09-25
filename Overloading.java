package Java;

class Addition{
	
	  void add() {
		int i=10;
		int j=20;
		int c= i+j;
		System.out.println("Addition is:"+c);
	}
	
	public int add(int i,int j) {
		return i+j;
		
	}
	public double add(double i,double j) {
		return i+j;
	}

}


public class Overloading {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		int x=a.add(12,45);
	double y=	a.add(2.8,4.5);
	System.out.println("Addition is:"+x);
	System.out.println("Addition is:"+y);

	}

}
