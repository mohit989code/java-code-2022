// TODO: program for arrays in java

package arrays_programs;

public class Demo {

    public static void main(String[] args) {

        String city []= {"BANGALORE","PUNE","HYDERABAD","CHENNAI"};
        System.out.println("printing cities:" +city[0]);

        //print all data in series wise use for loop

        for (int i=0; i<city.length; i++){

            System.out.println("print in series wise:" +city[i]);
        }
        //print data use while loop

        int i=0;
        while (i<city.length){

            System.out.println("print data:" +city[i]);
            i++;
        }

        //how to use ADVANCED FOR loop

        for (String cities : city){

            System.out.println("print data use ADVANCED FOR loop:" +cities);
        }

        //print number series

        int n []= {1,11,22,34,2,3,5,};
        System.out.println("print index number :" +n[2]);
    }
}
