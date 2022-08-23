//TODO:write a program to create class and object

package class_and_oject;

public class Home {

    String Home_name="Maa";
    int Home_number=198;
    double Home_price=2300000.45;

    public static void main(String[] args) {
        //create object
        //object syntax: TODO: ClassName ObjectName = +new ClassName();

        Home obj1= new Home();
        System.out.println("Home name is: " +obj1.Home_name);
        System.out.println(" Home number is: " +obj1.Home_number);
        System.out.println("Home price is: " +obj1.Home_price);

    }
}
