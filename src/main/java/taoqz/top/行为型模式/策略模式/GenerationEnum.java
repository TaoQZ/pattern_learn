package taoqz.top.行为型模式.策略模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 年龄段标签
 *
 * @author tao
 */
@Getter
@AllArgsConstructor
public enum GenerationEnum {

    /**
     * 少儿
     */
    children(0, "少儿"),

    /**
     * 青年
     */
    youth(1, "青年"),

    /**
     * 成年
     */
    adult(2, "成年"),

    /**
     * 老年
     */
    elderly(3, "老年");

    private Integer code;
    private String mode;

}
