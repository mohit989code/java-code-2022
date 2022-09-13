//TODO:Program for use input parameter methods

package assignment_for_use_input_parameter_methods_day_17;

public class CalciWithInput {

    public void add(int a,int b){

        int result=a+b;
        System.out.println("ÄDDITION OF NUMBER IS....." +result);
    }
    public void sub(int a,int b){

        int result=a-b;
        System.out.println("SUBTRACTION OF NUMBER IS....." +result);
    }
    public void mul(int a,int b){

        int result=a*b;
        System.out.println("MULTIPLICATION OF NUMBER IS....." +result);
    }
    public void div(int a,int b){

        double result=(double) a/b;
        System.out.println("DIVISION OF NUMBER IS....." +result);
    }
    public void mod(int a,int b){

        double result=(double) a%b;
        System.out.println("DIVISION OF NUMBER IS....." +result);
    }


    public static void main(String[] args) {
        CalciWithInput cal=new CalciWithInput();
        cal.add(6,8);
        cal.sub(3,7);
        cal.mul(8,7);
        cal.div(4,2);
        cal.mod(5,2);
    }
}
