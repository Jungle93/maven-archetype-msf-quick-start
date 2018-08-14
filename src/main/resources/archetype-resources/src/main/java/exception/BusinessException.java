package  ${package}.exception;

/**
 * @author jungle
 * @version V1.0
 * @date 2018/8/1 16:49
 * @Title: BusinessException.java
 * @Package
 * @Description: 自定义业务异常
 * copyright © 2018- jungle.com
 */
public class BusinessException extends RuntimeException {

    /**
     * 返回码。
     */
    private String responseCode;
    /**
     * 返回信息。
     */
    private String responseMessage;

    /**
     * 返回荷载。
     */
    private Object responsePayload;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public BusinessException(String responseCode, String responseMessage, Object responsePayload) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responsePayload = responsePayload;
    }

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public BusinessException(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    /**
     * 获取 。
     *
     * @return {@link #responseCode}
     */
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * 获取 。
     *
     * @return {@link #responseMessage}
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
     * 获取 。
     *
     * @return {@link #responsePayload}
     */
    public Object getResponsePayload() {
        return responsePayload;
    }

    public void setResponsePayload(Object responsePayload) {
        this.responsePayload = responsePayload;
    }
}
