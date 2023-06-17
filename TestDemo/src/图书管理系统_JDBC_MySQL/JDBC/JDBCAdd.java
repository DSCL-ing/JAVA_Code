package 图书管理系统_JDBC_MySQL.JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import 图书管理系统_JDBC_MySQL.Book.BookInfo;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCAdd {
    public void jdbcAdd(BookInfo bookInfo, int index) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        // JDBC 需要通过以下步骤来完成开发.
        // 1. 创建并初始化一个数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("root");
        // 2. 和数据库服务器建立连接.
        Connection connection = dataSource.getConnection();
        // 3. 从控制台读取用户的输入内容


        String name = bookInfo.getName();
        String author = bookInfo.getAuthor();
        int price = bookInfo.getPrice();
        String type = bookInfo.getType();
        String isBorrowed ="" ;
        if (bookInfo.isBorrowed().equals("1")) {
            isBorrowed = "已借阅";
        } else if(bookInfo.isBorrowed().equals("0")){
            isBorrowed = "未借阅";
        }
        String sql1 = "insert into BookList value(?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql1);
        statement.setString(1, name);
        statement.setString(2, author);
        statement.setInt(3, price);
        statement.setString(4, type);
        statement.setString(5, isBorrowed);
        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

       // 6. 释放必要的资源
        statement.close();
        connection.close();
    }
}
