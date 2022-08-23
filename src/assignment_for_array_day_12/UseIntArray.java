//TODO:write a program to check index in a number

package assignment_for_array_day_12;

public class UseIntArray {

    public static void main(String[] args) {

        int n []={4,3,5,6,7,8,9,43,2,6};
        System.out.println("printing number:" +n[5] +"\t" +n[1]);

 //for loop
        for (int i=0;i<n.length;i++){
            System.out.println("print data series wise:" +n[i]);
        }
//While loop
        int j=0;
        while (j<n.length){
            System.out.println("using while loop:" +n[j]);
            j++;
        }
//Advance For Loop
        for (int k : n){
            System.out.println("using advance for loop:" +k );
        }






    }
}
