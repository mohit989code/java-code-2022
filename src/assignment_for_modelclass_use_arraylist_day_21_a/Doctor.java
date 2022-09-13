package assignment_for_modelclass_use_arraylist_day_21_a;

import java.util.Objects;

public class Doctor {

    String Name;
    String Qualification;
    Double Salary;

    //Override Hashcode and Equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Name.equals(doctor.Name) && Qualification.equals(doctor.Qualification) && Salary.equals(doctor.Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Qualification, Salary);
    }


    //Parameterized Constructor

    public Doctor(String name, String qualification, Double salary) {
        Name = name;
        Qualification = qualification;
        Salary = salary;
    }
    //Getter and Setter


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}
