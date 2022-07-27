//TODO: how to use DO_WHILE loop

package repeatation_statement_program;

public class DemoDoWhileLoop {

    public static void main(String[] args) {

        int alpha = 2;

        do {
            System.out.println("print number:" + alpha);
            alpha++;
        }
        while (alpha < 15);


        int j = 16;

        do {
            System.out.println("print decrease number:" + j);
            j--;
        }
        while (j > 1);
    }
}
