//TODO:write a program print 1 to 20 number but not except 3 and 9:

package assignment_for_use_break_and_continue_statement_day_11;

public class UseContinueStatementPrintNumber {

    public static void main(String[] args) {

        for (int i=1;i<=20;i++){

            if (i==3) {
                continue;
            }
                if (i==9){
                    continue;
                }

            System.out.println("PRINT A NUMBER:" +i);
        }
    }
}
