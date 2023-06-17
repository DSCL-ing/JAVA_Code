package 图书管理系统_static.User;

import 图书管理系统_static.Operations.*;
import 图书管理系统_static.UI.Menu;

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
}
