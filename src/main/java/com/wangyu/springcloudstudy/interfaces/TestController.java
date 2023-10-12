package com.wangyu.springcloudstudy.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyubj15
 * @date 2023/10/12 下午6:57
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String hello() {
        return "hello";
    }

}
