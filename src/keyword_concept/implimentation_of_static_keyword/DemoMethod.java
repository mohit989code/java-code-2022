package keyword_concept.implimentation_of_static_keyword;

public class DemoMethod {
    //TODO:Without use STATIC Keyword (WE CAN CALL METHOD WITH CREATING OBJECT )

  /*  public void m1(){
        System.out.println("This is M1 method:" );
    }

    public static void main(String[] args) {
        DemoMethod obj=new DemoMethod();
        obj.m1();
    }*/

//TODO:With use STATIC keyword(WE CAN CALL STATIC METHODsder45678./iop'[0/2858/\][p µçø `1   WITHOUT CREATING OBJECT )
//ClassName.MethodName();

    public static void m1(){
        System.out.println("This is M1 method:" );
    }

    public static void main(String[] args) {
        DemoMethod.m1();
    }
}
