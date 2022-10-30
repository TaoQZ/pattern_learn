package taoqz.top.观察者模式;

public class FileObserver implements Observer{

    @Override
    public void accept(Message message) {
        // 接收到消息后的处理逻辑。。。。
        System.out.println(message.getMessage().toString());
        if (message.getMessage().toString().endsWith("100%")) {
            System.out.println("复制完成，请查收！！！");
        }
    }

}
