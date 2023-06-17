package 图书管理系统_JDBC_MySQL.UI;

import 图书管理系统_JDBC_MySQL.User.*;


import java.util.Scanner;

public class Login {

    public User login() {
        System.out.println("please input your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        /**
         * 把userName给Admin初始化,可以通过构造方法初始化(包含帮助父类初始化)
         */

        while (true) {
            System.out.println("Please select your identity：1-》管理员，0-》普通用户"); //请选择你的身份
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    return new NormalUser(userName);
                case 1:
                    return new AdminUser(userName);
                default:
                    System.out.println("input error! Please re-enter");
                    System.out.println("Exit:enter Ctrl+D");
            }
        }


    }

}
