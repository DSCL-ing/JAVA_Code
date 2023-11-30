package 克隆;

class Money implements Cloneable {
    public int money = 12;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {
    public int name  ;
    public Money m =new Money();

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", money=" + m +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Student stu=(Student)super.clone();
        stu.m = (Money)this.m.clone(); //加this代表是student1调用，不加this代表是stu调用，此处刚好都指向同一个Money
        return stu;
    }


}

public class test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student1 = new Student();
        student1.m.money = 99;
        Student student2 = (Student)student1.clone();
        System.out.println(student2.m.money);
        student1.m.money = 100;
        System.out.println(student2.m.money);
    }
}
