package 图书管理系统.Operations;

import 图书管理系统.Book.*;


public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("陈列所有图书");
        for (BookInfo x : bookList.getBookList()) {
            System.out.println(x);
        }
    }
}
