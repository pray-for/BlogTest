package com.zjw.blogtest.service;

import com.zjw.blogtest.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjw.blogtest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjw
 * @since 2022-06-28
 */

public interface UserService extends IService<User> {

}
