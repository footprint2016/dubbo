package com.example.dubboweb.controller;

import com.example.dubbocommon.resp.RespObject;
import com.example.dubbofacade.application.UserApplication;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function description
 *
 * @Author: Vampire-潘伟
 * @Data: 2019/9/12 19:22
 */
@RestController
@RequestMapping("/")
public class WebController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebController.class);

    @Reference
    UserApplication userApplication;

    @RequestMapping("demo")
    private String demo() {
        LOGGER.debug("hello springboot...");
        return "hello springboot...";
    }

    @RequestMapping("crud")
    public RespObject crud() {
        RespObject respObject = new RespObject();
//        1. insert:
//        for (int i = 0; i < 20; i++) {
//            User user = new User();
//            user.setName("aaa" + i);
//            user.setAge(20 + i);
//            userService.insert(user);
//        }
//        2. select
        respObject = userApplication.selectBy();
//        3. update
//        int id = userService.updateBy();
//        respObject.setData(id);
//        4. delete
//        int id = userService.deleteBy();
//        respObject.setData(id);
        return respObject;
    }

}
