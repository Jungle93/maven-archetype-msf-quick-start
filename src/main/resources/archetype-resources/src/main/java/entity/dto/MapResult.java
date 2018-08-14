package ${package}.entity.dto;

import java.util.Map;

/**
 * @author : jungle
 * @Title : MapResult
 * @Package :
 * @Description: 带Content map的响应结果.
 */
public class MapResult extends SimpleResult {

    private Map content;

    public MapResult(boolean success, String code, String message, Map content) {
        super(success, code, message);
        this.content = content;
    }

    public MapResult(boolean success, String code, String message) {
        super(success, code, message);
        this.setContent(null);
    }

    public Map getContent() {
        return content;
    }

    public void setContent(Map content) {
        this.content = content;
    }
}
