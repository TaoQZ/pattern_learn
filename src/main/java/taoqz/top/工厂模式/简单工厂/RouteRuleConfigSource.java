package taoqz.top.工厂模式.简单工厂;

import java.util.InvalidPropertiesFormatException;
import java.util.Map;

/**
 * 这是一个通过读取不同后缀的配置文件获取路由规则的配置类
 */
public class RouteRuleConfigSource {

    public Map<String, Object> load(String configFilePath) throws InvalidPropertiesFormatException {
        String fileExtension = getFileExtension(configFilePath);
        // 根据文件名选择不同的解析器，解析文件中的配置
        RouteRuleConfigParser parser = null;

        // 为了让类的职责更加单一，代码更加清晰，我们可以将这段创建对象的代码剥离到一个独立的类中 RuleConfigParserFactory
//        if ("xml".equalsIgnoreCase(fileExtension)) {
//            parser = new XmlRouteRuleConfigParser();
//        } else if ("yaml".equalsIgnoreCase(fileExtension)) {
//            parser = new YamlRouteRuleConfigParser();
//        } else if ("properties".equalsIgnoreCase(fileExtension)) {
//            parser = new PropertiesRouteConfigParser();
//        } else {
//            throw new InvalidPropertiesFormatException("config format is not supported" + fileExtension);
//        }


        parser = RuleConfigParserFactory.createParser(configFilePath);
        if (parser == null) {
            throw new InvalidPropertiesFormatException("config format is not supported" + fileExtension);
        }

        return parser.parse(fileExtension);
    }

    /**
     * 获取配置文件后缀名,如 xml、yaml、properties
     *
     * @param filePath
     * @return
     */
    public String getFileExtension(String filePath) {
        return "yaml";
    }

}
