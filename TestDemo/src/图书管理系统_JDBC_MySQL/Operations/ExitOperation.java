package 图书管理系统_JDBC_MySQL.Operations;

import 图书管理系统_JDBC_MySQL.Book.BookList;

import java.sql.SQLException;


public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) throws SQLException {

        System.out.println("退出系统");
        System.exit(0);

    }
}
