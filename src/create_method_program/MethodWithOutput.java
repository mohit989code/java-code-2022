//TODO:How to return OUTPUT
package create_method_program;

public class MethodWithOutput {

    //SYNTAX : access_specifier Datatype(return_type)  method_name (parameter) {CODE..}

    public String message(String name) {

        String output = "Welcome to Java Programming ..." + name;

        return output;

    }
    public int makeSquare(int num){

        int result = num*num;

        return result;
    }
    public double makedoubleprice(double money){

        double result=money*2;

        return result;
    }

    public static void main(String[] args) {

        MethodWithOutput obj=new MethodWithOutput();

        String output=obj.message("Rohan");
        System.out.println("Print welcome method is...."+output);

        int result=obj.makeSquare(6);
        System.out.println("Result of makeSquare method is...."+result);

        double price= obj.makedoubleprice(56);
        System.out.println("Double price of product is...."+price);
    }
}
