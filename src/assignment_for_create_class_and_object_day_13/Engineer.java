//TODO: program for create Class And Object

package assignment_for_create_class_and_object_day_13;

public class Engineer {

    String Name="Sohan";
    String Education="B.TECH";
    String College_Name="BHU";
    int Roll_Number=21;
    double Percentage=99.9;

    public static void main(String[] args) {

        Engineer obj1=new Engineer();
        System.out.println("print student Name : " +obj1.Name);
        System.out.println("print student Roll_Number : " +obj1.Roll_Number);
        System.out.println("print student Class : " +obj1.Education);
        System.out.println("print student College_Name : " +obj1.College_Name);
        System.out.println("print student Percentage : " +obj1.Percentage );
        System.out.println("\n");
        Engineer obj2=new Engineer();
        System.out.println("print student Name : " +obj2.Name);
        System.out.println("print student Roll_Number : " +obj2.Roll_Number);
        System.out.println("print student Class : " +obj2.Education);
        System.out.println("print student College_Name : " +obj2.College_Name);
        System.out.println("print student Percentage : " +obj2.Percentage );
    }
}


