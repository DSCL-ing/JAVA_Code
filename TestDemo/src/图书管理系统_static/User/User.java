package 图书管理系统_static.User;

import 图书管理系统_static.Book.BookList;
import 图书管理系统_static.Operations.IOperation;


public abstract class User {
    protected String name;                  
    protected IOperation[] iOperations ;    

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }
}
