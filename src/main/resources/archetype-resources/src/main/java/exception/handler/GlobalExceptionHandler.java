package ${package}.exception.handler;

import ${package}.base.AbstractBaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author jungle
 * @version V1.0
 * @date 2018/8/1 16:50
 * @Title: GlobalExceptionHandler.java
 * @Package
 * @Description: 全局异常处理器
 * copyright © 2018- jungle.com
 */
@ControllerAdvice
public class GlobalExceptionHandler extends AbstractBaseController {

    /**
     * 日志。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 功能描述：全局异常处理。
     *
     * @return object 异常信息
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object query(Exception e, HttpServletResponse response) {
        LOGGER.error("！！！捕获到未处理异常！！！", e);
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return "服务器出了点小问题，请稍后再试";
    }

}
