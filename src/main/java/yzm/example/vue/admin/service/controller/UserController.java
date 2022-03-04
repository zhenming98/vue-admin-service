package yzm.example.vue.admin.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yzm.example.vue.admin.service.base.response.R;
import yzm.example.vue.admin.service.bean.req.LoginReq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yzm
 * @date 2022/2/28 - 21:03
 */
@RestController
@RequestMapping(value = "/api/sys/user")
public class UserController {

    @PostMapping(value = "login")
    public R<?> login(@RequestBody LoginReq loginReq) {
        Map<String, String> results = new HashMap<>(1);
        results.put("token", "admin");
        return R.success(results);
    }

    @GetMapping(value = "info")
    public R<?> login(@RequestParam("token") String username) {
        Map<String, Object> results = new HashMap<>(4);
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        results.put("roles", roles);
        results.put("name", "admin");
        results.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        results.put("introduction", "admin");
        return R.success(results);
    }

    @PostMapping(value = "logout")
    public R<?> logout() {
        return R.success();
    }

}
