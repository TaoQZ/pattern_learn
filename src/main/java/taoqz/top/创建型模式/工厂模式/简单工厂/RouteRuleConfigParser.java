package taoqz.top.创建型模式.工厂模式.简单工厂;

import java.util.Map;

public interface RouteRuleConfigParser {

    Map<String, Object> parse(String filePath);

}
