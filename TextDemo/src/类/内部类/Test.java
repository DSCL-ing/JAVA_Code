package 类.内部类;

/** note
 * 内部类生成的字节码文件名:
 * 外部类名$内部类名.class
 *
 * 功能,对类内部细节再封装,在设计上(也可以不用)
 */


class OuterClass { //外部类
    public  int data1 =1 ;
    private  int data2 = 2;
    public static int data3 = 3;
    static class InnerClass { //静态内部类
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;
        public void func() {
            System.out.println("static->InnerClass::func()");
            //内部类自己的成员无访问限制
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            //内部类访问外部类成员演示
//            System.out.println(data1);//无法访问,未实例化
//            System.out.println(data2);//无法访问,未实例化
            System.out.println(data3);//可以访问,静态成员
            //访问外部成员的方法
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.data1);
            System.out.println(outerClass.data2);
        }
    }

    public void test() {
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        //内部类没实例化则无法访问
//        System.out.println(data4);
//        System.out.println(data5);
//        System.out.println(data6);
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.data4);
        System.out.println(innerClass.data5);//外部类可以访问静态内部类当中的所有成员
        System.out.println(InnerClass.data6);//可以通过类名或对象名访问
    }
}

class OuterClass2 {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    //非静态内部类
    class InnerClass2 {
        public int data4 = 4;
        private int data5 = 5;
        public static final int data6 = 6;//非静态内部类不能定义静态,只能定义final的

        //<---因为 非静态依赖于对象,而静态不依赖,矛盾
        public void func() {
            System.out.println("InnerClass::func()");
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }
        //非静态还可以有重名,this指内部类的,外部类名.this 才是外部类的
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
//3还有局部内部类(方法内定义,基本不用)

//4匿名内部类 格式:new Ixx(){重写}.调用

public class Test {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        //实例化需要依赖外部类的对象来实例化,麻烦,不推荐
        //outerClass.new
        OuterClass2.InnerClass2 innerClass2 = outerClass2.new InnerClass2();
        innerClass2.func();
    }

    public static void main1(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.func();
    }
}




