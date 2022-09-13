//TODO:Program for check VOTE FOR ELIGIBILITY IN A CITY

package assignment_for_use_input_parameter_methods_day_17;

public class CheckEligibilityWithInput {

    public void checkVOTING(int age,String city){

        if(age>15 && city=="BANGALORE"){

            System.out.println("person is eligible for voting in bangalore ");

        }
        else {

            System.out.println("person is not eligible for voting in bangalore ");

        }

    }

    public static void main(String[] args) {
        CheckEligibilityWithInput obj1=new CheckEligibilityWithInput();
        obj1.checkVOTING(18,"BANGALORE");
    }
}
