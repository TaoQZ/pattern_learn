package taoqz.top.工厂模式.抽象工厂;

import java.util.Map;

public interface SystemRouteRuleConfigParser {

    Map<String, Object> parse(String filePath);

}
