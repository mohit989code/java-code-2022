package assignment_for_use_conditional_statements_day_7;

public class CheckPrimeAndNotPrimeNumber {

    public static void main(String[] args) {

        int number = 6;

        if (number > 0) {
            boolean flag = false;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {

                    flag = true;
                    break;
                }

            }

            if (flag) {

                System.out.println("Not A prime number:" +number);

            } else {
                if (number != 0 && number != 1) {
                    System.out.println("number is a Prime Number:" +number);
                } else {
                    System.out.println("0 and 1 is not a Prime number:" +number);
                }

            }

        }

    }
}

