package taoqz.top.行为型模式.模板模式.回调;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/11/9
 **/
public class MyCallBack {

    /**
     * 模仿 JdbcTemplate query和execute方法
     * 该方法相当于模板方法,处理逻辑固定,由回调的方式执行
     *
     * @param callBack
     * @return
     */
    public String execute(CallBack callBack) {

        String result = callBack.doMethod();
        if (result.equals("OK")) {
            return "OK!!!!";
        }
        return "fail";

    }

    public String method1(String param1) {

        // 回调的内容相当于要具体实现扩展的部分,根据不同的需要有不同的处理逻辑,最后回调给execute函数即可
        class Method1Callback implements CallBack {

            @Override
            public String doMethod() {
                return param1;
            }

        }

//        return this.execute(new Method1Callback());

        // 匿名内部类,和上面的方式等价
        return this.execute(new CallBack() {
            @Override
            public String doMethod() {
                return param1.toUpperCase();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println(new MyCallBack().method1("ok"));
        System.out.println(new MyCallBack().method1("OK1"));
    }

}
