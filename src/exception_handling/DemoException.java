//TODO: How to use Exception Handling (Try AND Catch) and Finally

package exception_handling;

public class DemoException {

    public int divide(int a,int b){

        System.out.println("Inside Divide Method");

        int Divide=0;

        try {
            Divide=a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurred is............." +e);
        }
//It always print
       finally {
            System.out.println("*********************** This is finally block , it will always execute.....");
        }

        return Divide;

    }


    public void Array (){

        int arr[]={7,5,3,5,8};

        try {
            System.out.println("Printing Array Element :" +arr[3]);
        }
        catch (Exception e){
            System.out.println("Invalid Index Number is............ "+e);
        }
        //It always print
       finally {
            System.out.println("*********************** This is finally block , it will always execute.....");
        }
    }

    public static void main(String[] args) {

        DemoException obj=new DemoException();

        System.out.println("Before calling Divide method.....");
        int divide=obj.divide(3,5);
        System.out.println("After calling Divide method.....");
        System.out.println("Division is "+divide);

        System.out.println("\n");

        System.out.println("Before calling Array method.....");
        obj.Array();
        System.out.println("After calling Array method.....");
        System.out.println("Array is ");



    }

}
