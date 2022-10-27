package taoqz.top.策略模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据不同的年龄返回不同类型的策略
 *
 * @Author taoqingzhou
 **/
public class GradingStrategyFactory {

    private static final Map<String, GradingStrategy> map = new HashMap<>();

    static {
        map.put(GenerationEnum.children.getMode(), new ChildrenModeStrategy());
        map.put(GenerationEnum.youth.getMode(), new YouthModeStrategy());
        map.put(GenerationEnum.adult.getMode(), new AdultModeStrategy());
        map.put(GenerationEnum.elderly.getMode(), new ElderlyModeStrategy());
    }

    public static GradingStrategy getStrategy(Integer age) {
        String generation = "";
        if (age >= 0 && age < 16) {
            generation = GenerationEnum.children.getMode();
        } else if (age >= 16 && age < 30) {
            generation = GenerationEnum.youth.getMode();
        } else if (age >= 30 && age < 50) {
            generation = GenerationEnum.adult.getMode();
        } else if (age >= 50 && age < 80) {
            generation = GenerationEnum.elderly.getMode();
        } else {
            generation = GenerationEnum.children.getMode();
        }
        return map.get(generation);
    }

}
