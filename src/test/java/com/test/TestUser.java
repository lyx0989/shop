package com.test;

import com.goktech.olala.server.dao.customer.UserMapper;
import com.goktech.olala.server.pojo.customer.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @Classname TestUser
 * @Description TODO
 * @Date 2020/12/1 5:00 下午
 * @Created by mac
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@WebAppConfiguration
public class TestUser {
    @Autowired
    UserMapper userMapper;
    @Test
    public void testuser() {
        List<User> users = userMapper.selectAll();
        for (User user:users) {
            System.out.println(user);
        }
    }
}
