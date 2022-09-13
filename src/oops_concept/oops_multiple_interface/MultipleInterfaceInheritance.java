package oops_concept.oops_multiple_interface;

public class MultipleInterfaceInheritance implements MyInterface1, MyInterface2, MyInterface3, MyInterface4 {
    @Override
    public void M1() {
        System.out.println("I am present in MyInterface1");
    }

    @Override
    public void M2() {
        System.out.println("I am present in MyInterface2");

    }

    @Override
    public void M3() {
        System.out.println("I am present in MyInterface3");

    }

    @Override
    public void M4() {
        System.out.println("I am present in MyInterface4");

    }

    public static void main(String[] args) {

        MultipleInterfaceInheritance obj=new MultipleInterfaceInheritance();

        obj.M1();
        obj.M2();
        obj.M3();
        obj.M4();

    }
}
