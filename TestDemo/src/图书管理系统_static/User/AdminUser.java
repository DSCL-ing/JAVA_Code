package 图书管理系统_static.User;

import 图书管理系统_static.Operations.*;
import 图书管理系统_static.UI.Menu;

public class AdminUser extends User {


    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
                //陈列图书
                //增加图书
                //删除图书
                //查找图书
                //退出系统
        };
    }

    @Override
    public int menu() {
        return new Menu().adminMenu(name);
    }
}




