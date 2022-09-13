package assignment_for_modelclass_use_collection_day_21;

import assignment_for_modelclass_use_arraylist_day_21_a.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeArrayList(){

        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        Employee employee1= new Employee("Rakesh",3456544,"Data Scientist");
        Employee employee2= new Employee("Roshan",3577567,"Senior Section Engineer");
        Employee employee3= new Employee("Ramesh",7655785,"Contractor");

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        return employeeArrayList;

    }

    public static void main(String[] args) {

        EmployeeArrayList obj=new EmployeeArrayList();

        ArrayList<Employee> employee=obj.createEmployeeArrayList();

        for (Employee zorro:employee){
            System.out.println("Print Data...." +"\t" +"\t" +"Employee Name : " +zorro.getName() +"\t"+"\t" +"Employee id  :" +zorro.getId() +"\t"+"\t" +"Profession :" +zorro.getProfession());
        }
    }

}
