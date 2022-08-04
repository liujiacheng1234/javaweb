package com.cheng.controller;

import com.cheng.pojo.Blog;
import com.cheng.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    @Qualifier("blogServiceImpl")
    private BlogService blogService;

    @RequestMapping("/index")
    public String blogList(Model model){
        List<Blog> blogs = blogService.queryAllBlog();
        for (Blog blog:blogs) {
            if(blog.getContent().length() > 80){
                blog.setContent(blog.getContent().substring(0,80) + "......");
            }
        }
        model.addAttribute("blogs", blogs);
        return "index";
    }


    //创作页面
    @RequestMapping("/toAddBlog")
    public String toAddBlog(){
        return "edit";
    }

    @RequestMapping("/edit")
    public void postBlog(@RequestBody Blog blog){
        blog.setPostTime(new Timestamp(System.currentTimeMillis()));
        blogService.addBlog(blog);
    }

    //进入博客详情页面
    @RequestMapping("/blogDetail")
    public String blogDetail(Integer blogId, Model model){
        Blog blog = blogService.queryBlogById(blogId);
        model.addAttribute("blog",blog);
        if (blogId == null || blogId < 1) {
            return "redirect:/index";
        }
        return "blogDetail";
    }
}
