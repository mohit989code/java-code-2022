//TODO:Write a program to Create a Complex Method

package create_method_program;

import conditional_statement_program.SwitchStatement;

public class MethodsDemo {

    int number=4,X;


    public void makeSquare(){
        X=number*number;
        System.out.println("Print a Square of Number :" +X );
    }
    public void checkEvenOdd(){
        int num=3;
        if (num%2==0){
            System.out.println("Number Is Even :" +num);
        }
        else {
            System.out.println("Number Is Odd :" +num);
        }
    }
    public void checkDayOfWeek(){
        int Day=2;

        switch (Day){

            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Invalid Data");
        }


    }

    public static void main(String[] args) {
        MethodsDemo obj=new MethodsDemo();
        obj.makeSquare();
        obj.checkEvenOdd();
        obj.checkDayOfWeek();
    }
}
