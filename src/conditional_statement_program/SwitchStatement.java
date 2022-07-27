//TODO: program for check DAY IN A WEEK use switch statement

package conditional_statement_program;

public class SwitchStatement {

    public static void main(String[] args) {

        int DAY=1;

        switch (DAY){

            case 1:
                System.out.println("WEEK OF THE DAY IS: MONDAY" );
                break;
            case 2:
                System.out.println("WEEK OF THE DAY IS: TUESDAY" );
                break;
            case 3:
                System.out.println("WEEK OF THE DAY IS: WEDNESDAY" );
                break;
            case 4:
                System.out.println("WEEK OF THE DAY IS: THURSDAY" );
                break;
            case 5:
                System.out.println("WEEK OF THE DAY IS: FRIDAY" );
                break;
            case 6:
                System.out.println("WEEK OF THE DAY IS: SATURDAY" );
                break;
            case 7:
                System.out.println("WEEK OF THE DAY IS: SUNDAY" );
                break;
            default:
                System.out.println("INVALID DAY OF THE WEEK");
        }
    }
}
