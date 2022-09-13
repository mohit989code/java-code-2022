//TODO: How To Create Method In Java

package create_method_program;

public class Student {

    String name;
    int age;
    double percentage;

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
    public void ageMethod(){
        System.out.println("This is Age Method......");
    }
    public void percentageMethod(){
        System.out.println("This is Percentage Method......");
    }

    public static void main(String[] args) {
        Student obj=new Student();  //create object

        obj.nameMethod();  //Executed Method Syntax: object_name.method_name
        obj.ageMethod();
        obj.percentageMethod();
    }

}

