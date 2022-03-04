package yzm.example.vue.admin.service.base.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import yzm.example.vue.admin.service.base.exception.GeneralException;
import yzm.example.vue.admin.service.base.response.ExceptionResponse;

/**
 * @author yzm
 * @date 2022/2/22 - 21:04
 */
@ControllerAdvice
public class DefaultRestErrorResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultRestErrorResolver.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ExceptionResponse exceptionHandler(Exception e) {
        LOGGER.error("Exception!!!!!", e);
        if (e instanceof GeneralException) {
            return new ExceptionResponse(((GeneralException) e).getErrCode(), e.getMessage());
        }
        return new ExceptionResponse(e + " " + e.getMessage());
    }

}
