//TODO:write a program to check index in a STRING

package assignment_for_array_day_12;

public class UseStringArray {

    public static void main(String[] args) {

        String student_name [] ={"Rakesh","Rohan","Sohan","Mohan"};
        System.out.println("print index position 0 of array:" +student_name[3]);

//using for loop

        for (int i=0; i<student_name.length; i++){
            System.out.println("print student NAME series wise:" +student_name[i]);
        }
//using while loop

        int i=0;
        while (i<student_name.length){
            System.out.println("print name using while loop:" +student_name[i]);
            i++;
        }

//using advance loop

        for (String zorro:student_name ){
            System.out.println("print data using advance for loop:" +zorro);
        }

    }
}
