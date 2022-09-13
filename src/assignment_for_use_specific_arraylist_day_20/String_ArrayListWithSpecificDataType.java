//TODO: Program for create a String-ARRAYLIST To Add a Specific Datatype

package assignment_for_use_specific_arraylist_day_20;

import java.util.ArrayList;
import java.util.Scanner;

public class String_ArrayListWithSpecificDataType {

    public ArrayList<String> createStringArray() {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Python");
        stringArrayList.add("C");
        stringArrayList.add("Spring");
        stringArrayList.add("Cloud");

        return stringArrayList;

    }

    public ArrayList<String> CreateWithUserStringInput(){

        ArrayList<String> list=new ArrayList<>();
        Scanner Zorro=new Scanner(System.in);
        String Choice="Y";

        while (Choice.equals("Y")){

            System.out.println("Please Enter string Value for List ");
            String value =Zorro.nextLine();
            list.add(value);

            System.out.println("Press Y to continue and Press any Keyboard key to exit ");
            Choice=Zorro.nextLine();
        }
        return list;
    }

    public static void main(String[] args) {

        String_ArrayListWithSpecificDataType obj = new String_ArrayListWithSpecificDataType();

        ArrayList<String> Output=obj.createStringArray();

        for (int i=0; i< Output.size(); i++){
            System.out.println("Printing List... " +Output.get(i));
        }

        System.out.println("\n");

        ArrayList<String>  userList= obj.CreateWithUserStringInput();

        for (String var: userList){

            System.out.println("Printing user input list : "+var);
        }

    }
}
