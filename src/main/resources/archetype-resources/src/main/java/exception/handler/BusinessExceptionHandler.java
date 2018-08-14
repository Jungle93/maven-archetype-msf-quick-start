package ${package}.exception.handler;

import ${package}.base.AbstractBaseController;
import ${package}.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jungle
 * @version V1.0
 * @date 2018/8/1 16:47
 * @Title: BusinessExceptionHandler.java
 * @Package
 * @Description: 全局业务异常处理器
 * copyright © 2018- jungle.com
 */
@ControllerAdvice
public class BusinessExceptionHandler extends AbstractBaseController {

    /**
     * 功能描述：处理业务异常。
     *
     * @param e 业务异常
     * @return object 输出数据
     */
    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public Object query(BusinessException e) {
        return getSimpleResult(false, e.getResponseCode(), e.getResponseMessage());
    }
}
