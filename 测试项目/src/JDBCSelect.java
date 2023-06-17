import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCSelect {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        // 1. 创建并初始化数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/LibraryManagementSystem?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("root");
        // 2. 建立连接
        Connection connection = dataSource.getConnection();
        // 3. 构造 SQL
        String sql = "select * from BookList";
        PreparedStatement statement = connection.prepareStatement(sql);
        // 4. 执行 SQL
        ResultSet resultSet = statement.executeQuery();
        // 5. 遍历结果集合
        String selectName = scanner.next();
        while (resultSet.next()) {
            // 把 resultSet 想象成一个表格. 同时表格这里有个光标, 初始情况下光标指向表最上面~~
            // 每次调用 next, 光标往下走一行~~
            // 当光标指向某一行的时候, 就可以通过 getXXX 来获取到当前这行里的数据
            if(selectName.equals(resultSet.getString("name"))){
                String name = resultSet.getString("name");
                String author = resultSet.getString("author");
                int price = resultSet.getInt("price");
                String type = resultSet.getString("type");
                String isBorrowed = resultSet.getString("isBorrowed");
                System.out.println("name = " + name + ", author =" + author + ", price = " + price + ", type =" + type + ", isBorrowed = " + isBorrowed);
            }
        }
        // 6. 释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
