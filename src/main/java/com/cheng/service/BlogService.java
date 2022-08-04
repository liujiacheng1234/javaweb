package com.cheng.service;

import com.cheng.pojo.Blog;

import java.util.List;

public interface BlogService {
    int addBlog(Blog blog);

    int delBlog(int id);

    int upBlog(Blog blog, int id);

    Blog queryBlogById(int id);

    List<Blog> queryAllBlog();
}
