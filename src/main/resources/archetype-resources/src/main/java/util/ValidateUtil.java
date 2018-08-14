package ${package}.util;

/**
 * @author jungle
 * @version V1.0
 * @date 2018/8/6 11:20
 * @Title: ValidateUtil.java
 * @Package
 * @Description: 验证工具
 * copyright © 2018-
 */
public class ValidateUtil {

    /**
     * 校验两个Object是否相同。
     *
     * @param o1 Object
     * @param o2 Object
     * @return (o1 = = null & & o2 = = null)
     * || (o1 != null && o1.equals(o2));
     */
    public static boolean equals(Object o1, Object o2) {
        return (o1 == null && o2 == null)
                || (o1 != null && o1.equals(o2));
    }

}
