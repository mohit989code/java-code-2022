//TODO: Program for use HashSet(it is not allowed duplicate data)

package collection_program;

import java.util.HashSet;

public class DemoHashset {

    public HashSet<String> createStringHashset(){

    //SYNTAX: Collection means(Hashset) <DATATYPE> means(String,int,double) Object_Name means(create Hashset)= new(it is a keyword) Collection means(Hashset) ();

    //SYNTAX : Collection <DATATYPE> objName= new Collection();

    HashSet<String> Course = new HashSet<>();

        Course.add("java");
        Course.add("python");
        Course.add("c");
        Course.add("java");
        Course.add("java");

        return Course;
}

public HashSet<Integer> createIntegerHashset(){

        HashSet<Integer> marks=new HashSet<>();
        marks.add(98);
        marks.add(98);
        marks.add(96);
        marks.add(45);
        marks.add(98);

        return marks;
}

public HashSet<Double> createDoubleHashset(){

        HashSet<Double> price=new HashSet<>();
        price.add(543.3);
        price.add(5343.3);
        price.add(543.3);
        price.add(5344.3);
        price.add(5422.3);

        return price;

}

    public static void main(String[] args) {
        DemoHashset obj=new DemoHashset();
        HashSet<String> course=obj.createStringHashset();

        for (String type: course){
            System.out.println("Printing Data :" +type +"\n");
        }

        HashSet<Integer> marks=obj.createIntegerHashset();

        for (int  var1: marks){
            System.out.println("Printing data :" +var1 +"\n");
        }

        HashSet<Double> prices=obj.createDoubleHashset();

        for (Double var:prices ){
            System.out.println("Printing data:" +var);
        }
    }
}