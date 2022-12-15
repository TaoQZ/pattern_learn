package taoqz.top.结构型模式.桥接模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/15
 **/
public class StartUp {

    public static void main(String[] args) {

        RefinedCar benzS = new Benz(new SanLing());
        benzS.drive();

        RefinedCar benzF = new Benz(new FuTe());
        benzF.drive();

        RefinedCar audi = new Audi(new SanLing());
        audi.drive();

    }

}
