package taoqz.top.创建型模式.工厂模式.抽象工厂;

public class XmlRouteConfigParserFactory implements RouteRuleConfigParserFactory {
    @Override
    public UserRouteRuleConfigParser createUserParser(String filePath) {
        return new XmlUserRouteRuleConfigParser();
    }

    @Override
    public SystemRouteRuleConfigParser createSystemParser(String filePath) {
        return new XmlSystemRouteRuleConfigParser();
    }
}
