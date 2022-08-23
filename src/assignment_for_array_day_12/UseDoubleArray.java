//TODO:write a program for print percentage

package assignment_for_array_day_12;

public class UseDoubleArray {

    public static void main(String[] args) {

        double percentage []={99.9,33.3,55.3,77.3,45.6};
        System.out.println("print percentage index number: " +percentage[2]);

//using for loop

        for (int i=0;i<percentage.length;i++){
            System.out.println("print series wise percentage:" +percentage[i]);

        }
//using while loop

        int i=0;
        while (i<percentage.length){
            System.out.println("print data:" +percentage[i]);
            i++;
        }
//using advance loop

       for (double zorro:percentage ){
           System.out.println("advance for loop:" +zorro);
       }
    }
}
