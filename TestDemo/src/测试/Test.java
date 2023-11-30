package 测试;
import java.util.*;


class Demo {

    public int div(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int[] array = new int[a];
        System.out.println(array[4]);
        return a / b;
    }
}

public class Test {

    public static void main (String[] args) {
        try {
            Demo demo = new Demo();
            int div1 = demo.div(5, 1);
            System.out.println();
//            int div2 = demo.div(5, 0);
            System.out.println();
            int div3 = demo.div(3, 1);
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("除零啦");
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
            System.out.println(e.toString());
        } finally{
            System.out.println("The program is over!");
        }

    }

    public static void main1(String[] args) {
        Demo demo = new Demo();
        try {
            demo.div(4, 0);
        } catch (Exception e) {
            System.out.println("除零啦!");
            System.out.println(e.toString());
        }
        System.out.println("System is over");

    }
}
