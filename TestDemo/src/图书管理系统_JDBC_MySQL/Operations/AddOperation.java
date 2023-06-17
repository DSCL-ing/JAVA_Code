package 图书管理系统_JDBC_MySQL.Operations;

import 图书管理系统_JDBC_MySQL.Book.*;
import 图书管理系统_JDBC_MySQL.JDBC.JDBCAdd;

import java.sql.SQLException;
import java.util.Scanner;


public class AddOperation implements IOperation{




    @Override
    public void work(BookList bookList) throws SQLException {

        bookList.checkCapatity();

        Scanner scan = new Scanner(System.in);

        System.out.println("增加图书");
        System.out.println("请输入图书信息:");

        System.out.println("书名:");
        String name = scan.next();
        System.out.println("著者:");
        String author = scan.next();
        System.out.println("定价:");
        int price = scan.nextInt();
        System.out.println("类型:");
        String type = scan.next();
        System.out.println("借阅情况");
        Integer isBorrowed = scan.nextInt();

        BookInfo bookInfo = new BookInfo(name,author,price,type);//创建书的信息

        JDBCAdd jdbcAdd = new JDBCAdd();
        jdbcAdd.jdbcAdd(bookInfo, bookList.getUsedSize());
//        System.out.println("保存到mysql");

        int used = bookList.getUsedSize();   //获取书架上书的数量
        bookList.setBookList(used,bookInfo); //将书放入书架
        bookList.setUsedSize(used+1);        //书的数量在原来的基础上加1
    }
}
