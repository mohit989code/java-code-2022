package assignment_for_multiple_custom_exception_day_26;

public class CustomExceptionLogic {

    public void CheckAgeAndCityForVoting (int age,String city_name) throws AgeAndCityNotEligibleException{

        if(age>23 && city_name=="BANGALORE"){

            System.out.println("person is eligible for voting in this city................ " +"AGE="+age +"\t" +"CITY_NAME="+city_name);

        }
        else {

           throw new AgeAndCityNotEligibleException("person is not eligible for voting in this city " +"AGE="+age +"\t" +"CITY_NAME="+city_name);

        }
    }

    public static void main(String[] args) {

        CustomExceptionLogic obj=new CustomExceptionLogic();

        try {
            obj.CheckAgeAndCityForVoting(22,"BANGALORE");
        }
        catch (ArithmeticException e){     //Child Exception

            System.out.println("Exception Occurred-1......."+e);
        }
        catch (RuntimeException e){    //Parent Exception

            System.out.println("Exception Occurred-2......."+e);

        }
        catch (Exception e){    //Grand Parents Exception

            System.out.println("Exception Occurred-3......."+e);

        }
    }
}
