package com.cheng.dao;

import com.cheng.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {
    int addBlog(Blog blog);

    int delBlog(@Param("blogId") int id);

    int upBlog(Blog blog, @Param("blogId") int id);

    Blog queryBlogById(@Param("blogId") int id);

    List<Blog> queryAllBlog();
}
