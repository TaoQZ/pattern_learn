package taoqz.top.工厂模式.抽象工厂;

import taoqz.top.工厂模式.简单工厂.RouteRuleConfigParser;

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
