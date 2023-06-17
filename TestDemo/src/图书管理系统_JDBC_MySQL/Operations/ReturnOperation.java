package 图书管理系统_JDBC_MySQL.Operations;

import 图书管理系统_JDBC_MySQL.Book.BookList;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("借阅图书");
        int index = FindOperation.Find(bookList);
        if (index == -1) {
            return;
        } else {
            if (bookList.getBookList()[index].isBorrowed()==1) {
                System.out.println("图书不需要归还");
            }else{
                bookList.getBookList()[index].setBorrowed(0);
                System.out.println("图书归还成功!");
            }
        }
    }
}
