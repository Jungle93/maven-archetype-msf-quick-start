package ${package}.entity.dto;

/**
 * @author : jungle
 * @Title : SimpleResult
 * @Package :
 * @Description: 最基础结果.
 */
public class SimpleResult {

    /**
     * 成功标识。
     */
    private boolean success;

    /**
     * 响应码。
     */
    private String code;

    /**
     * 响应消息。
     */
    private String message;

    public SimpleResult(boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    /**
     * 获取success。
     * return {@link #success}
     */
    public boolean getSuccess() {
        return success;
    }

    /**
     * 设置success。
     *
     * @param success {@link #success}
     */
    public void setSuccess(boolean success) {
        this.success = success;
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
     * return {@link #message}
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message。
     *
     * @param message {@link #message}
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
