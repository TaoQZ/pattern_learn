package taoqz.top.行为型模式.模板模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/9
 **/
public class PersonTwoDay extends PersonsDay{
    @Override
    void eat() {
        System.out.println("我吃米饭");
    }

    @Override
    void sleep() {
        System.out.println("我侧着睡");
    }

    @Override
    void dadoudou() {
        System.out.println("我脚踢");
    }
}
