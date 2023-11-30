package 图书管理系统_JDBC_MySQL.Book;
//import 图书管理系统.Book.BookList;

public class BookInfo {
    //成员变量
    private String name;        //书名
    private String author;      //著者
    private int price;          //价格
    private String Type;        //类型
    private int isBorrowed; //是否已被借出

    //构造方法:帮助初始化

    public BookInfo() {
    }

    public BookInfo(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.Type = type;

    }





    //成员设置方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(int borrowed) {
        isBorrowed = borrowed;
    }

    //成员信息方法


    @Override
    public String toString() {
        return "BookInfo{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", Type='" + Type + '\'' +
                ", 借阅情况='" + ((isBorrowed == 1)?"已借出":"未借出") + "'" + //'\'' 和 "'"等价
//                ", isBorrowed=" + isBorrowed +
                '}';
    }
}

