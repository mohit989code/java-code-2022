//TODO:Program for create CALCULATOR APP.... IT IS A MODIFIED CALCULATOR(use Scanner class)

package create_method_program;

import java.util.Scanner;

public class CalculatorApp_2 {

    public int add(int a, int b) {

        int total = a + b;
        return total;
    }

    public int sub(int a, int b) {

        int total = a - b;
        return total;
    }

    public int mul(int a, int b) {

        int total = a * b;
        return total;
    }

    public double div(double a, double b) {

        double total = a / b;
        return total;
    }

    public double mod(double a, double b) {

        double total = a % b;
        return total;
    }
    public double per(double num,double ratio){

        double total=(num*ratio)/100;
        return total;
    }


    public static void main(String[] args) {

        System.out.println("IT IS A MODIFIED CALCULATOR(use Scanner class)" +"\n");

        //TODO:IT IS A MODIFIED CALCULATOR(use Scanner class)

        Scanner scannerclass = new Scanner(System.in);

        System.out.println("Please enter value of a :");
        int a = scannerclass.nextInt();
        System.out.println("Enter value is..." + a + "\n");

        System.out.println("Please enter value of b :");
        int b = scannerclass.nextInt();
        System.out.println("Enter value is..." + b + "\n");

        System.out.println("Please enter value of num :");
        double num = scannerclass.nextDouble();
        System.out.println("Enter value is..." + num + "\n");

        System.out.println("Please enter value of ratio :");
        double ratio = scannerclass.nextDouble();
        System.out.println("Enter value is..." + ratio + "\n");


        CalculatorApp_2 obj1 = new CalculatorApp_2();

        int TOTAL_add = obj1.add(a,b);
        System.out.println("Addition is =" + TOTAL_add + "\n");

        int TOTAL_sub = obj1.sub(a, b);
        System.out.println("Subtraction is =" + TOTAL_sub + "\n");

        int TOTAL_mul = obj1.mul(a, b);
        System.out.println("Multiplication is =" + TOTAL_mul + "\n");

        double TOTAL_div = obj1.div(a, b);
        System.out.println("Division is =" + TOTAL_div + "\n");

        double TOTAL_mod = obj1.mod(a, b);
        System.out.println("Modulus is =" + TOTAL_mod + "\n");

        double TOTAL_per = obj1.per(num, ratio);
        System.out.println("PERCENTAGE is =" + TOTAL_per + "\n");

    }
}