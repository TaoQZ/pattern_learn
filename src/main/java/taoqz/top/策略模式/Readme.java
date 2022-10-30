package taoqz.top.策略模式;

/**
 * @Author taoqingzhou
 **/
public class Readme {

    /**
     *  策略模式：策略模式（Strategy Pattern）：定义一族算法类，将每个算法分别封装起来，让它们可以互相替换。
     *
     *  定义：
     *      ①、Context封装角色
     *          它也叫做上下文角色， 起承上启下封装作用， 屏蔽高层模块对策略、 算法的直接访问，封装可能存在的变化。
     *      ②、Strategy 抽象策略角色
     *          策略、 算法家族的抽象， 通常为接口， 定义每个策略或算法必须具有的方法和属性。
     *      ③、ConcreteStrategy 具体策略角色
     *          实现抽象策略中的操作， 该类含有具体的算法。
     *
     *  优点：
     *      ①、算法可以自由切换
     *          这是策略模式本身定义的， 只要实现抽象策略， 它就成为策略家族的一个成员， 通过封装角色对其进行封装， 保证对外提供“可自由切换”的策略。
     *      ②、避免使用多重条件判断
     *          简化多重if-else，或多个switch-case分支。
     *      ③、扩展性良好
     *          增加一个策略，只需要实现一个接口即可。
     *
     *  应用场景：
     *      ①、多个类只有在算法或行为上稍有不同的场景。
     *      ②、算法需要自由切换的场景。
     *      ③、需要屏蔽算法规则的场景。
     *
     */

    /**
     *
     * 在生活中我们会用到很多的视频平台，比如netflix，里面会对视频内容进行分级，包括但不限于ip地址、年龄
     * 我们这里以年龄为例，可以将用户分成 少儿、青年、成年、老年 几种类型，按照不同的类型去给用户推荐不同类型的视频
     * 再试想一下如果我们编写代码时这每种类型会有不同的处理逻辑，一般少的分支我们可以用if else 来进行处理
     * 但如果分支流程很多并且里面的逻辑较多且复杂的情况下，使用这种编写方式后期维护起来相当困难（该场景可能不太准确，大概意思是这样）
     * 这时我们就可以尝试使用 策略模式 来优化这种场景下的处理逻辑。
     *
     */
    
    /**
     * 在学习的过程中，发现策略模式和工厂模式很像，很容易混淆
     * 用途不一样
     *     工厂是创建型模式,它的作用就是创建对象；
     *     策略是行为型模式,它的作用是让一个对象在许多行为中选择一种行为;
     * 关注点不一样
     *     一个关注对象创建
     *     一个关注行为的封装
     * 解决不同的问题
     *     工厂模式是创建型的设计模式，它接受指令，创建出符合要求的实例；它主要解决的是资源的统一分发，将对象的创建完全独立出来，让对象的创建和具体的使用客户无关。
     *     策略模式是为了解决的是策略的切换与扩展，更简洁的说是定义策略族，分别封装起来，让他们之间可以相互替换，策略模式让策略的变化独立于使用策略的客户。
     */
}
