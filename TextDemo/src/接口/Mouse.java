package 接口;

public class Mouse implements IUSB{

    @Override
    public void openDevice() {
        System.out.println("打开鼠标服务");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标服务");
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
