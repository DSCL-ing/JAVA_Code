package 图书管理系统_JDBC_MySQL.UI;

import java.util.Scanner;

public class Menu {
    public int adminMenu(String name) {
        /**
         *     //陈列图书
         *     //增加图书
         *     //删除图书
         *     //查找图书
         *     //退出系统
         */
        System.out.println("********************************");
        System.out.println("hello "+ name+"欢迎来到图书小练习! ");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("********************************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public int NormalMenu(String name) {
        System.out.println("********************************");
        System.out.println("hello "+name+"欢迎来到图书小练习! ");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出系统");
        System.out.println("********************************");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}
