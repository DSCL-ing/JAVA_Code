package 图书管理系统_JDBC_MySQL;

import 图书管理系统_JDBC_MySQL.Book.BookList;
import 图书管理系统_JDBC_MySQL.JDBC.JDBCLoadData;
import 图书管理系统_JDBC_MySQL.UI.Login;
import 图书管理系统_JDBC_MySQL.User.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        BookList bookList = new BookList();
        JDBCLoadData jdbcLoadData = new JDBCLoadData();
        jdbcLoadData.JDBCLoadData(bookList);
        System.out.println(bookList);

        /** main逻辑
         * 登录程序:接收权限信息,启动对应用户系统
         * 用户x系统:执行对应菜单程序
         * 用户x菜单程序:接收用户信息后,显示对应用户的操作菜单,将操作指令传给后端
         * 用户x后端执行用户操作
         */

        User user = new Login().login();        //向上转型
        while(true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);     //动态绑定,多态
        }





    }
}
