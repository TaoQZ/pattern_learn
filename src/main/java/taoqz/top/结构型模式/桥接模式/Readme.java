package taoqz.top.结构型模式.桥接模式;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/12/13
 **/
public class Readme {

    /**
     * 桥接模式：
     *      桥接模式 的定义是 “将抽象和实现解耦，让它们可以独立变化”。
     *
     *
     * 意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
     * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
     * 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。
     * 如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
     * 关键代码：抽象类依赖实现类。
     *
     *
     * 示例：
     *      假设有三个汽车牌子：Audi、BenZ、BMW
     *         有三款引擎：FuTe、FengTian、SanLing
     *
     *      这就是两种有变化，如果去创建这两种变化的实体类，那么会有 (m * n) 个类，此时就是需要一个抽象的 "修正" 类,将这两者组合起来
     *      最终可以通过自己的选择去创建对应的类
     */

}
