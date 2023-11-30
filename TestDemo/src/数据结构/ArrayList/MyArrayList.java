package 数据结构.ArrayList;

import 数据结构.ArrayList.Exception.IndexOutOfException;

import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public final int DEFAULT_SIZE = 10;


    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        usedSize = 0;
    }


    //获取顺序表长度(有效数据个数)
    public int size() {
        return this.usedSize;
    }

    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; ++i) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; ++i) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //新增元素,默认在数组最后新增
    public void add(int data) {
        if (isFull()) {
            reszie();
        }
        this.elem[this.usedSize] = data;
        ++this.usedSize;
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        checkIndex(pos);
        if (isFull()) {
            reszie();
        }
        for (int i = usedSize - 1; i >= pos; --i) {
            elem[i + 1] = elem[i];
        }
        elem[pos] = data;
        usedSize++;
    }

    //检查add数据时的pos是否合法
    private void checkIndex(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new IndexOutOfException("函数的参数pos不合法");
        }
    }

    //判断是否为满
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    //扩容:只提供给Add方法 -> private
    private void reszie() {
//        int[] tmp = new int[this.elem.length * 2];
//        for (int i = 0; i < this.elem.length; ++i) {
//            tmp[i] = this.elem[i];
//        }
//        this.elem =tmp;
        this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);

    }

    //获取pos位置的元素
    public int get(int pos) {
        checkGetIndex(pos);
        return this.elem[pos];
    }

    private void checkGetIndex(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new IndexOutOfException("get函数的参数pos不合法");
        }
    }

    //给pos位置的元素设为value
    public void set(int pos, int value) {
        checkIndex(pos);
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public boolean remove(int toRemove) {
        int index = indexOf(toRemove);
        if (index == -1) {
            System.out.println("没有这个数据");
            return false;
        }
        for (int i = index; i < usedSize-1 ; i++) {
            elem[i] = elem[i + 1];
        }
        --usedSize;
        //elem[usedSize]= null;  //--引用类型
        elem[usedSize]= 0;
        return true;
    }

    //清空顺序表
    public void clear() {
//        for (int i = 0; i < usedSize; i++) {
//            //elem[i] = null;
//        }//引用
        usedSize = 0;
    }

    void display() {
        for (int x : this.elem) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}


