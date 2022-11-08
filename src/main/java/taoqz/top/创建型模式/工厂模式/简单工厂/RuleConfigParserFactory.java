package taoqz.top.创建型模式.工厂模式.简单工厂;

/**
 * 将创建对象的代码剥离出来，使用简单工厂模式
 */
public class RuleConfigParserFactory {

    public static RouteRuleConfigParser createParser(String filePath) {
        // 根据文件名选择不同的解析器，解析文件中的配置
        // 我们将原来读取解析配置文件时创建解析对象的代码抽离出来后，使原来的代码更加清晰，但是本类创建方法的代码会随着解析方式的增加需要不断扩展
        // 添加 if else ,这种写法大部分情况下没有问题，但如果非要去掉 if分支，可以考虑使用工厂方法
        RouteRuleConfigParser parser = null;
        if ("xml".equalsIgnoreCase(filePath)) {
            parser = new XmlRouteRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(filePath)) {
            parser = new YamlRouteRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(filePath)) {
            parser = new PropertiesRouteConfigParser();
        }
        return parser;
    }

}
