import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert {
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
        // 3. 从控制台读取用户的输入内容
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
        // 4. 构造 SQL 语句
        String sql = "insert into BookList value(?, ?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2,author );
        statement.setInt(3,price );
        statement.setString(4,type );
        statement.setString(5,isBorrowed);
        // 这个打印需要加到拼接数据之后.
        System.out.println(statement);
        // 5. 执行 SQL 语句
        int ret = statement.executeUpdate();
        System.out.println("ret = " + ret);
        // 6. 释放必要的资源
        statement.close();
        connection.close();
    }
}
