package taoqz.top.策略模式;

import java.util.List;

/**
 * 成人模式
 *
 * @Author taoqingzhou
 **/
public class AdultModeStrategy implements GradingStrategy {

    @Override
    public List<String> getRecommendedVideos(User user) {
        // 一系列的处理逻辑
        user.setTag(GenerationEnum.adult.getMode());
        return List.of("家庭", "生活", "工作", "育儿");
    }

}
