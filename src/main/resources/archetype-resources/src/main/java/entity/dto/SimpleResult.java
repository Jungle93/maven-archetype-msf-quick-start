package ${package}.entity.dto;

/**
 * @author : jungle
 * @Title : SimpleResult
 * @Package :
 * @Description: 最基础结果.
 */
public class SimpleResult {

    /**
     * 响应码。
     */
    private String code;

    /**
     * 响应消息。
     */
    private String msg;

    public SimpleResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取code。
     * return {@link #code}
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code。
     *
     * @param code {@link #code}
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取message。
     * return {@link #msg}
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置message。
     *
     * @param msg {@link #msg}
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
