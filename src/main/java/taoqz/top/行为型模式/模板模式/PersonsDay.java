package taoqz.top.行为型模式.模板模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/9
 **/
public abstract class PersonsDay {

    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void dadoudou();


    /**
     * 人的一生 吃饭睡觉打豆豆
     * 模板方法定义为 final 子类不可重写
     */
    public final void life() {
        this.eat();
        this.sleep();
        this.dadoudou();
    }

}
