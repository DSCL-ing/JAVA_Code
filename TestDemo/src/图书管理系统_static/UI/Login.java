package 图书管理系统_static.UI;

import 图书管理系统_static.User.*;


import java.util.Scanner;

public class Login {

    public User login() {
        System.out.println("please input your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        while (true) {
            System.out.println("Please select your identity：1-》管理员，0-》普通用户"); 
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
