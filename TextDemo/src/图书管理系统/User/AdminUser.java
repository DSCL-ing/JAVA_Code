package 图书管理系统.User;

import 图书管理系统.Operations.*;
import 图书管理系统.UI.Menu;

public class AdminUser extends User {

    //构造方法

    /**
     * 功能:帮助父类初始化
     * @param name
     */
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

    //重写
    @Override
    public int menu() {
        return new Menu().adminMenu(name);
    }



}




