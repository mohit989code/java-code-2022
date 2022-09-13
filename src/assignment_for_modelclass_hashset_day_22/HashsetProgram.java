//TODO: Program for how to use HASHSET
package assignment_for_modelclass_hashset_day_22;

import java.util.HashSet;

public class HashsetProgram {

    public HashSet<Double> createDoubleHashset(){

        HashSet<Double> Price=new HashSet<>();

        Price.add(335.54);
        Price.add(233.5);
        Price.add(4334.4);
        Price.add(3225.3);
        Price.add(335.54);

        return Price;

    }

    public static void main(String[] args) {
        HashsetProgram obj=new HashsetProgram();
        HashSet<Double> amount=obj.createDoubleHashset();

        for (Double rate:amount){
            System.out.println("Printing Data :" +rate);
        }
    }
}
