package assignment_for_modelclass_use_arraylist_day_21_a;

public class Engineer {

    String name;
    String branch;
    String designation;

    public Engineer(String name, String branch, String designation) {
        this.name = name;
        this.branch = branch;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
