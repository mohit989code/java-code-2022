//TODO:Write a program to Make a CALCULATOR APP

package create_method_program;

public class Calculator {

    public void add(){
        int a=8,b=16,result;
        result= a+b;
        System.out.println("a AND b ADDITION is :" +result);
    }
    public void sub(){
        int a=8,b=16,result;
        result=a-b;
        System.out.println("a AND b SUBTRACTION is :" +result);
    }
    public void mul(){
        int a=8,b=16,result;
        result=a*b;
        System.out.println("a AND b MULTIPLICATION is :" +result);
    }

    public void div(){
        int a=8,b=16;
        double result=(double)a/b;
        System.out.println("a AND b DIVISION is :" +result);
    }
    public void mod(){
        int a=8,b=16;
        double result=(double)a%b;
        System.out.println("a AND b MODULUS is :" +result);
    }
    public void per(){
        int num=98,ratio=10;
        double result=(double) (num*ratio)/100;
        System.out.println("num AND ratio PERCENTAGE is :" +result);

    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
        obj.per();
    }
}
