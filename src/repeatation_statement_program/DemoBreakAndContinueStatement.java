//TODO: program for check reak and continue statement:

package repeatation_statement_program;

public class DemoBreakAndContinueStatement {

    public static void main(String[] args) {

        for (int i=0; i<=10; i++){

            System.out.println("print a number:" +i);

            if (i==4){
                break;
            }
        }

        for (int j=10; j>=1; j--){

            if (j==3){

                continue;
            }

            System.out.println("print a number in decreasing order:" +j);
        }
    }
}
