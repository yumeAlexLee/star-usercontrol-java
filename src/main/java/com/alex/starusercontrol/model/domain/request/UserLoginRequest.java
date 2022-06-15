package com.alex.starusercontrol.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 * @author Alex
 * @date 14/06/2022 11:34 PM
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -8008177447809763733L;

    private String userAccount;

    private String userPassword;

}
