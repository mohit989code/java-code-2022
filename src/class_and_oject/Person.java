//TODO:write a program to create class and object


package class_and_oject;

public class Person {

    String person_name="Rohan";
    int person_age=22;
    double person_height=6.2;

    public static void main(String[] args) {

        Person people=new Person();
        System.out.println("print people name is:" +people.person_name);
        System.out.println("print people age is:" +people.person_age);
        System.out.println("print people height is:" +people.person_height);
    }
}
