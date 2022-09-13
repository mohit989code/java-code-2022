//TODO:program for using parameterized constructor and Getter and Setter Method

package assignment_for_use_parameterized_constructor_day_14;

public class Engineer {

    String Name;
    String Department;
    String Specialization;

//Use parameterized constructor

    public Engineer(String name, String department, String specialization) {
        Name = name;
        Department = department;
        Specialization = specialization;
    }

//Use Getter Setter method


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public static void main(String[] args) {

        Engineer Eng1=new Engineer("Rohan","Electrical","Microchips");
        System.out.println("Engineer Name :" +Eng1.Name +"," +"\t" +"Engineer Department :" +Eng1.Department +"," +"\t" +"Engineer Specialization :" +Eng1.Specialization +"\n");

//use SETTER method change the data:
        Eng1.setName("Mohan");
//use GETTER method read the data:
        System.out.println("Updated name:" +Eng1.getName() +"\n");

        Engineer Eng2=new Engineer("Sohan","Civil","Building Construction");
        System.out.println("Engineer Name :" +Eng2.Name +"," +"\t" +"Engineer Department :" +Eng2.Department +"," +"\t" +"Engineer Specialization :" +Eng2.Specialization +"\n");

//use SETTER method change the data:
        Eng2.setDepartment("Mechinical");
//use GETTER method read the data:
        System.out.println("Updated department:" +Eng2.getDepartment() +"\n");

        Engineer Eng3=new Engineer("Gopal","Computer Science","Python");
        System.out.println("Engineer Name :" +Eng3.Name +"," +"\t" +"Engineer Department :" +Eng3.Department +"," +"\t" +"Engineer Specialization :" +Eng3.Specialization +"\n");

//use SETTER method change the data:
        Eng3.setSpecialization("Java");
//use GETTER method read the data:
        System.out.println("Updated specialization:" +Eng3.getSpecialization() +"\n");
    }
}
