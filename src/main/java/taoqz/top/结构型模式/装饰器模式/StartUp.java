package taoqz.top.结构型模式.装饰器模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/20
 **/
public class StartUp {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();

        System.out.println("=====================");

        Shape redBorderShape = new RedBorderShape(circle);
        Shape greenInsideShape = new GreenInsideShape(redBorderShape);
        greenInsideShape.draw();

    }

}
