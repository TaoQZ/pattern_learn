package taoqz.top.工厂模式.工厂方法;

import taoqz.top.工厂模式.简单工厂.RouteRuleConfigParser;
import taoqz.top.工厂模式.简单工厂.YamlRouteRuleConfigParser;

public class YamlRouteRuleConfigParserFactory implements RouteRuleConfigParserFactory{
    @Override
    public RouteRuleConfigParser createParser(String filePath) {
        return new YamlRouteRuleConfigParser();
    }
}
