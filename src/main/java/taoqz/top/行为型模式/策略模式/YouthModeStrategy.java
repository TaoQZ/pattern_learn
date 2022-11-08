package taoqz.top.行为型模式.策略模式;

import java.util.List;

/**
 * 青年模式
 *
 * @Author taoqingzhou
 **/
public class YouthModeStrategy implements GradingStrategy {

    @Override
    public List<String> getRecommendedVideos(User user) {
        // 一系列的处理逻辑
        user.setTag(GenerationEnum.youth.getMode());
        return List.of("亲情", "友情", "爱情", "血腥", "暴力", "色情");
    }

}
