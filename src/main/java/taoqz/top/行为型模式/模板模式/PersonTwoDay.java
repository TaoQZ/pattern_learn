package taoqz.top.行为型模式.模板模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/9
 **/
public class PersonTwoDay extends PersonsDay{
    @Override
    protected void eat() {
        System.out.println("我吃米饭");
    }

    @Override
    protected void sleep() {
        System.out.println("我侧着睡");
    }

    @Override
    protected void dadoudou() {
        System.out.println("我脚踢");
    }
}
