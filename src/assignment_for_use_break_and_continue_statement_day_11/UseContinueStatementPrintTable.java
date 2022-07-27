//TODO: write a program to print a 3 TABLE but not print 27:

package assignment_for_use_break_and_continue_statement_day_11;

public class UseContinueStatementPrintTable {

    public static void main(String[] args) {

        int n=3;
        for (int i=1;i<=10;i++){

            int store=n*i;
            if (i==9){
                continue;
            }
            System.out.println("PRINT A TABLE:" +n +"x" +i +"=" +store);
        }

    }
}
