package com.cheng.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Blog {
    private int blogId;
    private String title;
    private String content;
    private Timestamp postTime;
    private int userId;

    public Blog() {
    }

    public Blog(int blogId, String title, String content, Timestamp postTime, int userId) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
        this.postTime = postTime;
        this.userId = userId;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postTime=" + postTime +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return blogId == blog.blogId && userId == blog.userId && Objects.equals(title, blog.title) && Objects.equals(content, blog.content) && Objects.equals(postTime, blog.postTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogId, title, content, postTime, userId);
    }
}
