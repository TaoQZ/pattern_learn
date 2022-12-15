package taoqz.top.结构型模式.桥接模式;

/**
 *
 * 所谓的修正类：将 Car 和 Engine 组合起来，可以根据变化组合出属性不同的类，而不用去新建类来应对变化
 *
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/15
 **/
public abstract class RefinedCar extends Car {

    private String brandName;

    public RefinedCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("drive   " + this.getBrandName() + "   ....");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
