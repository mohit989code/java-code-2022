//TODO: Program for create a Double-ARRAYLIST To Add a Specific Datatype

package assignment_for_use_specific_arraylist_day_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Double_ArrayListWithSpecificDataType {

    public ArrayList<Double> createArrayList() {

        ArrayList<Double> DoubleArrayList = new ArrayList<>();

        DoubleArrayList.add(233.4);
        DoubleArrayList.add(234.5);
        DoubleArrayList.add(3565.5);
        DoubleArrayList.add(4688.3);

        return DoubleArrayList;
    }

    public ArrayList<Double> CreateWithUserDoubleInput() {

        ArrayList<Double> list = new ArrayList<>();

        Scanner price = new Scanner(System.in);

        Double Choice = 1.0;

        while (Choice.equals(1.0)) {

            System.out.println("Please enter a Double Data");
            Double value = price.nextDouble();
            list.add(value);

            System.out.println("If you are continue the code then press 1.0 AND If you are do not continue the code then press any key in keyboard ");
            Choice = price.nextDouble();
        }
        return list;

    }

    public static void main(String[] args) {

        Double_ArrayListWithSpecificDataType obj=new Double_ArrayListWithSpecificDataType();

        ArrayList<Double> Output=obj.CreateWithUserDoubleInput();

        for (int i=0; i<Output.size(); i++){

            System.out.println("Print a data...." +Output.get(i));
        }

        ArrayList<Double> Output2=obj.CreateWithUserDoubleInput();

        for (Double n: Output2){

            System.out.println("Printing a Data....." +n);
        }
    }

}
