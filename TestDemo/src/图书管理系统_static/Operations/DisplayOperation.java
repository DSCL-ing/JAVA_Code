package 图书管理系统_static.Operations;

import 图书管理系统_static.Book.*;


public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("陈列所有图书");
        for (BookInfo x : bookList.getBookList()) {
            System.out.println(x);
        }
    }
}
