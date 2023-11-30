package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * @author c h j
 */


public class Demo1 {


    public static void main(String[] args) {

    }


    //数组交换
    public static void arraySwap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


//运行时间\当前时间
/*    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sort;
        long end = System.currentTimeMillis();
    }
*/


    /**
     * @function:拷贝数组
     * @param arr
     * @return: Copy a Array;
     */
    public static int[] myArrayCopy(int[] arr) {
        //思路：获取原字符串长度，遍历每个数组元素并拷贝过去
        if (arr == null) {
            return null;
        }
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }

    public static void main22(String[] args) {//22
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = myArrayCopy(arr1);

        System.out.println("myArrayCopy:");
        arr1[0]= 99;
        System.out.println(myToString(arr1));
        System.out.println(myToString(arr2));

        System.out.println("Arrays.copyOf:");
        arr2 = Arrays.copyOf(arr1,arr1.length);
        System.out.println(myToString(arr2));

        System.out.println("System.array:");
        System.arraycopy(arr1,0,arr2,1,arr1.length-1);
        System.out.println(myToString(arr2));


    }


    /**
     * @function_name :myToString:自定义toString
     * @param arr
     * @return The string type of arr;arr的字符串类型
     */
    public static String myToString(int[] arr) {
        //原理:字符串拼接
        if (arr == null) {
            return null;
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i < arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main21(String[] args) {//21
        int[] arr = null;//new int[]{1, 2, 3, 4};
        System.out.println(myToString(arr));

    }


    //汉诺塔
    //最快的方法：按两个的来写。
    public static void hanota(int n ,char A,char B ,char C) {
        if(n == 0){
            return;
        }
        hanota(n - 1, A, C, B);//将前n-1个借助C从A移动到B
        move(A, C);//移动
        hanota(n - 1, B, A, C);//将n-1个从B借助A移动到C -- 本质是把B调到A的位置，重新开始（递归）
    }


    public static void move(char pos1, char pos2) {
        System.out.print(pos1 + "->" + pos2 + " ");
    }

    public static void main20(String[] args) { //20
        hanota(3,'A','B','C');
        System.out.println();
    }


    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 10 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main19(String[] args) { //19
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year+" is not leap year");
        }
        return ;
    }


    //控制台打印X形
    public static void main18(String [] args) {//18
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //求圆面积和周长
    public static void main17(String[] args) {
        double r = 0.2;
        double pi = 3.14159;
        System.out.println("The girth for the circle is " + 2 * r * pi+" (m)");
        System.out.println("The area for the circle is " + r * r * pi+ " (m^2)");
    }

    /**
     * Fibonacci sequence 斐波那契数列 Non recursion algorithm 非递归算法
     *
     *
     */
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }


    /**
     * 递归法打印一个数的各个位。print the number of digits in each localtion of a number
     */
    public static void printDig(int n) {
        if (n <= 9) {
            System.out.print(n);
//            return;//不一定需要return ， 只要函数不再递归 <=> retrun
        } else {
            printDig(n / 10);
            System.out.print(" " + (n % 10));
        }
    }

    public static void main15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDig(n);
    }


    /**
     * 在只有1个数字单独出现的数组中，找出那个数字
     */
    public static void main14(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        int sum = array[0];//防止sum为其他值
        for (int i = 0; i < array.length; i++) {
            sum ^= array[i];
        }
        System.out.println(sum);
    }


    /**
     * 计算1个数在以存储在计算机中的形式中有多少个1（补码）
     */
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        //方法1有缺陷：不能计算负数，负数在计算机中以补码形式存储，反码+1
/*        while (n != 0) {
            if (n % 2 == 1) {
                ++count;
            }
            n /= 2;
        }*/
        //方法2：位运算更快
/*        while (n != 0) {
            if ((n & 1) == 1) {
                ++count;
            }
            n = n >>> 1;//如果是有符号右移，则负数永远不为0；除不尽
        }*/
        //方法3：多练
        while (n != 0) {
            n = n & (n - 1);//规律：每次&(n-1)，对应二进制就会少一个1，与多少次就有多少个1，直到n为0.
            ++count;
        }
        System.out.println(count);
    }

    /**
     * 求一个数有多少位，求一个数的位数
     * remainder：余数
     * armstrong number:阿姆斯特朗数
     * Narcissistic number：水仙花数
     *
     * @return digits:位数
     */
    public static int getDigits(int remainder) {
        int count = 0;
        while (remainder != 0) {
            remainder /= 10;
            ++count;
        }
        return count;
    }

    /**
     * 求次方
     * Math.pow(double a,double b);
     */
    public static int power(int n, int k) {
        int sum = 1;
        while (k > 0) {
            sum = sum * n;
            --k;
        }
        return sum;
    }

    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();

//        System.out.println(getDigits(n));
        for (int i = 1; i <= 1000000000; i++) {
            int n = i;
            int digits = getDigits(n);
            int k = digits;//记录求次方的次数
            int remainder = n;
            int modulo = 0;
            int sum = 0;
            while (digits > 0) {
                modulo = remainder % 10;
//                sum = sum +Power(modulo , k);  //两种方法求次方，
                sum = (int) (sum + Math.pow(modulo, k));
                remainder /= 10;
                --digits;
            }
            if (sum == n) {
                System.out.println(n + " ");
                //                System.out.println(n + "是水仙花数");
            } else {
//                System.out.println(n + "不是水仙花数");
            }
        }

    }


    /**
     * login program  登录程序
     * tip：字符串.equals("") 用于字符串比较
     */
    public static void login() {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        System.out.println("please enter your password:");
        while (count != 0) {
            String password = scanner.nextLine();
            if (password.equals("123456")) {               //*********************************--------
                System.out.println("login succeed");
                break;
            } else {
                --count;
                if (count > 0) {
                    System.out.println("password error! you have " + count + " more chances");
                } else {
                    System.out.println("don't have a chance,Account locked!");//没有机会，账号锁定
                }
            }
        }
    }

    public static void main11(String[] args) {
        login();
    }


    /**
     * 计算1-100的数字中9出现的次数
     */
    public static void main9(String[] args) {
        int n = 100;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 9) {
                ++count;
            }
            if (i / 10 == 9) {
                ++count;
            }
        }
        System.out.println(count);
    }


    /**
     * 计算 1-100分之1的和
     */
    public static void main8(String[] args) {
        int n = 100;
        double sum = 0.0;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i * k;
//            k = -1 * k;   //c语言
            k = -k;         //java
        }
        System.out.println(sum);
    }


    /**
     * 辗转相除法求最大公约数（思路）
     * tip：还不会引用
     */
    public static void main7(String[] args) {
        int a = 24;
        int b = 18;
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println("最大公约数为" + b);
    }


    /**
     * 九九乘法口诀表（下三角）
     * times（乘以）  minus（减去）  plus（加上）  devide（除以）
     */
    public static void main6(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }


    /**
     * 判断是否闰年    judge whether leap year
     */
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            //普通闰年：能被4整除，但不能是100的倍数
            //世纪闰年：能被400整除
            if (n % 4 == 0 && n % 100 != 0) {
                System.out.println("is normal leap year");
            } else if (n % 400 == 0) {  //可以合并到一个if语句
                System.out.println("is century leap year");
            } else {
                System.out.println("is not leap year");
            }
        }
    }


    /**
     * copy the entered number  复制输入的数字
     */
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n);
        }
    }


    /**
     * prpject：guess number game
     */
    public static void main3(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rand = 0;
        int i = 100;
        while (i-- > 0) {
            rand = random.nextInt(100);//0-99
            System.out.print(rand + " ");
        }
        System.out.println();
        while (true) {
            int n = scanner.nextInt();
            if (n < rand) {
                System.out.println("guess is small");
            } else if (n == rand) {
                System.out.println("guess is right");
                break;
            } else {
                System.out.println("guess is large");
            }
        }
        scanner.close();// <=> fclose

    }


/**
 * @author chj  //著者author ^(*￣(oo)￣)^
 * tip1：素数大于1
 * 中文：素数    英文：prime number
 * tip2:最小因数最大为根号n。
 */

    /**
     * chinese:判断一个数是不是素数
     * english:judge whether a number is prime number
     * tip:Determine(决定)
     */
    public static void main2(String[] args) { //arguments
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n < 2) {
                System.out.println("is not prime number");
            } else if (n == 3 || n == 2) {
                System.out.println("is prime number");
            } else {
                int i = 2;
                for (; i <= Math.sqrt(n); i++) {

                    if (n % (i) == 0) {
                        System.out.println("is not prime number");
                        break;
                    }
                }
                if (i > Math.sqrt(n)) {
                    System.out.println("is prime number");
                }
            }
        }
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("少年");
        } else if (age < 28) {
            System.out.println("青年");
        } else if (age < 55) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }


    }
}



