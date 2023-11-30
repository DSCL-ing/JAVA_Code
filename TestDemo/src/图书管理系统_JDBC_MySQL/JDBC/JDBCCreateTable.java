package 图书管理系统_JDBC_MySQL.JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCCreateTable {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        // JDBC 需要通过以下步骤来完成开发.
        // 1. 创建并初始化一个数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");
        // 2. 和数据库服务器建立连接.
        Connection connection = dataSource.getConnection();
        // 4. 构造 SQL 语句
        String sql = "create table BookList(" +
                "name char(10) not null," +
                "author char(10) not null," +
                "price int not null," +
                "type char(10) not null," +
                "isBorrowed char(10) not null);";
        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setString(1, name);
//        statement.setString(2,author );
//        statement.setInt(3,price );
//        statement.setString(4,type );
//        statement.setString(5,isBorrowed);
//        // 这个打印需要加到拼接数据之后.打印sql语句
        System.out.println(statement);
        // 5. 执行 SQL 语句
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);
        // 6. 释放必要的资源
        statement.close();
        connection.close();
    }
}
