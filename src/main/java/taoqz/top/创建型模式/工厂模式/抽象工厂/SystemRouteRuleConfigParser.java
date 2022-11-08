package taoqz.top.创建型模式.工厂模式.抽象工厂;

import java.util.Map;

public interface SystemRouteRuleConfigParser {

    Map<String, Object> parse(String filePath);

}
