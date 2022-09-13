package assignment_for_modelclass_use_collection_day_21;

import assignment_for_modelclass_use_arraylist_day_21_a.Engineer;

import java.util.ArrayList;

public class EngineerArrayList {

    public ArrayList<Engineer> createEngineerArrayList(){

        ArrayList<Engineer> engineerArrayList=new ArrayList<>();

        Engineer engineer1= new Engineer("Rakesh","Computer Science","Data Scientist");
        Engineer engineer2= new Engineer("Roshan","Electrical","Senior Section Engineer");
        Engineer engineer3= new Engineer("Ramesh","Civil","Contractor");

        engineerArrayList.add(engineer1);
        engineerArrayList.add(engineer2);
        engineerArrayList.add(engineer3);

        return engineerArrayList;

    }

    public static void main(String[] args) {

        EngineerArrayList obj=new EngineerArrayList();

       ArrayList<Engineer> engineers=obj.createEngineerArrayList();

       for (Engineer zorro:engineers){
           System.out.println("Print Data...." +"\t" +"\t" +"Engineer Name : " +zorro.getName() +"\t"+"\t" +"Branch :" +zorro.getBranch() +"\t"+"\t" +"Designation :" +zorro.getDesignation());
       }
    }

}
