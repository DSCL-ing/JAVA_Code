package 图书管理系统_JDBC_MySQL.JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBookInfo {
    public void CreateTableBookInfo() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String sql = "create table BookInfo(" +
                "name char(10) not null," +
                "author char(10) not null," +
                "price int not null," +
                "type char(10) not null," +
                "isBorrowed char(10) not null);";
        PreparedStatement statement = connection.prepareStatement(sql);

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

        String sql = "drop table BookInfo;";
        PreparedStatement statement = connection.prepareStatement(sql);

        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

        statement.close();
        connection.close();
    }

    public void Delete() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        System.out.println("请输入要删除书籍的书名");
        String name = scanner.next();
        String sql = "Delete from BookList where name =?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

        statement.close();
        connection.close();
    }

    public void Insert() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        System.out.println("请输入书籍名字: ");
        String name = scanner.next();
        System.out.println("请输入书籍著者: ");
        String author = scanner.next();
        System.out.println("请输入书籍价格: ");
        int price = scanner.nextInt();
        System.out.println("请输入书籍类型: ");
        String type = scanner.next();
        System.out.println("请输入借阅情况（1为已借阅，0为未借阅）: ");
        String isBorrowed = scanner.next();
        if (isBorrowed.equals("1")) {
            isBorrowed = "已借阅";
        } else {
            isBorrowed = "未借阅";
        }

        String sql = "insert into BookInfo value(?, ?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2,author );
        statement.setInt(3,price );
        statement.setString(4,type );
        statement.setString(5,isBorrowed);

        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

        statement.close();
        connection.close();
    }

    public void Select() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String sql = "select * from BookList";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();

        String selectName = scanner.next();
        while (resultSet.next()) {
            if(selectName.equals(resultSet.getString("name"))){
                String name = resultSet.getString("name");
                String author = resultSet.getString("author");
                int price = resultSet.getInt("price");
                String type = resultSet.getString("type");
                String isBorrowed = resultSet.getString("isBorrowed");
                System.out.println("name = " + name + ", author =" + author + ", price = " + price + ", type =" + type + ", isBorrowed = " + isBorrowed);
            }
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

    public void SelectAll() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String sql = "select * from BookList";
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

    public void Update() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");

        Connection connection = dataSource.getConnection();

        String oldName = scanner.next();
        System.out.println("请输入书籍名字: ");
        String name = scanner.next();
        System.out.println("请输入书籍著者: ");
        String author = scanner.next();
        System.out.println("请输入书籍价格: ");
        int price = scanner.nextInt();
        System.out.println("请输入书籍类型: ");
        String type = scanner.next();
        System.out.println("请输入借阅情况（1为已借阅，0为未借阅）: ");
        String isBorrowed = scanner.next();
        if (isBorrowed.equals("1")) {
            isBorrowed = "已借阅";
        } else {
            isBorrowed = "未借阅";
        }

        String sql = "update BookList set " +
                "name = ? ," +
                "author = ? ," +
                "price = ?," +
                "type = ?," +
                "isBorrowed = ? " +
                "where name = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2,author );
        statement.setInt(3,price );
        statement.setString(4,type );
        statement.setString(5,isBorrowed);
        statement.setString(6,oldName);

        System.out.println(statement);
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);

        statement.close();
        connection.close();
    }
}
