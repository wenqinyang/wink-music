//package com.wink.music.config.shiro;
//
//import com.wink.music.entity.po.User;
//import com.wink.music.utils.JWTUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.credential.CredentialsMatcher;
//
///**
// * This class is for
// *
// * @author wen qin
// * @since 2024/1/31 15:39
// **/
//@Slf4j
//public class JWTCredentialsMatcher implements CredentialsMatcher {
//    @Override
//    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) {
//
//        String token = ((JWTToken) authenticationToken).getToken();
//        log.info("JWTCredentialsMatcher token = {}", token);
//        User user = (User) authenticationInfo.getPrincipals().getPrimaryPrincipal();
//        log.info("JWTCredentialsMatcher token = {}", user.toString());
//        // 调用JwtUtils验证token即可
//        // return JWTUtil.verifyToken(token, user.getUsername(), user.getPassword());
//        return JWTUtil.verifyToken(token, user.getUsername());
//    }
//}
//
