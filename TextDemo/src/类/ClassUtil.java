package 类;

class Animal{
    public String name;
    public int age;
    public void eat() {
        System.out.println(name + "正在吃饭!");
    }
}

class Dog extends Animal {
    public void wangwang() {
        System.out.println(name + "正在叫!");
    }
}

class Cat extends Animal {
    public void miaomiao() {
        System.out.println(name + "正在喵喵叫!");
    }
}

class Bird extends Animal {
    public void fly(){
        System.out.println(name + "正在飞");
    }
}

























public class ClassUtil {

    private int year;//封装
    int month;
    public int day;
    public static int classroom = 107 ;
    public ClassUtil() {
        this(3,3,3); //this必须放在第一行
        System.out.println("调用了不带参数的构造方法");
    }

    public ClassUtil(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
//        day = 1999;   //不能这么写
        show();
        System.out.println("调用了带3个参数的构造方法");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return this.year; //封装后的对外接口
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override //Override是注解,注解有很多种
    //生成方法:可以在generate中生成
    /*@Override*/ //此处的Override意思是当前方法是被重写的

    //打印类型时调用的方法
    public String toString() {
        return "类.ClassUtil{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
        /**
         * 在构造中打印,自己写调用自己的,不写调用object类的,涉及到'继承'
         */
    }

    public void setDate(ClassUtil this, int year, int month, int day) {
        {
            year = year;
            month = month;
            day = day;
            //错误! 如果不用this指明,根据'局部变量优先使用'规则,=号两边都是相同的局部变量,即自己给自己赋值,没有给对象赋值.
        }

        {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        //局部变量优先
    }

    public void show(ClassUtil this) {
        System.out.println(this.year + "-" + this.month + "- " + this.day + "");
    }

    public static void main1(String[] args) {
//        类.ClassUtil classUtil = new 类.ClassUtil();
//        System.out.println(classUtil.getYear());
//        System.out.println(类.ClassUtil.classroom);
//        System.out.println(classUtil);
        Dog dog = new Dog();
        dog.wangwang();

    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        //向下转型
        Dog dog = (Dog) animal1;
        dog.name = "haha";
        dog.wangwang();

        if (animal1 instanceof Bird) {
            Bird bird = (Bird) animal1;
            bird.fly();
        }
    }
}
