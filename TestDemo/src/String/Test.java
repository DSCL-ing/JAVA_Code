package String;

public class Test {
    //字符串构造
    public static void main1(String[] args) {

        //str1 和str2 等价
        String str1 = "hello";         //法1
        String str2 = new String("hello");//法2

        //字符数组,没有'\0',需要调用String构造转化
        char[] c = {'a', 'b', 'c', 'd'};
        String str3 = new String(c);//法3
    }

    //String 类
    /**
     * String只有两个类成员
     *
     * ""字符串常量也是String类型,可以使用String方法
     *
     * String 是个不变类，相当于基本类型，传参时不能改变 -- 值传递
     *
     */



    //String对象的比较
    public static void main2(String[] args) {
        String str1 = "hello";

        //length:输出字符串字符个数
        System.out.println(str1.length());//5

        String str2 = "";
        //isEmpty:判断字符串是否为0个字符,是则true,否则false
        System.out.println(str2.isEmpty());//true
        /*注意:不能使用在str = null; 没有实体*/

        //equals:比较两个对象内容是否一致
        System.out.println(str1.equals(str2));//false
        //equalsIgnoreCase:忽略大小写比较对象内容是否一致
        System.out.println(str1.equalsIgnoreCase(str2));

        //compareTo:比较两个对象内容大小,返回ascii差或长度差
        System.out.println(str1.compareTo(str2));
         //compareToIgnoreCase:忽略大小写比较两个对象内容大小
        System.out.println(str1.compareToIgnoreCase(str2));

    }

    //查找
    public static void main3(String[] args) {
        String str1 = "hellohello";

        //获取字符串中的某个位置的字符
        char ch = str1.charAt(1);
        System.out.println(ch);//e

        //获取字符串中某个字符第一次出现的位置
        System.out.println(str1.indexOf('e'));//1
        //从指定位置开始找某个字符
        System.out.println(str1.indexOf('o',1));//4
        //模式匹配(设计KMP)
        System.out.println(str1.indexOf("ll"));//2

        //从后往前找某字符,返回正序位置
        System.out.println(str1.lastIndexOf('e'));//6
        //在正序某位置开始从后往前找
        System.out.println(str1.lastIndexOf('o',8));//4
        //从后往前模式匹配
        //在正序某位置开始从后往前模式匹配
    }

    //转化
    public static void main4(String[] args) {
        //将不同类型转成字符串(类名直接调用方法:静态方法)
        String str1 = String.valueOf(1234);
        System.out.println(str1);

        //将字符串解析转成其他类型(类名直接调用方法:静态方法)
        String str2 = "123";//必须全是整型(同一类型),否则异常
        int value = Integer.parseInt(str2);
        System.out.println(value);

        //大小写转换
        //str.toUpperCase():转大写
        //str.toLowerCase():转小写

        //字符串转数组(字符数组)
        //str.toCharArray()

        //格式化输出
        //String.format("%d-%d-%d".2000,1,1).sout;

        //字符串替换
        //str.replace('a','b');//把所有的a换成b
        //str.replace("ab","cd");//把所有的ab换成cd
        //str.replaceAll("ab","cd");//和2一样
        //str.replaceFirst("a","b");//替换第一个
    }

    //拆分
    public static void main5(String[] args) {
        //str.split("regex"):字符串拆分(regex:正则表达式)
        System.out.println("=======字符串\"空格\"拆分==========");
        String str1 = "how are you";
        String[] strs1 = str1.split(" "); //regex为String类型
        for (String x : strs1) {
            System.out.println(x);
        }

        System.out.println("======带分组限制的字符串拆分===========");
        //str.split("regex",limit):带分组限制的字符串拆分
        String[] strs2 = str1.split(" ", 2);
        for (int i = 0; i < strs2.length; i++) {
            System.out.println(strs2[i]);
        }
        /*运行到n组就停止,不再分割*/

        System.out.println("=========.分隔符========");
        //转义
        String str3 = "192.168.0.1";
        String[] strs3 = str3.split("\\.");
        for (String x : strs3) {
            System.out.println(x);
        }

        System.out.println("=======\"//\"分隔符==========");
        String str4 = "192\\168\\1";
        String[] strs4 = str4.split("\\\\");
        for (String x : strs4) {
            System.out.println(x);
        }

        System.out.println("========不同分割符=========");
        String str5 = "192&168=1";
        String[] strs5 = str5.split("&|=");
        for (String x : strs5) {
            System.out.println(x);
        }
        /**
         * "."是正则表达式中特殊符号(通配符),需要转义让他成为普通符号,"\."就代表普通符号,故写成"\\."
         * 如果写成"\."是不对的,因为没有\.这个转义字符,是非法转义字符,会报错;也不符合普通符号规则
         * 还有一些特殊符号,如"|", "*", "+", "\"
         * "\"需要写成"\\\\"
         * 多个分割符用"|"分隔
         */

        //多次拆分
        System.out.println("======多次拆分===========");
        String str6 = "name=zhangsan&age=18";
        String[] strs6 = str6.split("&");
        for (String s : strs6) {
            String[] strings = s.split("=");
            for (String ss : strings ) {
                System.out.println(ss);
            }
        }

    }
    //截取
    public static void main6(String[] args) {//6
        //str.substring(n)字符串截取
        System.out.println("=======字符串截取============");
        String str1 = "abcdefgh";
        String s1 = str1.substring(2);//从2位置开始到末尾
        System.out.println(s1);

        //str.substring(n,m):字符串区间截取[)
        System.out.println("=======字符串区间截取============");
        String s2 = str1.substring(2, 6);//左闭右开,cdef
        System.out.println(s2);

        //str.trim():删除字符串左右两边空格(中间空格不动) //trim:修剪
        System.out.println("=======删除字符串左右两边空格============");
        String str3 = "     hello           ";
        String s3 = str3.trim();
        System.out.println(s3);

        //str.contains():包含:判定字符串中是否包含某个子字符串
        System.out.println("======判定字符串中是否包含某个子字符串=============");
        String str4 = "hello";
        System.out.println(str4.contains("ll")); //true
    }


    //常量池
    /**
     * 带""的字符串常量都是不可修改的,存放在字符串常量池中
     *
     * 官方没有定义字符串常量池
     * 字符串常量池底层是哈希表StringTable(C++的)
     *
     * 常量池存放在堆中
     *
     * 创建常量时,会"检查"常量池是否存在,不存在则创建,存在则不再创建
     *
     * 若存在:
     * a.如果是new的同一个内容的常量,则会在堆中开辟一个引用常量池的空间:常量已存在,堆中开辟个引用,栈再引用堆的引用
     * b.如果不是new的同一个内容的常量,就直接是栈变量引用
     *
     * 为了使程序的运行速度更快、
     * 更节省内存，Java为8种基本数据类型和String类都提供了常量池。
     *
     */

    //字符串常量不可修改的原因
    /**
     * 原因:String内字符数组value是被private封装的,访问不到.
     * 而不是因为final,final限制的是value不能更改引用对象,类似const
     */

    //为什么String设计成不可变的?后面学线程解释

    //String拼接效率非常低,少使用(不建议在循环中使用拼接)


    public static void main7(String[] args) { //7
        //StringBuilder:
        /**
         * 直接从常量池中取出,无临时变量,效率
         * StringBuilder的内容可以修改
         */

        //将字符串转为StringBuilder
        StringBuilder stringBuilder = new StringBuilder("hello");

        //StringBuilder.append():字符串追加拼接
        System.out.println("======字符串追加拼接=============");
        stringBuilder.append(" world");
        stringBuilder.append("!");
        System.out.println(stringBuilder);

        //reverse
        System.out.println("======字符串逆置=============");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.reverse();

        //将StringBuilder转为String
        System.out.println("=====把StringBuilder转为String==============");
        String str1 = stringBuilder.toString();
        System.out.println(str1);

        //Builder和buffer区别在多线程,锁,社么的

        //String可以直接赋值，StringBuffer必须调用

    }

}
