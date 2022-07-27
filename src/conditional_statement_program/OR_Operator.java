//TODO: program for check student result:

package conditional_statement_program;

public class OR_Operator {

    public static void main(String[] args) {

        int marks=75;
        String name="RAKESH";

        if(marks>65 || name=="RAKESH"){

            System.out.println("RAKESH PASS OUT FIRST DIVISION");
        }
        else {

            System.out.println("RAKESH PASS NOT OUT FIRST DIVISION");

        }
        if(marks>65 || name=="RAVI"){

            System.out.println("RAKESH PASS OUT FIRST DIVISION");
        }
        else {

            System.out.println("RAKESH PASS NOT OUT FIRST DIVISION");

        } if(marks>80 || name=="RAKESH"){

            System.out.println("RAKESH PASS OUT FIRST DIVISION");
        }
        else {

            System.out.println("RAKESH PASS NOT OUT FIRST DIVISION");

        } if(marks>80 || name=="RAVI"){

            System.out.println("RAKESH PASS OUT FIRST DIVISION");
        }
        else {

            System.out.println("RAKESH PASS NOT OUT FIRST DIVISION");

        }
    }
}
