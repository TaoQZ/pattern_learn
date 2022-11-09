package taoqz.top.行为型模式.模板模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/9
 **/
public class Readme {

    /**
     *
     * 模板方法:
     *      模板方法也是一种行为型模式,在模板模式中,一个抽象类公开定义了执行它的方法的方式/模板(骨架).它的子类可以按需重写方法实现,但调用将以抽象类中的方式进行.
     *
     * 主要解决:
     *      一些方法通用,却在每一个子类都重写了这一方法
     *
     * 优点:
     *      封装不变部分,扩展可变部分
     *      提取公共代码,便于维护
     *      行为由父类控制,子类实现
     *
     * 使用场景:
     *      有多个子类共有的方法,且逻辑相同
     *      重要的\复杂的方法,可以考虑作为模板方法
     *
     * 注意事项:
     *      为防止恶意操作,一半模板方法都加上final关键词
     *
     * Java中应用的例子: AbstractList类 的 addAll(int index, Collection<? extends E> c) | add(int index, E element)
     *
     *     public boolean addAll(int index, Collection<? extends E> c) {
     *         rangeCheckForAdd(index);
     *         boolean modified = false;
     *         for (E e : c) {
     *             add(index++, e);
     *             modified = true;
     *         }
     *         return modified;
     *     }
     *
     *    public void add(int index, E element) {
     *         throw new UnsupportedOperationException();
     *     }
     *
     *   其中addAll()可以看作模板方法,addAll()引用了add方法,但是add方法没有被实现,无法使用,需要子类进行具体的实现
     *
     * 需求:
     *      一个人的一天,吃饭睡觉打豆豆,但每个人的吃饭吃得东西不同,睡觉姿势不同,打豆豆的方式不一样,但是一个人的一天都是这么过得.
     *
     *
     *
     */
}
