package com.wink.music.config.shiro;

import com.wink.music.utils.JwtUtil;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/1/31 15:32
 **/
public class JwtToken implements AuthenticationToken {
    private String username;
    private String token;

    public JwtToken(String token){
        this.token = token;
        JwtUtil jwtUtil = new JwtUtil();
        this.username = jwtUtil.getClaimFiled(token, "username");
    }

    /**
     * 类似用户名
     * @return
     */
    @Override
    public Object getPrincipal() {
        return username;
    }

    /**
     * 类似密码
     * @return
     */
    @Override
    public Object getCredentials() {
        return token;
    }
}
