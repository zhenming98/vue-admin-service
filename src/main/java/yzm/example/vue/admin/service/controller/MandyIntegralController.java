package yzm.example.vue.admin.service.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yzm.example.vue.admin.service.service.impl.MandyIntegralServiceImpl;

/**
 * @author yangzm
 * @date 2022-03-04 22:50:57
 */
@RestController
@RequestMapping(value = "/api")
public class MandyIntegralController {

    @Resource
    MandyIntegralServiceImpl mandyIntegralService;

}

