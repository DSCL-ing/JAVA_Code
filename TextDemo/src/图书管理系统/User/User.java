package 图书管理系统.User;

import 图书管理系统.Book.BookList;
import 图书管理系统.Operations.IOperation;


/**
 * 抽象出共有属性
 */
public abstract class User {
    //成员变量
    protected String name;                  //用户名
    protected IOperation[] iOperations ;    //存放操作方法类


    //构造方法

    public User(String name) {
        this.name = name;
    }

    //成员设置方法

    //成员信息方法

    //抽象方法:不能有方法体
    public abstract int menu();

    /**
     * 功能:通过choice指定操作类,通过向上转型后 执行work方法
     * @param choice
     * @param bookList:给work指定操作对象
     */
    public void doOperation(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }
}
