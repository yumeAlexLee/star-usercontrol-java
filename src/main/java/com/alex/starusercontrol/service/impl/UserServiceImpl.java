package com.alex.starusercontrol.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alex.starusercontrol.model.domain.User;
import com.alex.starusercontrol.service.UserService;
import com.alex.starusercontrol.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 91627
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2022-06-11 17:43:05
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




