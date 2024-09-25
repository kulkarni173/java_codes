  package Java;
  import java.util.*;
  import sy.study;
  import practice.Average_ofarray;
  import practice.Demo2;
  public class pack {
  public static void main(String[] args) {
  int l,b;	
  study s=new study();
  Scanner s1 =new Scanner(System.in);
  System.out.println("Enter the lenght and breadth");
  l=s1.nextInt();
  b=s1.nextInt();
  s.area(l,b); 
  s.display();
  Demo2 d=new Demo2();
  d.down();
  Average_ofarray a= new Average_ofarray();
  a.iku();
  
  
  }}
  
