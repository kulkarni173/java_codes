package Java;

import java.util.Scanner;

class A {
    Scanner input = new Scanner(System.in);
    String a=input.nextLine(); 
    
    void show() {
        System.out.println("My name is Abhishek ");
    }
}

class B extends A {
    void disp() {
        System.out.println("Display method in class B");
    }
}

class C extends A {
    void disp() {
        System.out.println("Display method in class C");
    }
}

public class Hirachical_inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        B br = new B();
        br.show();
        br.disp();
        
        C cr2 = new C();
        cr2.show();
        cr2.disp();
        
        input.close();
    }
}
