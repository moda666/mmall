package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.service.IUserService;
import com.mmall.test.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author adXiang
 * @date 2017/12/10
 */
public class UserServiceImplTest extends TestBase {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService iUserService;


    @Test
    public void checkValid() throws Exception {
        String str = "admin@happymmall.com";
        String type = "email";
        ServerResponse<String> response = iUserService.checkValid(str, type);
        System.out.println(response.getMsg());
    }

}