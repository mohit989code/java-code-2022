package assignment_for_modelclass_use_arraylist_day_21_a;

public class Employee {

    String name;
    int id;
    String profession;

    public Employee(String name, int id, String profession) {
        this.name = name;
        this.id = id;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
