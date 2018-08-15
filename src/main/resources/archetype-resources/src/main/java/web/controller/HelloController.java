package ${package}.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

/**
 * @author : jungle
 * @Title : HelloController
 * @Package :
 * @Description: .
 * @Date :
 */
@Controller
public class HelloController {
    /**
     * log.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    /**
     * say hello .
     *
     * @return Object
     */
    @RequestMapping("/hello")
    @ResponseBody
    public Object sayHello() {
        return "hello from jungle";
    }
}
