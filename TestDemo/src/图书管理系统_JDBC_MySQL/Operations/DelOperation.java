package 图书管理系统_JDBC_MySQL.Operations;

import 图书管理系统_JDBC_MySQL.Book.BookList;
import 图书管理系统_JDBC_MySQL.JDBC.JDBCDelete;

import java.sql.SQLException;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) throws SQLException {
        System.out.println("删除图书 ");
        int index = FindOperation.Find(bookList);
        if (index == -1) {
            return;
        } else {
            JDBCDelete jdbcDelete = new JDBCDelete();
            jdbcDelete.jdbcDelete(bookList.getBooks()[index].getName());
            for (; index < bookList.getUsedSize(); index++) {
                bookList.setBookList(index,bookList.getBookList()[index+1]);
            }


            bookList.setBookList(bookList.getUsedSize()-1,null);
            bookList.setUsedSize(bookList.getUsedSize()-1);
            System.out.println("删除成功!");
        }

    }
}
