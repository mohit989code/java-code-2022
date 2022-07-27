//TODO: program for NOT operator:

package conditional_statement_program;

public class NOT_Operator {

    public static void main(String[] args) {

        int marks=75;

        if(!(marks>70)){

            System.out.println("ELIGIBLE FOR ADMISSION");
        }
        else {

            System.out.println("NOT ELIGIBLE FOR ADMISSION");

        }
        int age=21;
        String name="ROHIT";

        if (!(age>18) || name=="ROHIT"){

            System.out.println("ELIGIBLE FOR VOTING");
        }

        else {

            System.out.println(" NOT ELIGIBLE FOR VOTING");

        }
    }
}
