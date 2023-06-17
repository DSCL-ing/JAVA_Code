package 图书管理系统_JDBC_MySQL.Book;


//存储

public class BookList {
    private int capacity =4;
    private BookInfo[] books = new BookInfo[capacity];
    private int usedSize;                       //已存储书的个数




    /**
     * 事先通过构造方法  初始化的时候 给数组里面预存3本书，usedSize = 3;
     */
    public BookList() {


//        books[0] = new BookInfo("三国演义", "罗贯中", 89, "小说");
//        books[1] = new BookInfo("西游记", "吴承恩", 78, "小说");
//        books[2] = new BookInfo("红楼梦", "曹雪芹", 49, "小说");
//        this.capacity = 4;
        this.usedSize = 0;
//        BookInfo[] books = new BookInfo[capacity];
    }

    public void  checkCapatity() {
        if (this.getUsedSize() == this.getCapacity()) {
            int capacity = this.getCapacity() * 2;
            BookInfo[] books = new BookInfo[capacity];
            for (int i = 0;i< this.getUsedSize();++i) {
                books[i] = this.getBooks()[i];
            }
            this.setBooks(books);
            this.setCapacity(capacity);
        }
    }

    //成员设置方法

    public BookInfo[] getBooks() {
        return books;
    }

    public void setBooks(BookInfo[] books) {
        this.books = books;
    }

    //将书放入书架
    public void setBookList(int index, BookInfo book) {
        books[index] = book;
    }

    public BookInfo[] getBookList() {
        return books;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

