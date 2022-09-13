//TODO:Program for How to use Runtime Time Polymorphism

package oops_polymorphism;

public class MethodOverriding {

    public void m1(){
        System.out.println("This is m1 method of MethodOverriding Class");
    }
    public void m2(){
        System.out.println("This is m2 method of MethodOverriding Class");
    }

//This method is only Accessible for Child Class Not for other class

    protected void m3(){
        System.out.println("This is Protected Method");
    }

    //It is only RUN for Within  Class Not for other Class
    private  void m4(){
        System.out.println("This is my private method");
    }
    public static void main(String[] args) {

        MethodOverriding obj=new MethodOverriding();

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }

}
