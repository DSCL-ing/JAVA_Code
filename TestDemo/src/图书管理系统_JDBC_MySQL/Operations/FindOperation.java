package 图书管理系统_JDBC_MySQL.Operations;

import 图书管理系统_JDBC_MySQL.Book.BookInfo;
import 图书管理系统_JDBC_MySQL.Book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Find(bookList);
    }


    static int Find(BookList bookList) {
        System.out.println("请输入书名:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int index = -1;
        for (BookInfo x : bookList.getBookList()) {
            ++index;
            if (name.equals(x.getName())) {
                System.out.println("找到了");
                return index;

            }
        }
        System.out.println("找不到");
        return -1;
    }

}
