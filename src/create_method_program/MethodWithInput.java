//TODO:Write a program to Pass a Parameter_value

package create_method_program;

public class MethodWithInput {

    //Syntax : access_specifier return_type  method_name (Datatype varname) {CODE..}

    public void checkAGE(int age){

        if (age<18){
            System.out.println("It is a CHILD..... :" +age);
        }
        else if (age>18 && age<45) {
            System.out.println("It is a YOUNG.... :" +age);
        }
        else {
            System.out.println("It is OLD.... :" +age);
        }
        }

        public void hello(String name){
            System.out.println("Print a Name :" +name);
        }
        public void message(String name,int age){
            System.out.println("print a person :" +name +"\n" +age);
        }
    public static void main(String[] args){
        MethodWithInput obj=new MethodWithInput();
        obj.checkAGE(34);//obj.MethodName(parameter_value)
        obj.hello("Rohan");
        obj.message("Sohan",22);
    }
    }
