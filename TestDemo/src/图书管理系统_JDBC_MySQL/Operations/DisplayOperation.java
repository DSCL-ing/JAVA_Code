package 图书管理系统_JDBC_MySQL.Operations;

import 图书管理系统_JDBC_MySQL.Book.*;


public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("陈列所有图书");
        for (int i = 0; i < bookList.getUsedSize(); ++i) {
            System.out.println(bookList.getBooks()[i]);
        }
    }
}
