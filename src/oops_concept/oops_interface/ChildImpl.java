package oops_concept.oops_interface;

public class ChildImpl implements DemoInterface {

    @Override
    public void m1() {
        System.out.println("I am present in M1");
    }

    @Override
    public void m2() {
        System.out.println("I am present in M2");

    }

    @Override
    public void m3() {
        System.out.println("I am present in M3");

    }

    public static void main(String[] args) {
        ChildImpl obj=new ChildImpl();

        obj.m1();
        obj.m2();
        obj.m3();
    }
}
