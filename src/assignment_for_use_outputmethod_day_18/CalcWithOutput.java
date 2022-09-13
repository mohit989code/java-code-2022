//TODO:Program for make a CALCULATOR Use Output Return_type

package assignment_for_use_outputmethod_day_18;

public class CalcWithOutput {

    public int add(int a, int b) {

        int total=a+b;

        return total;
    }
    public int sub(int a, int b) {

        int total=a-b;

        return total;
    }
    public int mul(int a, int b) {

        int total=a*b;

        return total;
    }
    public double div(double a, double b) {

        double total=a/b;

        return total;
    }
    public double mod(double a, double b) {

        double total=a%b;

        return total;
    }

    public static void main(String[] args) {
        CalcWithOutput obj=new CalcWithOutput();

        int output=obj.add(6,9);
        System.out.println("ADDITION IS....."+output);

        int total=obj.sub(12,4);
        System.out.println("SUBTRACTION IS....."+total);

        int result=obj.mul(3,6);
        System.out.println("MULTIPLICATION IS....."+result);

        double conclusion=obj.div(6,10);
        System.out.println("DIVISION IS....."+conclusion);

        double final_result=obj.mod(12,34);
        System.out.println("MODULUS IS....."+final_result);
    }


}
