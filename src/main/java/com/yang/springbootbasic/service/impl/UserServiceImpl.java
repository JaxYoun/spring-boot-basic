package com.yang.springbootbasic.service.impl;

import com.yang.springbootbasic.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: Yang
 * @date: 2019/7/14 14:26
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String[] getUser() {
        return new String[]{"aaa", "bbb"};
    }

}
