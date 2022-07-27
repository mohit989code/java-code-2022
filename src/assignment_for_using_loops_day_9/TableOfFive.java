//TODO: program for print of five table

package assignment_for_using_loops_day_9;

public class TableOfFive {

    public static void main(String[] args) {

        int num=5;

        for (int i=1; i<=10; i++){

            int store=num*i;
            System.out.println("PRINT FIVE TABLE: " +num +"x" +i +"=" +store );
        }
    }
}
