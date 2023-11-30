package 接口;

public class Computer {
    public void open() {
        System.out.println("开机");
    }

    public void close() {
        System.out.println("关机");
    }

    public void useDevice(IUSB iusb) {
        iusb.openDevice();
        if (iusb instanceof Mouse) { //向下转型
            Mouse mouse = (Mouse) iusb;
            mouse.click();
        } else if (iusb instanceof KeyBoard) {
            KeyBoard keyboard = (KeyBoard) iusb;
            keyboard.inPut();
        }
        iusb.closeDevice();
    }
}
