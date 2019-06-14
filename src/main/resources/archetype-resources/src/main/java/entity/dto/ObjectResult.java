package ${package}.entity.dto;

/**
 * @author : jungle
 * @Title : ObjectResult
 * @Package :
 * @Description: 带data的响应结果.
 */
public class ObjectResult extends SimpleResult {

    private Object data;

    public ObjectResult(String code, String message, Object data) {
        super(code, message);
        this.data = data;
    }

    public ObjectResult(String code, String message) {
        super(code, message);
        this.setData(null);
    }

    public Object getData() {

        return data;
    }

    public void setData(Object data) {

        this.data = data;
    }
}
