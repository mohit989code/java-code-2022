//TODO: Program for EmployeeHashSet in modelclass
package assignment_for_modelclass_hashset_day_22;

import assignment_for_modelclass_use_arraylist_day_21_a.Employee;

import java.util.HashSet;

public class EmployeeHashset {

    public HashSet<Employee> createEmployeeHashset(){

        HashSet<Employee> emp =new HashSet<>();

        Employee employee1=new Employee("Rakesh",345444,"Software Engineer");
        Employee employee2=new Employee("Ravi",356434,"Hardware Engineer");
        Employee employee3=new Employee("Rohan",345444,"Technical Engineer");
        Employee employee4=new Employee("Rakesh",345444,"Software Engineer");

        emp.add(employee1);
        emp.add(employee2);
        emp.add(employee3);
        emp.add(employee4);

        return emp;

    }

    public static void main(String[] args) {

        EmployeeHashset obj=new EmployeeHashset();

        HashSet<Employee> employees=obj.createEmployeeHashset();

        for (Employee a: employees){
            System.out.println("Print a Data:" +a.getId());
        }

    }
}
