//TODO:Program for create METHOD

package assignment_for_create_a_method_day_15;

public class Lawyer {

    String Case_Date;
    String Hiring;
    String Agreement;

    public Lawyer(String case_date, String hiring, String agreement) {
        Case_Date = case_date;
        Hiring = hiring;
        Agreement = agreement;
    }

    public void Case_Date_Method(){
        System.out.println("This Is Case Method");
    }
    public void Hiring_Method(){
        System.out.println("This Is Hiring Method");
    }
    public void Agreement_Method(){
        System.out.println("This Is Agreement Method");
    }

    public static void main(String[] args) {
        Lawyer eng=new Lawyer("10 November","Tomorrow","House");
        eng.Case_Date_Method();
        eng.Hiring_Method() ;
        eng.Agreement_Method();
        System.out.println("\n");
        System.out.println("Case Date :" +eng.Case_Date +"," +"\t" +"Hiring :" +eng.Hiring +"," +"\t"
                +"Agreement :" +eng.Agreement +"\n");
    }
}
