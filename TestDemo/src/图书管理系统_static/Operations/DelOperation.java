package 图书管理系统_static.Operations;

import 图书管理系统_static.Book.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书 ");
        int index = FindOperation.Find(bookList);
        if (index == -1) {
            return;
        } else {
            for (; index < bookList.getUsedSize()-1; index++) {
                bookList.setBookList(index,bookList.getBookList()[index+1]);
            }
            bookList.setBookList(bookList.getUsedSize()+1,null);
            bookList.setUsedSize(bookList.getUsedSize()-1);
            System.out.println("删除成功!");
        }
    }
}
