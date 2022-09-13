//TODO:Program for create only specific DATATYPE

package collection_program;

import java.util.ArrayList;

public class ArrayListWithGenerics {

    // create a method which will create a String ArrayList

    public ArrayList<String> createStringList() {

        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Python");
        stringArrayList.add("Java");
        stringArrayList.add("C++");
        stringArrayList.add("C");

        return stringArrayList;

    }
    // create a method which will create a Integer ArrayList
    public ArrayList<Integer> createIntegerList(){

        ArrayList<Integer> integerArrayList=new ArrayList<>();

        integerArrayList.add(34);
        integerArrayList.add(36);
        integerArrayList.add(3);
        integerArrayList.add(343);

        return integerArrayList;

    }
    // create a method which will create a Double ArrayList
    public ArrayList<Double> createDoubleList(){

        ArrayList<Double> doubleArrayList=new ArrayList<>();

        doubleArrayList.add(23.43);
        doubleArrayList.add(28.73);
        doubleArrayList.add(26.3);
        doubleArrayList.add(73.93);

        return doubleArrayList;

    }

    public static void main(String[] args) {

        ArrayListWithGenerics obj=new ArrayListWithGenerics();

        ArrayList<String> output1 =obj.createStringList();

        for (int i=0; i<output1.size(); i++){
            System.out.println("Printing a Data....." +output1.get(i) );
        }
        System.out.println("\n");

        ArrayList<Integer>output2 =obj.createIntegerList();

        for (int i=0; i<output2.size(); i++){
            System.out.println("Printing a Data....." +output2.get(i) );
        }
        System.out.println("\n");


        ArrayList<Double>output3 =obj.createDoubleList();

//Advance for loop SYNTAX: for(Datatype variable_name: CollectionName){CODE}

        for (Double zorro: output3){
            System.out.println("Printing a Data....." +zorro );
        }
    }


}






