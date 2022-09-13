//TODO:How to use  Hashcode and Equals Method

package collection_program;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

    public HashMap<Integer,String> createHashMap(){

        //SYNTAX: HashMap <DataType_key , DataType_Value> ObjName= new HashMap<>();

        HashMap<Integer,String> hashMap=new HashMap<>();

        //adding value to Map : put(key,value);

        hashMap.put(1,"JAVA");
        hashMap.put(2,"JAVA 8");
        hashMap.put(3,"J2EE");
        hashMap.put(4,"SPRING BOOT");

        // reading value from map:  get(key);

        System.out.println("Printing Data :" +hashMap.get(2));
        System.out.println("Printing Data :" +hashMap.get(4));

        // we can not have duplicate keys, if we add any duplicate key then it will override previous value

        hashMap.put(2,"SPRING");
        System.out.println("after adding Duplicate key :Printing Map element at 2 index  "+ hashMap.get(2));

        return hashMap;
    }

    public static void main(String[] args) {

        HashMapDemo obj=new HashMapDemo();

        HashMap<Integer,String> hashMap=obj.createHashMap();

        // printing entire HashMap ..  keySet(); : it returns HashSet of Keys

        Set<Integer> Keys=hashMap.keySet(); // get all the key

    for (Integer var:Keys){

        System.out.println("Printing Map in Loop :" +hashMap.get(var));
    }
    }

}
