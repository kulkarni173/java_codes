package Java;

import java.util.*;

public class Inheritance {

    class Employee {
        float salary = 40000; 
    }

    class Programmer extends Employee { 
        int bonus = 10000;
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance(); 
        Programmer p = inheritance.new Programmer(); 

        System.out.println("Programmer Salary: " + p.salary); 
        System.out.println("Programmer Bonus: " + p.bonus);
    }
}

