package taoqz.top.行为型模式.策略模式;

import java.util.List;

/**
 * 老年模式
 *
 * @Author taoqingzhou
 **/
public class ElderlyModeStrategy implements GradingStrategy {

    @Override
    public List<String> getRecommendedVideos(User user) {
        // 一系列的处理逻辑
        user.setTag(GenerationEnum.elderly.getMode());
        return List.of("养老", "养生");
    }

}
