//TODO:program for check multiple condition use (LOGICAL OPERATOR)

package conditional_statement_program;

public class DemoMultipleIfConditionAND_Operator {

    public static void main(String[] args) {

        int age=25;
        String city_name="bangalore";

// TRUE && TRUE= TRUE (1X1=1)

        if(age>23 && city_name=="bangalore"){

            System.out.println("person is eligible for voting in bangalore ");

        }
        else {

            System.out.println("person is not eligible for voting in bangalore ");

        }
// TRUE && FALSE= FALSE (1X0=0)

        city_name="pune";

        if(age>23 && city_name=="bangalore"){

            System.out.println("person is eligible for voting in bangalore ");

        }
        else {

            System.out.println("person is not eligible for voting in bangalore ");

        }
// FALSE && TRUE= FALSE (1X1=1)

        age=20;
        if(age>23 && city_name=="bangalore"){

            System.out.println("person is eligible for voting in bangalore ");

        }
        else {

            System.out.println("person is not eligible for voting in bangalore ");

        }
// FALSE && FALSE= FALSE (0X0=0)

        age=20;
        String cityname="pune";

        if(age>23 && city_name=="bangalore"){

            System.out.println("person is eligible for voting in bangalore ");

        }
        else {

            System.out.println("person is not eligible for voting in bangalore ");

        }


    }
}
