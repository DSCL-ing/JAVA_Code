package 数据结构.ArrayList.Exception;

//自定义Add数据下标越界异常
public class IndexOutOfException extends RuntimeException {
    public IndexOutOfException() {

    }

    public IndexOutOfException(String msg) {
        //调用父类的构造方法
        super(msg);
    }
}
