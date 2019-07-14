package com.yang.springbootbasic.controller;

import com.yang.springbootbasic.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Yang
 * @date: 2019/7/14 13:04
 * @description:
 */
//@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    //    private static final Logger log = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/trace")
    public String trace() {
        final String trace = "trace";
        if (log.isTraceEnabled()) {
            log.trace(trace);
        }
        return trace;
    }

    @Resource
    private UserService userService;

    @GetMapping("/test")
    public String[] test() {
        return this.userService.getUser();
    }

}
