package taoqz.top.行为型模式.策略模式;

import java.util.List;

public class GradingStrategyContext {

    private GradingStrategy gradingStrategy;

    public List<String> execute(User user) {
        return gradingStrategy.getRecommendedVideos(user);
    }


    public GradingStrategy getGradingStrategy() {
        return gradingStrategy;
    }

    public void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }
}
