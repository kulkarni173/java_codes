package Java;

// due to ambiguity multiple inheritance not supports in java
// because of function boy is not present so by interface multiple inheritance is possible in java


interface father{
	 abstract void bring();
}
interface mother{
	abstract void bring();
}
class son implements father,mother{
	public void bring() {
		 System.out.println("Bring the water for both mother and father");
	 }
}

public class multiple_inheritance {

	public static void main(String[] args) {
		son s=new son();
		s.bring();

	}

}
