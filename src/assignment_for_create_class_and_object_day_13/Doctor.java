//TODO: program for create Class And Object

package assignment_for_create_class_and_object_day_13;

public class Doctor {
    String Name = "Mohan";
    String Education = "M.B.B.S";
    String College_Name = "AIIMS";
    int Roll_Number = 21;
    double Percentage = 99.9;

    public static void main(String[] args) {

        Doctor obj1 = new Doctor();
        System.out.println("print student Name : " + obj1.Name);
        System.out.println("print student Roll_Number : " + obj1.Roll_Number);
        System.out.println("print student Class : " + obj1.Education);
        System.out.println("print student College_Name : " + obj1.College_Name);
        System.out.println("print student Percentage : " + obj1.Percentage);
        System.out.println("\n");
        Doctor obj2 = new Doctor();
        System.out.println("print student Name : " + obj2.Name);
        System.out.println("print student Roll_Number : " + obj2.Roll_Number);
        System.out.println("print student Class : " + obj2.Education);
        System.out.println("print student College_Name : " + obj2.College_Name);
        System.out.println("print student Percentage : " + obj2.Percentage);
    }
}