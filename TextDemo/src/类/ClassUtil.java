package ��;

class Animal{
    public String name;
    public int age;
    public void eat() {
        System.out.println(name + "���ڳԷ�!");
    }
}

class Dog extends Animal {
    public void wangwang() {
        System.out.println(name + "���ڽ�!");
    }
}

class Cat extends Animal {
    public void miaomiao() {
        System.out.println(name + "����������!");
    }
}

class Bird extends Animal {
    public void fly(){
        System.out.println(name + "���ڷ�");
    }
}

























public class ClassUtil {

    private int year;//��װ
    int month;
    public int day;
    public static int classroom = 107 ;
    public ClassUtil() {
        this(3,3,3); //this������ڵ�һ��
        System.out.println("�����˲��������Ĺ��췽��");
    }

    public ClassUtil(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
//        day = 1999;   //������ôд
        show();
        System.out.println("�����˴�3�������Ĺ��췽��");
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
        return this.year; //��װ��Ķ���ӿ�
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override //Override��ע��,ע���кܶ���
    //���ɷ���:������generate������
    /*@Override*/ //�˴���Override��˼�ǵ�ǰ�����Ǳ���д��

    //��ӡ����ʱ���õķ���
    public String toString() {
        return "��.ClassUtil{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
        /**
         * �ڹ����д�ӡ,�Լ�д�����Լ���,��д����object���,�漰��'�̳�'
         */
    }

    public void setDate(ClassUtil this, int year, int month, int day) {
        {
            year = year;
            month = month;
            day = day;
            //����! �������thisָ��,����'�ֲ���������ʹ��'����,=�����߶�����ͬ�ľֲ�����,���Լ����Լ���ֵ,û�и�����ֵ.
        }

        {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        //�ֲ���������
    }

    public void show(ClassUtil this) {
        System.out.println(this.year + "-" + this.month + "- " + this.day + "");
    }

    public static void main1(String[] args) {
//        ��.ClassUtil classUtil = new ��.ClassUtil();
//        System.out.println(classUtil.getYear());
//        System.out.println(��.ClassUtil.classroom);
//        System.out.println(classUtil);
        Dog dog = new Dog();
        dog.wangwang();

    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        //����ת��
        Dog dog = (Dog) animal1;
        dog.name = "haha";
        dog.wangwang();

        if (animal1 instanceof Bird) {
            Bird bird = (Bird) animal1;
            bird.fly();
        }
    }
}
