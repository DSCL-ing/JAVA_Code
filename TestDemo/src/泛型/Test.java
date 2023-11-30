package 泛型;
import java.lang.reflect.Array;

//初识泛型
/**
 * 1.存储数据的时候,可以帮我们进行自动类型检查
 * 2.获取元素的时候,可以帮我们进行类型转换
 *
 * 类型参数化
 *
 * 是编译时的一种机制,在运行时没有泛型的概念 --擦除机制
 * 擦除机制:将某编译时的语法在执行时恢复成一般方法
 *
 *
 */

//语法格式
/**
 * class 泛型类名称<类型形参列表> {
 * }
 *
 * class Class_name<T,E,...>{
 * }
 * 其他和一般类一样,也可以继承
 *
 */

//语法解释


/**
 * 类名后的<T>代表占位符,表示当前类是一个泛型类
 * E表示Element
 * K表示Key
 * V表示Value
 * N表示Number
 * T表示Type
 * S,U,V等等-第二、第三、第四个类型
 * <p>
 * 指定的类型必须是引用类型
 * 语法规定:泛型当中不能实例化一个泛型类型的数组(不能new一个泛型类型的数组) -- 泛型不能作为数组类型
 */

//泛型上界

/**
 * class 泛型类名称<类型形参 extends 类型边界> {
 * }
 *
 *  示例:
 * class A<E extends Comparable<E>> {
 * }
 */



class MyArray<E extends Comparable<E> > {

//    {
//        //泛型数组写法1,有问题
//        public T[] obj = (T[]) new Object[3];
//    }

    //反射泛型写法
    public E[] obj;

    public MyArray(Class<E> clazz, int capacity) {
        obj = (E[]) Array.newInstance(clazz, capacity);
    }


    public E getPosObj(int pos) {
        return obj[pos];
    }

    public void setObj(int pos, E val) {
        obj[pos]= val;
    }
}

public class Test {
    //定义
    public static void main(String[] args) {
        //实例化对象的同时,指定当前泛型类的类型是Integer
        //对应泛型1：MyArray<Integer> myArray0 = new MyArray<Integer>(Integer);
        //省略写法: MyArray<Integer> myArray1 = new MyArray<>(); --编译器如果能推导出来类型

        //对应泛型2:
        MyArray<Integer> myArray = new MyArray<>(Integer.class, 6);


        //接下来存储数据时,只能存储Integer
        myArray.setObj(0,10);
        //myArray0.setObj(1,10.0);//报错
    }
    //注意
    /**
     *
     */


}
