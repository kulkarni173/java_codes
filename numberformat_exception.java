package Java;

public class numberformat_exception {

	public static void main(String[] args) {
	try {	String num="Abhi";
		int i=Integer.parseInt(num);
		System.out.println(i);
	}
	catch(Exception e){
		System.out.println("There is no numbers present in string: "+e);
		
	}
	}

}
