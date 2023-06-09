package �ʼ�;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * @author 26390
 */


public class Demo1 {


    public static void main(String[] args) {

    }


    //���齻��
    public static void arraySwap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


//����ʱ��\��ǰʱ��
/*    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sort;
        long end = System.currentTimeMillis();
    }
*/


    /**
     * @function:��������
     * @param arr
     * @return: Copy a Array;
     */
    public static int[] myArrayCopy(int[] arr) {
        //˼·����ȡԭ�ַ������ȣ�����ÿ������Ԫ�ز�������ȥ
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
     * @function_name :myToString:�Զ���toString
     * @param arr
     * @return The string type of arr;arr���ַ�������
     */
    public static String myToString(int[] arr) {
        //ԭ��:�ַ���ƴ��
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


    //��ŵ��
    //���ķ���������������д��
    public static void hanota(int n ,char A,char B ,char C) {
        if(n == 0){
            return;
        }
        hanota(n - 1, A, C, B);//��ǰn-1������C��A�ƶ���B
        move(A, C);//�ƶ�
        hanota(n - 1, B, A, C);//��n-1����B����A�ƶ���C -- �����ǰ�B����A��λ�ã����¿�ʼ���ݹ飩
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


    //����̨��ӡX��
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

    //��Բ������ܳ�
    public static void main17(String[] args) {
        double r = 0.2;
        double pi = 3.14159;
        System.out.println("The girth for the circle is " + 2 * r * pi+" (m)");
        System.out.println("The area for the circle is " + r * r * pi+ " (m^2)");
    }

    /**
     * Fibonacci sequence 쳲��������� Non recursion algorithm �ǵݹ��㷨
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
     * �ݹ鷨��ӡһ�����ĸ���λ��print the number of digits in each localtion of a number
     */
    public static void printDig(int n) {
        if (n <= 9) {
            System.out.print(n);
//            return;//��һ����Ҫreturn �� ֻҪ�������ٵݹ� <=> retrun
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
     * ��ֻ��1�����ֵ������ֵ������У��ҳ��Ǹ�����
     */
    public static void main14(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        int sum = array[0];//��ֹsumΪ����ֵ
        for (int i = 0; i < array.length; i++) {
            sum ^= array[i];
        }
        System.out.println(sum);
    }


    /**
     * ����1�������Դ洢�ڼ�����е���ʽ���ж��ٸ�1�����룩
     */
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        //����1��ȱ�ݣ����ܼ��㸺���������ڼ�������Բ�����ʽ�洢������+1
/*        while (n != 0) {
            if (n % 2 == 1) {
                ++count;
            }
            n /= 2;
        }*/
        //����2��λ�������
/*        while (n != 0) {
            if ((n & 1) == 1) {
                ++count;
            }
            n = n >>> 1;//������з������ƣ�������Զ��Ϊ0��������
        }*/
        //����3������
        while (n != 0) {
            n = n & (n - 1);//���ɣ�ÿ��&(n-1)����Ӧ�����ƾͻ���һ��1������ٴξ��ж��ٸ�1��ֱ��nΪ0.
            ++count;
        }
        System.out.println(count);
    }

    /**
     * ��һ�����ж���λ����һ������λ��
     * remainder������
     * armstrong number:��ķ˹������
     * Narcissistic number��ˮ�ɻ���
     *
     * @return digits:λ��
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
     * ��η�
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
            int k = digits;//��¼��η��Ĵ���
            int remainder = n;
            int modulo = 0;
            int sum = 0;
            while (digits > 0) {
                modulo = remainder % 10;
//                sum = sum +Power(modulo , k);  //���ַ�����η���
                sum = (int) (sum + Math.pow(modulo, k));
                remainder /= 10;
                --digits;
            }
            if (sum == n) {
                System.out.println(n + " ");
                //                System.out.println(n + "��ˮ�ɻ���");
            } else {
//                System.out.println(n + "����ˮ�ɻ���");
            }
        }

    }


    /**
     * login program  ��¼����
     * tip���ַ���.equals("") �����ַ����Ƚ�
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
                    System.out.println("don't have a chance,Account locked!");//û�л��ᣬ�˺�����
                }
            }
        }
    }

    public static void main11(String[] args) {
        login();
    }


    /**
     * ����1-100��������9���ֵĴ���
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
     * ���� 1-100��֮1�ĺ�
     */
    public static void main8(String[] args) {
        int n = 100;
        double sum = 0.0;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i * k;
//            k = -1 * k;   //c����
            k = -k;         //java
        }
        System.out.println(sum);
    }


    /**
     * շת����������Լ����˼·��
     * tip������������
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
        System.out.println("���Լ��Ϊ" + b);
    }


    /**
     * �žų˷��ھ��������ǣ�
     * times�����ԣ�  minus����ȥ��  plus�����ϣ�  devide�����ԣ�
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
     * �ж��Ƿ�����    judge whether leap year
     */
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            //��ͨ���꣺�ܱ�4��������������100�ı���
            //�������꣺�ܱ�400����
            if (n % 4 == 0 && n % 100 != 0) {
                System.out.println("is normal leap year");
            } else if (n % 400 == 0) {  //���Ժϲ���һ��if���
                System.out.println("is century leap year");
            } else {
                System.out.println("is not leap year");
            }
        }
    }


    /**
     * copy the entered number  �������������
     */
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n);
        }
    }


    /**
     * prpject��guess number game
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
 * @author chj  //����author ^(*��(oo)��)^
 * tip1����������1
 * ���ģ�����    Ӣ�ģ�prime number
 * tip2:��С�������Ϊ����n��
 */

    /**
     * chinese:�ж�һ�����ǲ�������
     * english:judge whether a number is prime number
     * tip:Determine(����)
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
            System.out.println("����");
        } else if (age < 28) {
            System.out.println("����");
        } else if (age < 55) {
            System.out.println("����");
        } else {
            System.out.println("����");
        }


    }
}



