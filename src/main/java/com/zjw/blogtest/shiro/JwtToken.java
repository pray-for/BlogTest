package com.zjw.blogtest.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return this.token;
    }
    @Override
    public Object getCredentials() {
        return this.token;
    }
}

