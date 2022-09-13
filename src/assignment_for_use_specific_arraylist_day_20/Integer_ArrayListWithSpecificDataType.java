//TODO: Program for create a Integer-ARRAYLIST To Add a Specific Datatype

package assignment_for_use_specific_arraylist_day_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Integer_ArrayListWithSpecificDataType {

    public ArrayList<Integer> createArrayList(){

        ArrayList<Integer> IntegerArrayList=new ArrayList<>();

        IntegerArrayList.add(23);
        IntegerArrayList.add(43);
        IntegerArrayList.add(93);
        IntegerArrayList.add(27);

        return IntegerArrayList;

    }
    public ArrayList<Integer> CreateWithUserIntegerInput(){

        ArrayList<Integer> list=new ArrayList<>();
        Scanner value=new Scanner(System.in);
        Integer code=1;

        while (code.equals(1)){

            System.out.println("Please Enter integer Value for List");
            Integer zorro= value.nextInt();
            list.add(zorro);

            System.out.println("Press 1 to continue and Press any Keyboard key to exit ");
            code=value.nextInt();
        }
        return list;
    }

    public static void main(String[] args) {

        Integer_ArrayListWithSpecificDataType obj=new Integer_ArrayListWithSpecificDataType();

        ArrayList<Integer> Output=obj.CreateWithUserIntegerInput();

        for (int i=0; i< Output.size(); i++){
            System.out.println("Printing List... " +Output.get(i));
        }

        System.out.println("\n");

        ArrayList<Integer>  userList= obj.CreateWithUserIntegerInput();

        for (Integer var: userList){

            System.out.println("Printing user input list : "+var);
        }
    }


}
