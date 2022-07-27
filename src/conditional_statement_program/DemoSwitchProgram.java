//TODO: program for check age use SWITCH statement:

package conditional_statement_program;

public class DemoSwitchProgram {

    public static void main(String[] args) {

        int age=18;

        switch (age){

            case 10:
                System.out.println("ITS A CHILD AGE: " +age);
                break;
            case 18:
                System.out.println("ITS A YOUNG AGE: " +age);
                break;
            case 60:
                System.out.println("ITS A OLD AGE: " +age);
                break;
            default:
                System.out.println("INVALID DATA");
        }
    }
}
