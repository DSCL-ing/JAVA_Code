package String;

public class Test {
    public static void main(String[] args) {

        //str1 和str2 等价
        String str1 = "hello";
        String str2 = new String("hello");
        //字符数组,没有'\0',需要调用String构造转化
        char[] values = {'a', 'b', 'c', 'd'};
        String str3 = new String(values);
    }

    //String 类
    /**
     * String只有两个类成员
     */

}
