package taoqz.top.责任链模式;

public class StartUp {

    public static void main(String[] args) {

        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();

        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(handlerA);
        handlerChain.addHandler(handlerB);

        // 不向下传递
        handlerChain.handle();
        // 我是HandlerA。。。。

    }

}
