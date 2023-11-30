package 作业;


class EmpInfo {
    public String name;
    public String designation;
    public String department;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.designation);
        System.out.println(this.department);
    }

    public EmpInfo(String name, String designation, String department) {
        this.name = name;
        this.designation = designation;
        this.department = department;
    }
}

public class WorkTest {


    public static void main(String[] args) {
        EmpInfo empInfo = new EmpInfo("a","b","c");
        empInfo.print();
    }
}
