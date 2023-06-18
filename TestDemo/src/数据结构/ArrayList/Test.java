package 数据结构.ArrayList;

import 数据结构.ArrayList.Exception.IndexOutOfException;

public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);

        try {
            myArrayList.add(1, 99);
        } catch (IndexOutOfException e) {
            e.printStackTrace();
        }

        try {
            myArrayList.get(-1);
        } catch (IndexOutOfException e) {
            e.printStackTrace();
        }
    }
}
