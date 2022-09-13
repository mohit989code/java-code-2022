//TODO:Program for create METHOD

package assignment_for_create_a_method_day_15;

public class Engineer {

    String Study;
    String Develop;
    String Repair;

    public Engineer(String study, String develop, String repair) {
        Study = study;
        Develop = develop;
        Repair = repair;
    }

    public void Study_Method(){
        System.out.println("This Is Study Method");
    }
    public void Develop_Method(){
        System.out.println("This Is Develop Method");
    }
    public void Repair_Method(){
        System.out.println("This Is Repair Method");
    }

    public static void main(String[] args) {
        Engineer eng=new Engineer("COMPUTER SCIENCE","GAMING SOFTWARE","Bug Problem");
        eng.Study_Method();
        eng.Develop_Method() ;
        eng.Repair_Method();
        System.out.println("\n");
        System.out.println("Study NAME :" +eng.Study +"," +"\t" +"Develop :" +eng.Develop +"," +"\t"
                +"Repair :" +eng.Repair +"\n");
    }
}
