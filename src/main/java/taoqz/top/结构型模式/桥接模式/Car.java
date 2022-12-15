package taoqz.top.结构型模式.桥接模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/15
 **/
public abstract class Car {

    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();

}
