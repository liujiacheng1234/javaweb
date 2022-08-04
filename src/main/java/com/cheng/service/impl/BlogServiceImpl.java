package com.cheng.service.impl;

import com.cheng.dao.BlogMapper;
import com.cheng.pojo.Blog;
import com.cheng.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public BlogServiceImpl() {
        super();
    }

    public void setBlogMapper(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }

    @Override
    public int addBlog(Blog blog) {
        return blogMapper.addBlog(blog);
    }

    @Override
    public int delBlog(int id) {
        return blogMapper.delBlog(id);
    }

    @Override
    public int upBlog(Blog blog, int id) {
        return blogMapper.upBlog(blog, id);
    }

    @Override
    public Blog queryBlogById(int id) {
        return blogMapper.queryBlogById(id);
    }

    @Override
    public List<Blog> queryAllBlog() {
        return blogMapper.queryAllBlog();
    }
}
