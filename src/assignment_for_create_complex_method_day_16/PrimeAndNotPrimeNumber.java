//TODO:Program for create a COMPLEX METHOD

package assignment_for_create_complex_method_day_16;

public class PrimeAndNotPrimeNumber {

    public void checkPrimeAndNotPrimeNumber(){


        int number=1;
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

    public static void main(String[] args) {
        PrimeAndNotPrimeNumber obj=new PrimeAndNotPrimeNumber();
        obj.checkPrimeAndNotPrimeNumber();
    }


    }



