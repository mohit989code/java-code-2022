//TODO:program for using parameterized constructor and Getter and Setter Method

package assignment_for_use_parameterized_constructor_day_14;

public class Doctor {

    String Name;
    String Department;
    double Salary;

    //Use parameterized constructor
    public Doctor(String name, String department, double salary) {
        Name = name;
        Department = department;
        Salary = salary;
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

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public static void main(String[] args) {

        Doctor Doc1=new Doctor("Mukesh","Hematalogist",983332.4);
        System.out.println("Doctor Name :" +Doc1.Name +"," +"\t" +"Doctor Department :" +Doc1.Department +"," +"\t" +"Doctor Salary :" +Doc1.Salary +"\n");

//use SETTER method change the data:
        Doc1.setName("Mohan");
//use GETTER method read the data:
        System.out.println("Updated name:" +Doc1.getName() +"\n");

        Doctor Doc2=new Doctor("Sohan","Dermatalogist",933223.6);
        System.out.println("Doctor Name :" +Doc2.Name +"," +"\t" +"Doctor Department :" +Doc2.Department +"," +"\t " +"Doctor Salary :" +Doc2.Salary +"\n");

//use SETTER method change the data:
        Doc2.setDepartment("Cardiologist");
//use GETTER method read the data:
        System.out.println("Updated department:" +Doc2.getDepartment() +"\n");

        Doctor Doc3=new Doctor("Rohan","Nurologist",972422.7);
        System.out.println("Doctor Name :" +Doc3.Name +"," +"\t" +"Doctor Department :" +Doc3.Department +"," +"\t" +"Doctor Salary :" +Doc3.Salary +"\n");

//use SETTER method change the data:
        Doc3.setSalary(9835672.5);
//use GETTER method read the data:
        System.out.println("Updated salary:" +Doc3.getSalary() +"\n");
    }
}
