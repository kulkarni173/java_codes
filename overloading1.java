package Java;

class Area{
	
	void areaofcircle() {
		int i=100;
		
		double n=3.14*i*i;
		System.out.println(n);
	}
	
	public int rectangle(int i,int j) {
		return 2*i+2*j;
		
	}
	public double triangle(double i,double j) {
		return 0.5*i*j;
	}

}


public class overloading1 {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		int z=a.add(120,450);
	double m=	a.add(30.1,40.5);
	System.out.println("Area of rectangle:"+z);
	System.out.println("Area of triangle:"+m);

	}

}



	


