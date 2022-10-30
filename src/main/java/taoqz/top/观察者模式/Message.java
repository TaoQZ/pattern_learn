package taoqz.top.观察者模式;

/**
 * 被观察者与观察者的消息传递
 *
 */
public class Message {

    private Object message;

    public Message(Object message) {
        this.message = message;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
