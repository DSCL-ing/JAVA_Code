import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDelete {
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
        System.out.println("请输入要删除书籍的书名");
        String name = scanner.next();
        String sql = "Delete from BookList where name ="+name+";";
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
