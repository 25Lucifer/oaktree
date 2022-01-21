package com.jameson.oaktree.common.entity;

import com.jameson.oaktree.common.base.BaseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author zhangshu
 * @date 2022-01-21 16:26
 */
public class User extends BaseEntity implements UserDetailsService {

    // TODO: 2022/1/21 https://www.cnblogs.com/dl610455894/p/14072960.html

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
