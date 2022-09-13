//TODO:Program for How to use Compile Time Polymorphism

package oops_polymorphism;

public class MethodOverloading {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void m1(){
        System.out.println("This is M1 method with no parameter....");
    }
    // overload m1 by changing input parameter
    public void m1(int age){
        System.out.println("This is M1 method with parameter...." +"Age:" +age );
    }
    // overload m1 AGAIN
    public void m1(int age,String name){
        System.out.println("This is M1 method with  parameter...." +"Name:" +name  +"\t"  +"Age:"  +age  );
    }

    //It is only RUN for Within  Class Not for other Class
    private  void m2(){
    System.out.println("This is my private method");
    }

    public static void main(String[] args) {

        MethodOverloading obj=new MethodOverloading();

        obj.m1();
        obj.m1(22);
        obj.m1(34,"Rohan");
        obj.m2();

    }


}
