package 图书管理系统_static.Operations;

import 图书管理系统_static.Book.BookList;

public class BorrowOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        int index = FindOperation.Find(bookList);
        if (index == -1) {
//            System.out.println("没有你要借阅的书");
            return;
        } else {
            if (bookList.getBookList()[index].isBorrowed()) {
                System.out.println("该书已被借出");
            } else {
                bookList.getBookList()[index].setBorrowed(true);
                System.out.println("借阅图书成功");
            }
        }
    }



}
