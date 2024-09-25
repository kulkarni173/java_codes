package Java;


public class MultipleInheritance {

  
    class A {
        int a, b, c;

        void add() {
            a = 10;
            b = 20;
            c = a + b;
            System.out.println("Sum of two numbers is: " + c);
        }

        void sub() {
            a = 200;
            b = 100;
            c = a - b;
            System.out.println("Subtraction of two numbers is: " + c);
        }
    }

  
    class B extends A {

        void mul() {
            a = 10;
            b = 20;
            c = a * b;
            System.out.println("Multiplication of two numbers is: " + c);
        }

        void div() {
            a = 20;
            b = 10;
            c = a / b;
            System.out.println("Division of two numbers is: " + c);
        }
    }

    
    class C extends B {

        void rem() {
            a = 10;
            b = 3;
            c = a % b;
            System.out.println("Remainder of two numbers is: " + c);
        }
    }

 
    public static void main(String[] args) {
      
        MultipleInheritance outer = new MultipleInheritance();
        C r = outer.new C();

        r.add();
        r.sub();
        r.mul();
        r.div();
        r.rem();
    }
}



