package Java;

public class nullpoint_exception {

	public static void main(String[] args) {
		try {
String name=null;
System.out.println("Length is: "+name.length());
		}
		catch(Exception e) {
			System.out.println("string is null: "+e);
		}
	}

}
