package com.danli.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * 账户信息实体类
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
    private String role;
}

