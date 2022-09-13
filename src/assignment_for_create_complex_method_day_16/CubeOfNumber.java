//TODO:Program for create a COMPLEX METHOD

package assignment_for_create_complex_method_day_16;

public class CubeOfNumber {

    int n=7,result;

    public void makeCubeOfNumber(){
        result=n*n*n;
        System.out.println("Cube of Number is :" +result);
    }

    public static void main(String[] args) {
        CubeOfNumber obj=new CubeOfNumber();
        obj.makeCubeOfNumber();
    }

}
