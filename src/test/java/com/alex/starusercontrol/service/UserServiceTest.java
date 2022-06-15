package com.alex.starusercontrol.service;

import com.alex.starusercontrol.mapper.UserMapper;
import com.alex.starusercontrol.model.domain.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 用户服务测试
 *
 * @author alex
 */
@SpringBootTest
class UserServiceTest {
    @Resource
    UserService userService;
    @Resource
    UserMapper userMapper;

    @Test
    void testAddUser() {
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

    @Test
    void testRegist() {
        String userAccount = "alex";
        String userPassword = "";
        String checkPassword = "12345678";
        long result = 0;
        //非空
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        //账户长度不小于四位
        userAccount = "al";
        userPassword ="12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        ///密码不小于八位
        userAccount = "alex";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        //账户包含特殊字符
        userAccount = "al ex";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        //密码和校验密码不相同
        userAccount = "alex";
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        //账户不能重复
        userAccount = "123";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        //正确的
        userAccount = "alex";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(5, result);

    }


}