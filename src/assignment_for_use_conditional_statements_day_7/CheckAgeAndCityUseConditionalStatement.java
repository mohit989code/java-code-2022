//TODO: program for check age and metro city use nestedIf and else conditional statement:

package assignment_for_use_conditional_statements_day_7;

public class CheckAgeAndCityUseConditionalStatement {

    public static void main(String[] args) {

        int age = 24;
        String city_name = "BANGALORE";


        if (age > 18 && city_name == "CHENNAI" || age > 18 && city_name == "BANGALORE" || age > 18 && city_name == "DELHI" || age > 18 && city_name == "MUMBAI") {

            System.out.println("print metro city:" + city_name);
        } else {
            System.out.println("print not metro city:" + city_name);
        }
    }
}

