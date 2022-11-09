package taoqz.top.行为型模式.模板模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/9
 **/
public class PersonOneDay extends PersonsDay{
    @Override
    protected void eat() {
        System.out.println("我吃面食");
    }

    @Override
    protected void sleep() {
        System.out.println("我趴着睡");
    }

    @Override
    protected void dadoudou() {
        System.out.println("我拳打");
    }
}
