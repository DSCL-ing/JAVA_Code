package 图书管理系统;

import 图书管理系统.Book.BookInfo;
import 图书管理系统.Book.BookList;
import 图书管理系统.UI.Login;
import 图书管理系统.UI.Menu;
import 图书管理系统.User.AdminUser;
import 图书管理系统.User.User;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
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
