//TODO: program for check number is EVEN and ODD:

package conditional_statement_program;

public class NestedIfAndElseCondition {

    public static void main(String[] args) {

        int num=10;

        if (num !=0) {

            if (num % 2 == 0) {

                System.out.println("NUMBER IS EVEN");
            } else {

                System.out.println("NUMBER IS ODD");
            }
        }
            else {

                System.out.println("INVALID NUMBER");
            }

    }
}
