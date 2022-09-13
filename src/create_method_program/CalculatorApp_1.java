//TODO:Program for create CALCULATOR APP ..... IT IS A SIMPLE CALCULATOR (without use Scanner class)

package create_method_program;

import java.util.Scanner;

public class CalculatorApp_1 {

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


        System.out.println("IT IS A SIMPLE CALCULATOR (without use Scanner class)...............already input data" +"\n");

        //TODO: IT IS A SIMPLE CALCULATOR (without use Scanner class)
        CalculatorApp_1 obj = new CalculatorApp_1();
        int SUM = obj.add(3, 8);
        System.out.println("ADDITION IS..." + SUM + "\n");

        int SUB = obj.sub(5, 6);
        System.out.println("SUBTRACTION IS..." + SUB + "\n");

        int MUL = obj.mul(7, 2);
        System.out.println("MULTIPLICATION IS..." + MUL + "\n");

        double DIV = obj.div(1, 5);
        System.out.println("DIVISION IS..." + DIV + "\n");

        double MOD = obj.mod(9, 4);
        System.out.println("MODULUS IS..." + MOD + "\n");

        double Per = obj.per(94, 10);
        System.out.println("PERCENTAGE IS..." + Per + "\n");
    }
}