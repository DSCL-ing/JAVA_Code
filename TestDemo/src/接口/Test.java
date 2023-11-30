package 接口;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        computer.open();
        computer.useDevice(mouse); //向上转型
        computer.useDevice(keyBoard);
        computer.close();
    }
}
