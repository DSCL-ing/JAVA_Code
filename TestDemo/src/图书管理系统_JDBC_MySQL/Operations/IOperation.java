package 图书管理系统_JDBC_MySQL.Operations;

import 图书管理系统_JDBC_MySQL.Book.*;

import java.sql.SQLException;

public interface IOperation {
    /**
     *
     * @param bookList:书架实体
     */
    public abstract void work(BookList bookList) throws SQLException;
}
