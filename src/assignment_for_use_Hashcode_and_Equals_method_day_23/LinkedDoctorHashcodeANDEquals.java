//TODO:How to use  Hashcode and Equals Method

package assignment_for_use_Hashcode_and_Equals_method_day_23;

import assignment_for_modelclass_use_arraylist_day_21_a.Doctor;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedDoctorHashcodeANDEquals {

    public HashSet<Doctor> createDoctorHashcodeANDEquals(){

        LinkedHashSet<Doctor> doctors=new LinkedHashSet<>();

        Doctor doctor1=new Doctor("Rakesh","M.B.B.S",533434.56);
        System.out.println("Hashcode of S1 :" +doctor1.hashCode());

        Doctor doctor2=new Doctor("Rohan","M.D.S",533434.56);
        System.out.println("Hashcode of S2 :" +doctor2.hashCode());

        Doctor doctor3=new Doctor("Ravi","B.D.S",533434.56);
        System.out.println("Hashcode of S3 :" +doctor3.hashCode());

        Doctor doctor4=new Doctor("Rakesh","M.B.B.S",533434.56);
        System.out.println("Hashcode of S4 :" +doctor4.hashCode());

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);

        return doctors;

    }

    public static void main(String[] args) {

        LinkedDoctorHashcodeANDEquals obj=new LinkedDoctorHashcodeANDEquals();

        HashSet<Doctor> Doc=obj.createDoctorHashcodeANDEquals();

        for (Doctor Dr: Doc){
            System.out.println("Print Doctor Details :" +Dr.getName());
        }
    }
}
