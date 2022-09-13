//TODO: This is MethodOverriding Child Class

package oops_polymorphism;

public class Child extends MethodOverriding{

    public void m1(){
        System.out.println("This is m1 method of MethodOverriding CHILD Class");
    }
    public void m2(){
        System.out.println("This is m2 method of MethodOverriding CHILD Class");
    }//public void m3(){
       // System.out.println("This is m3 method of MethodOverriding CHILD Class");
   // }

    public static void main(String[] args) {

        MethodOverriding obj=new MethodOverriding();
        obj.m2();
        obj.m3();

        MethodOverriding obj1=new Child();
        obj1.m1();
    }
}
