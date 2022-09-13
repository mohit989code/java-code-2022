package oops_concept.oops_abstraction;

public class ChildAbstraction extends ParentAbstraction {


    @Override
    public void m1() {
        System.out.println("This is M1 from Child Class.....");
    }

    public static void main(String[] args) {

        ChildAbstraction obj=new ChildAbstraction();
        obj.m1();
        obj.m2();
    }
}
