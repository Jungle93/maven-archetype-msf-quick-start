package ${package}.base;

import ${package}.entity.dto.ObjectResult;
import ${package}.entity.dto.SimpleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : jungle
 * @Title : AbstractBaseController
 * @Package :
 * @Description: 业务基础抽象控制器.
 */
public abstract class AbstractBaseController {

    /**
     * 日志。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractBaseController.class);

    /**
     * 获取基础结果。
     *
     * @param code    返回码
     * @param msg 返回消息
     * @return {@link SimpleResult}
     */
    protected SimpleResult getSimpleResult(String code, String msg) {
        return new SimpleResult(code, msg);
    }

    /**
     * 获取基础结果。
     *
     * @param code    返回码
     * @return {@link SimpleResult}
     */
    protected SimpleResult getSimpleResult(String code) {
        return getSimpleResult(code, null);
    }

    /**
     * 获取带内容的结果。
     *
     * @param code    返回码
     * @param msg 返回消息
     * @param key     内容的第一个key
     * @param value   内容的第一个值
     * @return {@link ObjectResult}
     */
    protected ObjectResult getMapResult(String code, String msg, String key, Object value) {
        LinkedHashMap<String, Object> content = new LinkedHashMap<String, Object>();
        content.put(key, value);
        return getObjectResult(code, msg, content);
    }

    /**
     * @param code    返回码
     * @param msg 返回消息
     * @param data 返回内容{@link Map}
     * @return {@link ObjectResult}
     */
    protected ObjectResult getObjectResult(String code, String msg, Object data) {
        return new ObjectResult(code, msg, data);
    }

    /**
     * 从参数中获取整数值。
     *
     * @param params     请求参数
     * @param key        参数键
     * @param defaultVal 默认值
     * @return int
     */
    protected int getInteger(Map params, String key, int defaultVal) {
        try {
            String s = (String) params.get(key);
            if (s == null || s.trim().length() == 0) {
                return defaultVal;
            }
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }

    /**
     * 从参数中获取整数值。
     *
     * @param params 请求参数
     * @param key    参数键
     * @return int
     */
    protected Integer getInteger(Map params, String key) {
        String s = (String) params.get(key);
        if (s == null) {
            return null;
        }
        return Integer.valueOf(s);
    }

    /**
     * 判断字符串为空。
     *
     * @param str 待检测字符串
     * @return true-空；false-不为空
     */
    protected boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 判断字符串不为空。
     *
     * @param str 待检测字符串
     * @return true-不为空；false-为空
     */
    protected boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 构造map。
     *
     * @param k1  键1
     * @param v1  值1
     * @param <K> 键类型
     * @param <V> 值类型
     * @return Map type of key ,type of value
     */
    protected <K, V> Map<K, V> map(K k1, V v1) {
        Map<K, V> result = new HashMap<K, V>();
        result.put(k1, v1);
        return result;
    }

    /**
     * 构造map。
     *
     * @param k1  键1
     * @param v1  值1
     * @param k2  键2
     * @param v2  值2
     * @param <K> 键类型
     * @param <V> 值类型
     * @return Map type of key ,type of value
     */
    protected <K, V> Map<K, V> map(K k1, V v1, K k2, V v2) {
        Map<K, V> result = new HashMap<K, V>();
        result.put(k1, v1);
        result.put(k2, v2);
        return result;
    }

    /**
     * 构造map。
     *
     * @param k1  键1
     * @param v1  值1
     * @param k2  键2
     * @param v2  值2
     * @param k3  键3
     * @param v3  值3
     * @param <K> 键类型
     * @param <V> 值类型
     * @return Map type of key ,type of value
     */
    protected <K, V> Map<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3) {
        Map<K, V> result = new HashMap<K, V>();
        result.put(k1, v1);
        result.put(k2, v2);
        result.put(k3, v3);
        return result;
    }

    /**
     * 将传入的参数转换为数组
     *
     * @param args 请求参数可变长度
     * @param <T>  泛型
     * @return T []
     */
    protected <T> T[] array(T... args) {
        return args;
    }
}
