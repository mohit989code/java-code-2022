//TODO:program for use parameterized constructor

package parameterized_constructer;

public class Student {

    String Name;
    int Age;
    double Percentage;

//use parameterised constructor


    public Student(String name, int age, double percentage) {
        Name = name;
        Age = age;
        Percentage = percentage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }

    public static void main(String[] args) {
        Student obj1=new Student("Rohan", 22,99.8);
        System.out.println("Student name :" +obj1.Name +"\n" +"Student age : " +obj1.Age +"\n" +"Student percentage :" +obj1.Percentage +"\n");

        //use SETTER method change the data:
                   obj1.setName("Rohan Das");
        //use GETTER method read the data:
                   System.out.println("Updated Name:" +obj1.getName() +"\n");

        Student obj2=new Student("Sohan", 23,96.8);
        System.out.println("\n" +"Student name :" +obj2.Name   +"\t" +"\t" +"Student age : " +obj2.Age +"\t" +"Student percentage :" +obj2.Percentage +"\n");

        //use SETTER method change the data:
                     obj2.setAge(20);
        //use GETTER method read the data:
                    System.out.println("Updated Age:" +obj2.getAge() +"\n");


        Student obj3=new Student("Mohan", 24,97.8);
        System.out.println("\n" +"Student name :" +obj3.Name   +"\t" +"\t" +"Student age : " +obj3.Age +"\t" +"Student percentage :" +obj3.Percentage +"\n");

        //use SETTER method change the data:
        obj3.setPercentage(95.2);
        //use GETTER method read the data:
        System.out.println("Updated Percentage:" +obj3.getPercentage() +"\n");

    }

}
