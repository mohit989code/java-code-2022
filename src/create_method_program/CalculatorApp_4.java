//TODO:Program for create CALCULATOR APP....ADVANCE CALCULATOR (using loop)

package create_method_program;

import java.util.Scanner;

public class CalculatorApp_4 {

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

//TODO: ADVANCE CALCULATOR (using loop)

        System.out.println("IT IS A COMPLETED CALCULATOR(use Scanner class)......Press 'Y' Continue the loop AND Press 'N' Stop the loop " +"\n");

        Scanner Result = new Scanner(System.in);

        CalculatorApp_4 obj = new CalculatorApp_4();

        String flag = "Y";

        while (flag.equals("Y")) {

            System.out.println("Please enter value of a :");
            int a = Result.nextInt();
            System.out.println("Enter value is..." + a + "\n");

            System.out.println("Please enter value of b :");
            int b = Result.nextInt();
            System.out.println("Enter value is..." + b + "\n");

            System.out.println("Please enter value of num :");
            double num = Result.nextInt();
            System.out.println("Enter value is..." + num + "\n");

            System.out.println("Please enter value of ratio :");
            double ratio = Result.nextInt();
            System.out.println("Enter value is..." + ratio + "\n");


            System.out.println("Please enter choice is : 1-Add,2-Sub,3-Mul,4-Div,5-Mod,6-Per");
            int choice = Result.nextInt();

            if (choice == 1) {

                int TOTAL = obj.add(a, b);
                System.out.println("Addition is =" + TOTAL + "\n");
            }
            else if (choice == 2) {

                int TOTAL = obj.sub(a, b);
                System.out.println("Subtraction is =" + TOTAL + "\n");
            }
            else if (choice == 3) {

                int TOTAL = obj.mul(a, b);
                System.out.println("Multiplication is =" + TOTAL + "\n");
            }
            else if (choice == 4) {

                double TOTAL = obj.div(a, b);
                System.out.println("Division is =" + TOTAL + "\n");
            }
            else if (choice == 5) {

                double TOTAL = obj.mod(a, b);
                System.out.println("Modulus is =" + TOTAL + "\n");
            }
            else if (choice == 6) {

                double TOTAL = obj.per(num, ratio);
                System.out.println("Percentage is =" + TOTAL + "\n");
            }

           System.out.println("Please press Y to continue Calc or press any button to exit");
            Scanner Result2 = new Scanner(System.in);
            flag = Result2.nextLine();
        }
    }
}
