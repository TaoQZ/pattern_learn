package taoqz.top.行为型模式.策略模式;


import java.util.List;

/**
 * 分级策略 接口
 *
 * @author tao
 */
public interface GradingStrategy {

    /**
     * 根据用户的年龄等信息进行视频类型推荐
     *
     * @param user 用户
     * @return
     */
    List<String> getRecommendedVideos(User user);

}
