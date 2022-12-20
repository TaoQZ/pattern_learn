package taoqz.top.结构型模式.装饰器模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/20
 **/
public class RedBorderShape extends ShapeDecorator {

    public RedBorderShape(Shape shape) {
        super(shape);
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("add red border");
    }

}
