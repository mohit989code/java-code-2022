//TODO: How to create Model_Class

package model_class;

public class Student {

    String name;
    int age;
    double percentage;

    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
