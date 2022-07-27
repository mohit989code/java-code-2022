//TODO: program for check population of india:

package conditional_statement_program;

public class NestedIfElseStringCondition {

    public static void main(String[] args) {

        int population = 100;
        String country = "INDIA";

        if (country=="INDIA") {

            if (population >= 100) {

                System.out.println("HIGH POPULATION");
            } else {
                System.out.println("GOOD POPULATION");

            }
        }


    else{
            System.out.println("NOT GOOD POPOULATION");
        }
    }
}