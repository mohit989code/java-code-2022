//TODO: program for laptop configuration use (IF AND ELSE STATEMENT):

package assignment_for_use_logical_operator_day_5;

public class IfAndElseCondition {

    public static void main(String[] args) {

        int ram=8;
        String brand ="APPLE";

        if(ram==8 && brand=="APPLE")
        {

            System.out.println("GOOD CONFIGURATION");

        }
        else {
            System.out.println("NOT GOOD CONFIGURATION");
        }

        brand="HP";

        if(ram==8 && brand=="APPLE")
        {

            System.out.println("GOOD CONFIGURATION");

        }
        else {
            System.out.println("NOT GOOD CONFIGURATION");
        }

        ram=10;

        if(ram==8 && brand=="APPLE")
        {

            System.out.println("GOOD CONFIGURATION");

        }
        else {
            System.out.println("NOT GOOD CONFIGURATION");
        }

        ram=11;
        brand="LENOVO";

        if(ram==8 && brand=="APPLE")
        {

            System.out.println("GOOD CONFIGURATION");

        }
        else {
            System.out.println("NOT GOOD CONFIGURATION");
        }

    }
}
