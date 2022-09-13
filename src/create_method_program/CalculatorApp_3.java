//TODO:Program for create CALCULATOR APP.....IT IS A EXTRA MODIFIED CALCULATOR(use Scanner class)

package create_method_program;

import java.util.Scanner;

public class CalculatorApp_3 {

    public int addition(int a,int b){

        int sum=a+b;
        return sum;
    }
    public int subtraction(int a,int b){

        int sub=a-b;

        return sub;
    }
    public int multiplication(int a,int b){

        int mul=a*b;
        return mul;
    }
    public double division(double a,double b){

        double div=a/b;
        return div;
    }
    public double modulus(double a,double b){

        double mod=a%b;
        return mod;
    }
    public double percentage(double num,double ratio){

        double total=(num*ratio)/100;
        return total;
    }


    public static void main(String[] args) {

        System.out.println("IT IS A EXTRA MODIFIED CALCULATOR(use Scanner class)......dynamically input data " +"\n");

        //TODO: IT IS A EXTRA MODIFIED CALCULATOR(use Scanner class)

        Scanner OBJECT = new Scanner(System.in);

        System.out.println("Please enter value of a :");
        int a = OBJECT.nextInt();
        System.out.println("Enter value is..." + a + "\n");

        System.out.println("Please enter value of b :");
        int b = OBJECT.nextInt();
        System.out.println("Enter value is..." + b + "\n");

        System.out.println("Please enter value of num :");
        double num = OBJECT.nextInt();
        System.out.println("Enter value is..." + num + "\n");

        System.out.println("Please enter value of ratio :");
        double ratio = OBJECT.nextInt();
        System.out.println("Enter value is..." + ratio + "\n");


        System.out.println("Please enter choice is : 1-Add,2-Sub,3-Mul,4-Div,5-Mod,6-Per");
        int choice = OBJECT.nextInt();

        CalculatorApp_3 obj = new CalculatorApp_3();

        if (choice == 1) {

            int TOTAL = obj.addition(a, b);
            System.out.println("Addition is =" + TOTAL + "\n");
        }
        else if (choice == 2) {

            int TOTAL = obj.subtraction(a, b);
            System.out.println("Subtraction is =" + TOTAL + "\n");
        }
        else if (choice == 3) {

            int TOTAL = obj.multiplication(a,b);
            System.out.println("Multiplication is =" + TOTAL + "\n");
        }
        else if (choice == 4) {

            double TOTAL = obj.division(a, b);
            System.out.println("Division is =" + TOTAL + "\n");
        }
        else if (choice == 5) {

            double TOTAL = obj.modulus(a, b);
            System.out.println("Modulus is =" + TOTAL + "\n");
        }
        else if (choice == 6) {

            double TOTAL = obj.percentage(num,ratio);
            System.out.println("Percentage is =" + TOTAL + "\n");
        }

    }

}