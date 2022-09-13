package collection_program;

import model_class.Student;

import java.util.ArrayList;

public class StudentArrayList {

    //SYNTAX: Collection <DATATYPE> objName= new Collection();

    public ArrayList<Student> createStudentArrayList() {

        ArrayList <Student> studentArrayList = new ArrayList<>();

        // create student object

        Student student1 = new Student("Rohan", 22, 99.32);
        Student student2 = new Student("Mohan", 25, 87.46);
        Student student3 = new Student("Sohan", 28, 84.75);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
  return studentArrayList;
    }

    public static void main(String[] args) {

        StudentArrayList obj= new StudentArrayList();
       ArrayList<Student> students=obj.createStudentArrayList();

       for (Student var: students){

           System.out.println("Print...." +"\t" +"\t" +"Student Name :" +var.getName()   +"\t" +"\t"    +"Age :"+var.getAge() +"\t" +"\t" +"Percentage :"+var.getPercentage());

        }
    }
}
