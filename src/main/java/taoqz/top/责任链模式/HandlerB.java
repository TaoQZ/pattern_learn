package taoqz.top.责任链模式;

public class HandlerB implements Handler{
    @Override
    public boolean handle() {
        // 处理逻辑。。。。
        System.out.println("我是HandlerB。。。。");
        return false;
    }
}
