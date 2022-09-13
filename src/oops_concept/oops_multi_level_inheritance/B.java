package oops_concept.oops_multi_level_inheritance;

public class B extends A{

    public static void main(String[] args) {

      B obj=new B();

      obj.Class1();
      obj.Class2();

        System.out.println("Print Data :" +obj.name);
        System.out.println("Print Data :" +obj.age);

    }
}
