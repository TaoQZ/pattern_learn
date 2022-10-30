package taoqz.top.责任链模式;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 责任链类
 * 这里我们使用简单的实现方式：数组
 *
 */
public class HandlerChain {

    private List<Handler> handlerList = new ArrayList<>();

    public void addHandler(Handler handler) {
        handlerList.add(handler);
    }

    public void handle() {
        for (Handler handler : handlerList) {
            boolean handled = handler.handle();
            // 在这里我们可以控制，当一个处理器可以处理时，是否要传递到下一个处理器hanlder中
            if (handled) {
                break;
            }
        }
    }

}
