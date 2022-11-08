package taoqz.top.创建型模式.工厂模式.工厂方法;

import java.util.HashMap;
import java.util.Map;

/**
 * 这种写法虽然可以将简单工厂模式中的if分支去掉，但不可避免的是还是会在调用方使用if分支来根据不同的工厂来创建对象
 * 因此我们可以创建一个工厂的工厂，不需要每次创建新的工厂对象
 *
 * 但是这种工厂方法让我感觉设计更加的复杂
 *
 * 工厂的工厂
 */
public class RouteRuleConfigParserFactoryMap {

    private static final Map<String, RouteRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("xml",new  XmlRouteRuleConfigParserFactory());
        cachedFactories.put("yaml",new YamlRouteRuleConfigParserFactory());
        cachedFactories.put("properties",new PropertiesRouteRuleConfigParserFactory());
    }

    public static RouteRuleConfigParserFactory getParserFactory(String fileType) {
        return cachedFactories.get(fileType);
    }

}
