package 多态;

class Shape {
    public String name;
    public void draw() {
        System.out.println(name+"画图形");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
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
        //多态法:圈复杂度为1,只有1个循环,没有条件语句
        Shape[] shape = {rect, cycle, rect, cycle, flower}; //向上转型:父类类型对象是子类
        for (Shape s : shape) {
            drawMap(s);
        }

        //条件语句
        //圈复杂度高,1循环3条件
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
