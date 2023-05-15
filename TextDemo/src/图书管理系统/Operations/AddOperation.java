package 图书管理系统.Operations;

import 图书管理系统.Book.*;

import java.util.Scanner;


public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("增加图书");
        System.out.println("请输入图书信息:");
        Scanner scan = new Scanner(System.in);
        System.out.println("书名:");
        String name = scan.nextLine();
        System.out.println("著者:");
        String author = scan.nextLine();
        System.out.println("定价:");
        int price = scan.nextInt();
        System.out.println("类型:");
        scan.nextLine();
        String type = scan.nextLine();

        BookInfo bookInfo = new BookInfo(name,author,price,type);//创建书的信息

        int used = bookList.getUsedSize();   //获取书架上书的数量
        bookList.setBookList(used,bookInfo); //将书放入书架
        bookList.setUsedSize(used+1);        //书的数量在原来的基础上加1
    }
}
