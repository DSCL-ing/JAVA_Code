package ��.�ڲ���;

/** note
 * �ڲ������ɵ��ֽ����ļ���:
 * �ⲿ����$�ڲ�����.class
 *
 * ����,�����ڲ�ϸ���ٷ�װ,�������(Ҳ���Բ���)
 */


class OuterClass { //�ⲿ��
    public  int data1 =1 ;
    private  int data2 = 2;
    public static int data3 = 3;
    static class InnerClass { //��̬�ڲ���
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;
        public void func() {
            System.out.println("static->InnerClass::func()");
            //�ڲ����Լ��ĳ�Ա�޷�������
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            //�ڲ�������ⲿ���Ա��ʾ
//            System.out.println(data1);//�޷�����,δʵ����
//            System.out.println(data2);//�޷�����,δʵ����
            System.out.println(data3);//���Է���,��̬��Ա
            //�����ⲿ��Ա�ķ���
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.data1);
            System.out.println(outerClass.data2);
        }
    }

    public void test() {
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        //�ڲ���ûʵ�������޷�����
//        System.out.println(data4);
//        System.out.println(data5);
//        System.out.println(data6);
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.data4);
        System.out.println(innerClass.data5);//�ⲿ����Է��ʾ�̬�ڲ��൱�е����г�Ա
        System.out.println(InnerClass.data6);//����ͨ�����������������
    }
}

class OuterClass2 {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    //�Ǿ�̬�ڲ���
    class InnerClass2 {
        public int data4 = 4;
        private int data5 = 5;
        public static final int data6 = 6;//�Ǿ�̬�ڲ��಻�ܶ��徲̬,ֻ�ܶ���final��

        //<---��Ϊ �Ǿ�̬�����ڶ���,����̬������,ì��
        public void func() {
            System.out.println("InnerClass::func()");
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
        //�Ǿ�̬������������,thisָ�ڲ����,�ⲿ����.this �����ⲿ���
    }
    public void test() {
        InnerClass2 innerClass2 = new InnerClass2();
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(innerClass2.data4);
        System.out.println(innerClass2.data5);
        System.out.println(InnerClass2.data6);
    }
}
//3���оֲ��ڲ���(�����ڶ���,��������)

//4�����ڲ��� ��ʽ:new Ixx(){��д}.����

public class Test {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        //ʵ������Ҫ�����ⲿ��Ķ�����ʵ����,�鷳,���Ƽ�
        //outerClass.new
        OuterClass2.InnerClass2 innerClass2 = outerClass2.new InnerClass2();
        innerClass2.func();
    }

    public static void main1(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.func();
    }
}




