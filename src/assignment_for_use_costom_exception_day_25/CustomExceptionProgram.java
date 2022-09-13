//TODO: Program for how to use throw Keyword AND throws Keyword in CUSTOM Exception

package assignment_for_use_costom_exception_day_25;

public class CustomExceptionProgram  {

    public void CheckAmountStatus (double salary) throws LowAmountException{

        if (salary>5000.89){
            System.out.println("Your Account Status is very Well..." +"SALARY="+salary);
        }
        else {
            throw new LowAmountException("Amount is Less than 5000.89,so your Bank Account status is NOT Well");
        }
    }

    public static void main(String[] args) {

        CustomExceptionProgram obj=new CustomExceptionProgram();

        try {
            obj.CheckAmountStatus(2353.80);
        }
        catch (LowAmountException e) {
            System.out.println("Exception Occurred.................:" +e);
        }
    }
}
