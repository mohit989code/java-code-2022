//TODO: program for check height and weight:

package assignment_for_use_or_and_not_operator_day_6;

public class OR_And_NOT_Operator {

    public static void main(String[] args) {

        int height=5;
        int weight=55;

        if(height>4 || weight>40){

            System.out.println("over weight");
        }
        else {
            System.out.println("under weight");

        }if(height>4 || weight>60){

            System.out.println("over weight");
        }
        else {
            System.out.println("under weight");

        }if(height>6 || weight>40){

            System.out.println("over weight");
        }
        else {
            System.out.println("under weight");

        }if(height>6 || weight>60){

            System.out.println("over weight");
        }
        else {
            System.out.println("under weight");

        }

        int age=23;
        String city="PUNE";

        if (!(age>20) && city=="PUNE"){

            System.out.println("ELIGIBLE FOR ADMISSION");
        }
        else {

            System.out.println("NOT ELIGIBLE FOR ADMISSION");

        }
    }
}
