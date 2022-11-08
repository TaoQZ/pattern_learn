package taoqz.top.创建型模式.工厂模式.抽象工厂;

public interface RouteRuleConfigParserFactory {

    /**
     * 用户侧路由配置
     *
     * @param filePath
     * @return
     */
    UserRouteRuleConfigParser createUserParser(String filePath);

    /**
     * 运营册路由配置
     *
     * @param filePath
     * @return
     */
    SystemRouteRuleConfigParser createSystemParser(String filePath);

}
