//program for variable mathematical operation using double operator:

package assignment_for_use_double_datatype_and_perform_mathematical_operation_day_3;

public class MathematicalOperations {

    public static void main(String[] args) {
//print number a and b:
        double a=1.4,b=2.5;
        {
            System.out.println("print a " + a);
            System.out.println("print b " + b);
        }
//SUM OF TWO NUMBER a and b:
        double sum=a+b;
        System.out.println("sum is" +sum);

// SUBTRACTION OF TWO NUMBER a and b:
        double sub=a-b;
        System.out.println("sub is" +sub);

// MULTIPLICATION OF TWO NUMBER a and b:
        double mul=a*b;
        System.out.println("mul is" +mul);

// DIVISION OF TWO NUMBER a and b:
        double div=(double) a/b;
        System.out.println("div is" +div);

// MODULUS OF TWO NUMBER a and b:
        double mod=a%b;
        System.out.println("mod is" +mod);

//PRE INCREMENT OPERATOR:

        ++a;
        System.out.println("before operation +1 increase" +a);

        ++b;
        System.out.println("before operation +1 increase" +b);

//POST INCREMENT OPERATOR:

        a++;
        System.out.println("after operation +1 increase" +a);

        b++;
        System.out.println("after operation +1 increase" +b);

//PRE DECREMENT OPERATOR:

        --a;
        System.out.println("before operation -1 decrease" +a);

        --b;
        System.out.println("before operation -1 decrease" +b);

//POST DECREMENT OPERATOR:

        a--;
        System.out.println("after operation -1 decrease" +a);

        b--;
        System.out.println("after operation -1 decrease" +b);






    }

}
