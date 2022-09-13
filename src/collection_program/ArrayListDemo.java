//TODO: How to use Collection and create ArrayList

package collection_program;

import java.util.ArrayList;

public class ArrayListDemo {

    public void createArrayList(){

        //SYNTAX : ArrayList objName= new ArrayList();

        ArrayList list=new ArrayList();//create object of list

 //How to add the Data:
        //list.add(object);
        list.add("Java"); // 0 index
        list.add("Spring Boot"); // 1 index
        list.add("Cloud"); // 2 index
        list.add("Microservices"); // 3 index
        list.add(33); // 4 index
        list.add(34.5); // 5 index
        list.add('A'); // 6 index

// read the Data: get(index);

        System.out.println("Printing Data in ArrayList  o index " +list.get(0));
        System.out.println("Printing Data in ArrayList  1 index " +list.get(1));
        System.out.println("Printing Data in ArrayList  2 index " +list.get(2));
        System.out.println("Printing Data in ArrayList  3 index " +list.get(3));
        System.out.println("Printing Data in ArrayList  4 index " +list.get(4));
        System.out.println("Printing Data in ArrayList  5 index " +list.get(5));
        System.out.println("Printing Data in ArrayList  6 index " +list.get(6));

//Print all data

     for (int i=0; i<list.size(); i++) {

         System.out.println("Printing in loop...." +" index " +i +" Data " +list.get(i));
     }

//Advance For Loop

        //SYNTAX: for(Datatype variable_name: collectionName){CODE}

        for (Object var: list){
            System.out.println("Advance for loop.... " +var);

        }
    }

    public static void main(String[] args) {

        ArrayListDemo obj=new ArrayListDemo();
        obj.createArrayList();
    }
}
