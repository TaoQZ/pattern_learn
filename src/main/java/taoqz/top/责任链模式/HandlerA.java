package taoqz.top.责任链模式;

public class HandlerA implements Handler{

    @Override
    public boolean handle() {
        // 处理逻辑。。。。
        System.out.println("我是HandlerA。。。。");
        return true;
    }

}
