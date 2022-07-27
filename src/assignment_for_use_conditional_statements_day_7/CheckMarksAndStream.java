//TODO:program for check condition

package assignment_for_use_conditional_statements_day_7;

public class CheckMarksAndStream {

    public static void main(String[] args) {

        int marks = 67;
        String stream_name = "SCIENCE";
        String stream="ART";

        if (marks>33 || stream_name=="SCIENCE" && stream=="ART" ){

            System.out.println("PASS");
        }
        else  {

            System.out.println("FAIL");
        }

    }
}


