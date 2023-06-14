package 图书管理系统.Operations;

import 图书管理系统.Book.*;

public interface IOperation {
    /**
     *
     * @param bookList:书架实体
     */
    public abstract void work(BookList bookList);
}
