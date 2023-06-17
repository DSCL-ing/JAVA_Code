package 图书管理系统_JDBC_MySQL.JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBookList {

    public void CreateTableBookList() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String sql = "create table BookList(" +
                "usedSize int not null," +
                "capacity int not null" +";";
        PreparedStatement statement = connection.prepareStatement(sql);

        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

        statement.close();
        connection.close();
    }

    public void Update() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        int usedSize = scanner.nextInt();

        String sql = "update BookList set usedSzie= ? ;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, usedSize);

        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

        statement.close();
        connection.close();
    }

    public void DropTable() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String sql = "drop table BookList;";
        PreparedStatement statement = connection.prepareStatement(sql);

        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

        statement.close();
        connection.close();
    }

    public void SelectCount() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String sql = "select count(*) from BookInfo";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {

            String name = resultSet.getString("name");
            String author = resultSet.getString("author");
            int price = resultSet.getInt("price");
            String type = resultSet.getString("type");
            String isBorrowed = resultSet.getString("isBorrowed");
            System.out.println("name = " + name + ", author =" + author + ", price = " + price + ", type =" + type + ", isBorrowed = " + isBorrowed);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

}
