package yzm.example.vue.admin.service.base.log;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yzm
 * @date 2022/2/22 - 21:26
 */
public class MyMybatisLog extends StdOutImpl {

    private Logger log = null;

    public MyMybatisLog(String clazz) {
        super(clazz);
        if (StringUtils.isBlank(clazz)) {
            log = LoggerFactory.getLogger(MyMybatisLog.class);
        }
        this.log = LoggerFactory.getLogger(clazz);
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void error(String s, Throwable e) {
        log.error(s, e);
    }

    @Override
    public void error(String s) {
        log.error(s);
    }

    @Override
    public void debug(String s) {
        log.debug(s);
    }

    @Override
    public void trace(String s) {
        log.trace(s);
    }

    @Override
    public void warn(String s) {
        log.warn(s);
    }

}
