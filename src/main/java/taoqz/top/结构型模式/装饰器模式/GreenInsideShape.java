package taoqz.top.结构型模式.装饰器模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/20
 **/
public class GreenInsideShape extends ShapeDecorator{

    public GreenInsideShape(Shape shape) {
        super(shape);
        setGreenInside(shape);
    }

    private void setGreenInside(Shape shape) {
        System.out.println("add inside green");
    }
}
