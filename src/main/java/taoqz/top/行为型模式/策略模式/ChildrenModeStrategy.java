package taoqz.top.行为型模式.策略模式;

import java.util.List;

/**
 * 少儿模式
 *
 * @Author taoqingzhou
 **/
public class ChildrenModeStrategy implements GradingStrategy {

    @Override
    public List<String> getRecommendedVideos(User user) {
        // 一系列的处理逻辑
        user.setTag(GenerationEnum.children.getMode());
        return List.of("早教", "动画");
    }

}
