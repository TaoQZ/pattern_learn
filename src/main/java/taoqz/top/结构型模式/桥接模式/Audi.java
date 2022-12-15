package taoqz.top.结构型模式.桥接模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/15
 **/
public class Audi extends RefinedCar {
    public Audi(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrandName() {
        return "Audi";
    }
}
