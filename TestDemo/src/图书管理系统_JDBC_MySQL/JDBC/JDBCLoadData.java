package 图书管理系统_JDBC_MySQL.JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import 图书管理系统_JDBC_MySQL.Book.BookInfo;
import 图书管理系统_JDBC_MySQL.Book.BookList;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCLoadData {
    public void JDBCLoadData(BookList bookList) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String sql2 = "select * from BookList";
        PreparedStatement statement2 = connection.prepareStatement(sql2);

        ResultSet resultSet2 = statement2.executeQuery();

        int used = 0;
        while (resultSet2.next()) {
            String name = resultSet2.getString("name");
            String author = resultSet2.getString("author");
            int price = resultSet2.getInt("price");
            String type = resultSet2.getString("type");
            String isBorrowed = resultSet2.getString("isBorrowed");

            bookList.checkCapatity();

            BookInfo bookInfo = new BookInfo();
            bookInfo.setName(name);
            bookInfo.setAuthor(author);
            bookInfo.setPrice(price);
            bookInfo.setType(type);
            if (isBorrowed.equals("已借阅")) {
                bookInfo.setBorrowed(1);
            } else {
                bookInfo.setBorrowed(0);
            }
            bookList.checkCapatity();
            bookList.setBookList(used,bookInfo); //将书放入书架
            bookList.setUsedSize(++used);        //书的数量在原来的基础上加1
        }



        resultSet2.close();
        statement2.close();
        connection.close();
    }
}
