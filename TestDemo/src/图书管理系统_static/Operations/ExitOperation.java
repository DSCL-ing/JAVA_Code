package 图书管理系统_static.Operations;

import 图书管理系统_static.Book.BookList;



public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);

    }
}
