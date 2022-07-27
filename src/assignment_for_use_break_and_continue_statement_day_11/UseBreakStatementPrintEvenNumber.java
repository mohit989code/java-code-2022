//TODO: program for print EVEN NUMBER between 1to50 if number increased to 20 then exit from the loop:

package assignment_for_use_break_and_continue_statement_day_11;

public class UseBreakStatementPrintEvenNumber {

    public static void main(String[] args) {

        for (int i=1;i<=50;i++){
            if (i%2==0){

                System.out.println("print EVEN number:" +i);
            }
            if (i==20){
                break;
            }
        }
    }
}
