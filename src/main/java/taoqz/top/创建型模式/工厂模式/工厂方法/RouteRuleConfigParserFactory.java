package taoqz.top.创建型模式.工厂模式.工厂方法;

import taoqz.top.创建型模式.工厂模式.简单工厂.RouteRuleConfigParser;

public interface RouteRuleConfigParserFactory {

    RouteRuleConfigParser createParser(String filePath);

}
