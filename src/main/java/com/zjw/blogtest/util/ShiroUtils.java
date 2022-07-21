package com.zjw.blogtest.util;

import com.zjw.blogtest.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtils {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
