package ��̬;

class Shape {
    public String name;
    public void draw() {
        System.out.println(name+"��ͼ��");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("������");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("��Բ");
    }
}


class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("?");
    }
}
public class Test{
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Rect rect= new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
//        drawMap(rect);
//        drawMap(cycle);
        //��̬��:Ȧ���Ӷ�Ϊ1,ֻ��1��ѭ��,û���������
        Shape[] shape = {rect, cycle, rect, cycle, flower}; //����ת��:�������Ͷ���������
        for (Shape s : shape) {
            drawMap(s);
        }

        //�������
        //Ȧ���Ӷȸ�,1ѭ��3����
        String[] string ={"rect", "cycle", "rect", "cycle", "flower"} ;
        for (String s : string) {
            if (s.equals("rect")) {
                drawMap(rect);
            } else if (s.equals("cycle")) {
                drawMap(cycle);
            }else{
                drawMap(flower);
            }
        }
    }
}
