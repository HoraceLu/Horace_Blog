package com.danli.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Jwt Json Web Token
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}

