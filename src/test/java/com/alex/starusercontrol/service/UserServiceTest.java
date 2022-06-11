package com.alex.starusercontrol.service;
import java.util.Date;

import com.alex.starusercontrol.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 用户服务测试
 *
 * @author alex
 */
@SpringBootTest
class UserServiceTest {
    @Resource
    UserService userService;

    @Test
    void testAddUser()  {
        User user = new User();
        user.setUsername("Alex");
        user.setUserAccount("123");
        user.setAvatarUrl("https://static.pictureknow.com/d40c57c27ed840a6982f0cb49ee047ec.png");
        user.setGender(0);
        user.setUserPassword("xx");
        user.setPhone("123");
        user.setEmail("456");
        boolean save = userService.save(user);
        System.out.println(user.getId());
        assertTrue(save);
    }
}