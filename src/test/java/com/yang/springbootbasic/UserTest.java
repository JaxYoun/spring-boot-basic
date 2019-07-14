package com.yang.springbootbasic;

import com.yang.springbootbasic.service.UserService;
import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author: Yang
 * @date: 2019/7/14 14:20
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootBasicApplication.class)
@AutoConfigureMockMvc
public class UserTest {

    @Resource
    private UserService userService;

    @Test
    public void test() {
        System.out.println(this.userService.getUser().toString());
    }

    @Resource
    private MockMvc mockMvc;

    @Resource
    protected WebApplicationContext wac;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
    }

    @Test
    @SneakyThrows
    public void controllerTest() {
        this.mockMvc.perform(get("/user/test")).andExpect(status().isOk()).andDo(print());
    }

}
