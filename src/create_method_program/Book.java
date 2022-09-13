//TODO: How To Create Method In Java

package create_method_program;

public class Book {

    String name;
    int page_no;
    double price;

     /* todo    Member function or method -- capabilities
       Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional */


    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void nameMethod(){
        System.out.println("This is Name Method......");
    }
    public void page_noMethod(){
        System.out.println("This is Page_No. Method......");
    }
    public void priceMethod(){
        System.out.println("This is Price Method......");
    }

    public static void main(String[] args) {
        Book obj=new Book();  //create object

        obj.nameMethod();  //Executed Method Syntax: object_name.method_name
        obj.page_noMethod();
        obj.priceMethod();
    }

}
