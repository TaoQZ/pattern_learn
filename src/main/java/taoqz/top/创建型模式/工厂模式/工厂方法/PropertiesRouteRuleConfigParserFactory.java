package taoqz.top.创建型模式.工厂模式.工厂方法;

import taoqz.top.创建型模式.工厂模式.简单工厂.PropertiesRouteConfigParser;
import taoqz.top.创建型模式.工厂模式.简单工厂.RouteRuleConfigParser;

public class PropertiesRouteRuleConfigParserFactory implements RouteRuleConfigParserFactory{
    @Override
    public RouteRuleConfigParser createParser(String filePath) {
        return new PropertiesRouteConfigParser();
    }
}
