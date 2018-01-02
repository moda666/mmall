package com.mmall.dao.test;

import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.test.TestBase;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author MaWenXiang
 * @date 2017/11/19
 */
public class DaoTest extends TestBase {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testDao(){
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getUsername());
    }


}
