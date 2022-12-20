package taoqz.top.结构型模式.装饰器模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/20
 **/
public class ShapeDecorator implements Shape{

    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        this.shape.draw();
    }
}
