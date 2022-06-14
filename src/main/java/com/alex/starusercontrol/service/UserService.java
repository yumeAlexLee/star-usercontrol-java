package com.alex.starusercontrol.service;

import com.alex.starusercontrol.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 91627
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2022-06-11 17:43:05
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 密码校验
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 脱敏后的用户信息
     */
    User doLogin(String userAccount, String userPassword, HttpServletRequest request);

}
