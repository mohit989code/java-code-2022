//TODO: How to use Collection and create ArrayList

package assignment_arraylist_program_day_19;

import java.util.ArrayList;

public class CreateArrayListProgram {

    public void NewArrayList(){

        ArrayList obj=new ArrayList();

        obj.add("Rohan");
        obj.add("Sohan");
        obj.add("Mohan");
        obj.add(24);
        obj.add(22.4);
        obj.add(333);
        obj.add('A');
        obj.add('d');
        obj.add("Rohan is go to the market");
        obj.add("All is ok");

        System.out.println("\n");

        System.out.println("Print a data :" +obj.get(0));
        System.out.println("Print a data :" +obj.get(1));
        System.out.println("Print a data :" +obj.get(2));
        System.out.println("Print a data :" +obj.get(3));
        System.out.println("Print a data :" +obj.get(4));
        System.out.println("Print a data :" +obj.get(5));
        System.out.println("Print a data :" +obj.get(6));
        System.out.println("Print a data :" +obj.get(7));
        System.out.println("Print a data :" +obj.get(8));
        System.out.println("Print a data :" +obj.get(9));

        System.out.println("\n");

        for (int i=0; i<obj.size(); i++){

            System.out.println("Printing a Data is :" +" index " +i +" Data " +obj.get(i));
        }

        System.out.println("\n");

        for (Object zorro: obj){
            System.out.println("Printed a Data....." +"\n" +zorro);
        }


    }

    public static void main(String[] args) {

        CreateArrayListProgram obj1=new CreateArrayListProgram();
        obj1.NewArrayList();
    }
}
