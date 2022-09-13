//TODO:Program for create METHOD

package assignment_for_create_a_method_day_15;

public class Doctor {

    String Check_up;
    String Visit_time;
    String Operation_name;

    public Doctor(String check_up, String visit_time, String operation) {
        Check_up = check_up;
        Visit_time = visit_time;
        Operation_name = operation;
    }

    public void Check_upMethod(){
        System.out.println("THIS IS check_up METHOD :" );
    }
    public void Visit_timeMethod(){
        System.out.println("THIS IS Visit_time METHOD : ");
    }
    public void Operation_nameMethod(){
        System.out.println("THIS IS Operation METHOD :" );
    }

    public static void main(String[] args) {
        Doctor obj1=new Doctor("BLOOD TEST","10:30","CANCER");
        obj1.Check_upMethod();
        obj1.Visit_timeMethod() ;
        obj1.Operation_nameMethod();
        System.out.println("\n");
        System.out.println("Check_Up NAME :" +obj1.Check_up +"," +"\t" +"Visit_TIMING :" +obj1.Visit_time +"," +"\t"
                +"Operation Name :" +obj1.Operation_name +"\n");



        }

}
