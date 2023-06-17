package 图书管理系统_static.Book;


//存储

public class BookList {

    private BookInfo[] books = new BookInfo[10];
    private int usedSize;                       //已存储书的个数


    /**
     * 事先通过构造方法  初始化的时候 给数组里面预存3本书，usedSize = 3;
     */
    public BookList() {
        books[0] = new BookInfo("三国演义", "罗贯中", 89, "小说");
        books[1] = new BookInfo("西游记", "吴承恩", 78, "小说");
        books[2] = new BookInfo("红楼梦", "曹雪芹", 49, "小说");
        this.usedSize = 3;
    }


    //成员设置方法

    //将书放入书架
    public void setBookList(int index, BookInfo book) {
        books[index] = book;
    }

    public BookInfo[] getBookList() {
        return books;
    }

    //获取书的数量
    public int getUsedSize() {
        return usedSize;
    }

    //更改书的数量
    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }


    //成员信息方法
    /**
     * 没有意义
     */

}

