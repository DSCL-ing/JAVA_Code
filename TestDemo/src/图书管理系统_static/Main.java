package 图书管理系统_static;

import 图书管理系统_static.Book.BookList;
import 图书管理系统_static.UI.Login;
import 图书管理系统_static.User.User;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        System.out.println(bookList);
		
        User user = new Login().login();        
        while(true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);     
        }
    }
}
