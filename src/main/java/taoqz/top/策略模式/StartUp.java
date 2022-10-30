package taoqz.top.策略模式;

import java.util.List;

/**
 * @Author taoqingzhou
 * @Description
 * @Date 2022/10/27
 **/
public class StartUp {

    public static void main(String[] args) {

        User user = new User();
        user.setAge(18);

        GradingStrategy strategy = GradingStrategyFactory.getStrategy(user.getAge());

        GradingStrategyContext gradingStrategyContext = new GradingStrategyContext();
        gradingStrategyContext.setGradingStrategy(strategy);
        List<String> execute = gradingStrategyContext.execute(user);

        System.out.println("user: " + user.getTag());
        System.out.println("recommendedVideos: " + execute);

        // user: 青年
        // recommendedVideos: [亲情, 友情, 爱情, 血腥, 暴力, 色情]

    }


}
