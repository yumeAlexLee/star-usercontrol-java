package com.alex.starusercontrol.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 * @author Alex
 * @date 14/06/2022 11:34 PM
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -475985471534957470L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
