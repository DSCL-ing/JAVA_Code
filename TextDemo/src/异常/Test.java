package 异常;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {

    /** note
     *
     *
     *
     *
     *
     * 异常分为:
     * 1.编译时异常/受查异常/受检查异常IOException:
     * 特点:红线,不能通过编译(红线不代表就是异常,也可能是"语法错误")
     * 2.运行时异常/非受查异常RuntimeException:
     *
     * 所有的运行时异常/非受查异常都继承了类RuntimeException
     * 所有的编译时异常/受查异常都继承了类IOException
     *
     * 编译时异常必须在报红线时处理掉
     *
     *
     */

    //异常的体系结构:(常见的)
    /** 异常种类繁多，为了对不同异常或者错误进行很好的分类管理，Java内部维护了一个异常的体系结构：
     *
     * throwable{
     *      1.Error
     *      2.Exception{
     *          a.IOExcepion{
     *              ①EOFException
     *              ②FileNotFoundException
     *              ③MalformedURLException
     *              ④UnknownHostException
     *          }
     *          b.ClassNotFoundException
     *          c.CloneNotSupportedException
     *          d.RuntimeException{
     *              ①ArithmeticException
     *              ②ClassCastException
     *              ③IIIegalArgumentException
     *              ④IndexOutOfBoundzException
     *              ⑤NoSuchElementExcepion
     *              ⑥NullPointerException
     *          }
     *      }
     * }
     *
     * 1.Throwable：是异常体系的顶层类，其派生出两个重要的子类, Error 和 Exception
     * 2.Error：指的是Java虚拟机无法解决的严重问题，比如：JVM的内部错误、资源耗尽等，典型代表：
     *   StackOverflowError和OutOfMemoryError，一旦发生回力乏术。
     * 3.Exception：异常产生后程序员可以通过代码进行处理，使程序继续执行。比如：感冒、发烧。我们平时所说
     *   的异常就是Exception。
     *
     *
     *
     *
     */

    //java.lang.ArithmeticException:算术异常
    public static void main1(String[] args) {//1
        //RuntimeException
        System.out.println(10 / 0);
    }

    //java.lang.NullPointerException :空指针异常:
    public static void main2(String[] args) {//2
        //RuntimeException
        int[] array = null;
        System.out.println(array.length);
    }

    //java.lang.ArrayIndexOutOfBoundsException :数组越界异常
    public static void main3(String[] args) {//3
        //IndexOutOfBoundsException
        int[] array = {1, 2, 3};
        System.out.println(array[10]);
    }

    //异常的处理

    /**
     * 1.防御式编程 LBYL:Look Before You Leap
     * 每一步都做检查.做下一步前必须保证每一步都是成功的.
     * 缺陷:正常流程和错误处理流程代码混在一起,代码整体显得比较混乱
     * <p>
     * 2.事后认错型 EAFP:It's Easier to Ask Forgivenss than permission
     * 先操作,遇到问题再集中处理
     * 优势:正常流程和错误流程是分离开的,代码更清晰,更容易理解
     * <p>
     * 异常处理的核心思想就是EAFP
     * <p>
     * java中,异常处理主要的5个关键字:throw,try,catch,final,throws
     * <p>
     * 异常处理的前提:触发/抛出异常
     * 1.代码自己执行过程中触发异常
     * 2.自己手动抛出异常:throw:扔
     * <p>
     * (抛出异常的信息:最上面/第一条是直接抛出异常的位置,其他地方是间接位置)
     * 抛出的异常是一个类
     * 抛出异常后,如果不经过任何处理,则遇到任何异常都会交给JVM处理:终止程序
     * 不会同时抛出多个异常
     * <p>
     * throw:
     * 1.一般都是用在自己自定义的异常上
     * 2.throw必须写在方法体内部
     * 3.抛出的对象必须是Exception或者Excepion的子类
     * 4.如果抛出的是RunTimeException或者RunTimeException的子类,则可以不用处理,直接交给JVM来处理
     * 5.如果抛出的是编译时异常,用户必须处理,否则无法通过编译
     * 6.异常一旦抛出,其后的代码就不再执行(捕获到了就直接跳到异常处理)
     *
     * 异常的捕获:主要有两种:异常声明throws和try-catch捕获处理
     *
     * throws:声明抛出的异常(解决受查异常)
     * 说明:处在方法声明的参数列表之后,当方法中抛出编译时异常,用户不想处理改异常,此时就可以借助throws将异常
     * 抛给方法的调用者来处理.即当前方法不处理异常,提醒方法的调用者处理异常
     * 1.throws必须跟在方法的参数列表之后
     * 2.声明的异常必须是Exception或者Exception的子类
     * 3.方法内部如果抛出了多个异常,throws之后必须跟多个异常类型,之间用逗号隔开,如果抛出多个异常类型具有父子关系
     * ,则直接声明父类即可
     */

    //try和catch和finally
    /**
     * 捕获异常与catch的顺序无关,抛出哪个异常就执行哪个catch(catch的书写不影响异常的捕获
     *
     */
    public static void main(String[] args) {//4
        Scanner scanner = new Scanner(System.in);
        try {
            int[] array = null;
            System.out.println(array.length);
            System.out.println("xxxxxxxx");//会被跳过
            //多个异常用|分隔
            //缺点:不知道哪个异常出现了问题
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("捕获到了NullPointerException异常");
        //父类不能在子类之前,否则报错.因为接下来子类异常没有任何意义
        } catch (Exception e) {
            System.out.println("捕获所有异常");
        }finally{//一般用于资源回收
            scanner.close();
            System.out.println("finally...");//最终,怎样都会执行,捕获和没有捕获和和没有异常JVM都可以
            //return 9; //不建议在finally中写return语句,因为finally会被强制执行,可能会破坏原有逻辑
        }
        System.out.println("后续流程");
    }



}
