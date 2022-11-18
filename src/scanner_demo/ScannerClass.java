package scanner_demo;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        //STEP 1: Create class and oject
        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter your name :");
        String Name=obj.nextLine(); //it reads string input
        System.out.println("Enter Name Is :" +Name);

        System.out.println("Please enter your age :");
        int Age= obj.nextInt(); //it reads int input
        System.out.println("Enter Age Is :" +Age);

        System.out.println("Please enter product price :");
        double Price=obj.nextDouble(); //it reads double input
        System.out.println("Enter Price Is :" +Price);
    }
}
