package keyword_concept.implimentation_of_static_keyword;

public class DemoVariable {

//TODO:Without use STATIC Keyword(WE CAN CALL VARIABLE WITH CREATING OBJECT )

  /*  public int a=23;

    public static void main(String[] args) {
        DemoVariable obj=new DemoVariable();
        System.out.println("Print a Data:" +obj.a);
    }*/

//TODO:With use STATIC keyword(WE CAN CALL STATIC VARIABLE WITHOUT CREATING OBJECT )
//ClassName.VariableName

  public static int n=2;

    public static void main(String[] args) {

        System.out.println("Printing my Variable:" +DemoVariable.n);
    }
}
