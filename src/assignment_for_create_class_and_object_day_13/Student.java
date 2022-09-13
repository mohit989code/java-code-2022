//TODO: program for create Class And Object

package assignment_for_create_class_and_object_day_13;

public class Student {

    String Name="Rohan";
    String Class="HIGH SCHOOL";
    String College_Name="BISHOP'S CONVENT SCHOOL";
    int Roll_Number=21;
    double Percentage=99.9;

    public static void main(String[] args) {

        Student std1=new Student();
        System.out.println("print student Name : " +std1.Name);
        System.out.println("print student Roll_Number : " +std1.Roll_Number);
        System.out.println("print student Class : " +std1.Class);
        System.out.println("print student College_Name : " +std1.College_Name);
        System.out.println("print student Percentage : " +std1.Percentage );
        System.out.println("\n");
        Student std2=new Student();
        System.out.println("print student Name : " +std2.Name);
        System.out.println("print student Roll_Number : " +std2.Roll_Number);
        System.out.println("print student Class : " +std2.Class);
        System.out.println("print student College_Name : " +std2.College_Name);
        System.out.println("print student Percentage : " +std2.Percentage);
    }
}
