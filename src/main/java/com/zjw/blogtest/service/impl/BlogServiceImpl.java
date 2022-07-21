package com.zjw.blogtest.service.impl;

import com.zjw.blogtest.entity.Blog;
import com.zjw.blogtest.mapper.BlogMapper;
import com.zjw.blogtest.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjw
 * @since 2022-06-28
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
