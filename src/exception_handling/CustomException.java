//TODO: Program for how to use throw Keyword AND throws Keyword in CUSTOM Exception
package exception_handling;

public class CustomException {

    public void doVoting(int age) throws AgeNotEligibleInException{

        if (age>18){
            System.out.println("It is Eligible For Voting..........."  +"Age="+age);
        }
        else {
            throw new AgeNotEligibleInException("Age is less than 18, so Not eligible for voting ");
        }
    }

    public static void main(String[] args) {

        CustomException obj=new CustomException();

        try {
            obj.doVoting(22);

        }
        catch (Exception e){
            System.out.println("Exception Occurred............" +e);
        }
    }
}
