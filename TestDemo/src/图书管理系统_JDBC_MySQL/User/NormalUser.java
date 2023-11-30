package 图书管理系统_JDBC_MySQL.User;

import 图书管理系统_JDBC_MySQL.Operations.*;
import 图书管理系统_JDBC_MySQL.UI.Menu;

public class NormalUser extends User{


    public NormalUser (String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        return new Menu().NormalMenu(name);
    }
    //借阅图书
    //归还图书
    //查找图书
    //退出系统


}
