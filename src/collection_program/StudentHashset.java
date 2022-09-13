//TODO: Program for Student Hashset

package collection_program;

import model_class.Student;

import java.util.HashSet;

public class StudentHashset {

    public HashSet<Student> createStudentHashset(){

        HashSet<Student> std=new HashSet<>();

        Student student1= new Student("Mohan",23,98.6);
        Student student2= new Student("Sohan",23,98.6);
        Student student3= new Student("Rohan",23,98.6);
        Student student4= new Student("Mohan",23,98.6);

        std.add(student1);
        std.add(student2);
        std.add(student3);
        std.add(student4);

        return std;

    }

    public static void main(String[] args) {
        StudentHashset Data=new StudentHashset();

        HashSet<Student> value=Data.createStudentHashset();

        for (Student var: value){
            System.out.println("Print Data :" +var.getName());
        }
    }
}
