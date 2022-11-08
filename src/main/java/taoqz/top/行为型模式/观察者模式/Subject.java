package taoqz.top.行为型模式.观察者模式;

/**
 * 被观察者
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer
     */
    void register(Observer observer);

    /**
     * 卸载观察者
     *
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 通知消息到观察者
     *
     * @param message
     */
    void notify(Message message);

}
