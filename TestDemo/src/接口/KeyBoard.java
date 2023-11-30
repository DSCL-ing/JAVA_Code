package 接口;

public class KeyBoard implements IUSB{


    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }

    public void inPut() {
        System.out.println("从键盘输入 ");
    }
}
