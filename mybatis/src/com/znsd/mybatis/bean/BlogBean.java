package com.znsd.mybatis.bean;

import java.util.List;

public class BlogBean {
	
	private int blogId;
	private String blogName;
	private String blogTitle;
	private  AuthorBean author;
	private List<PostBean> postList;
	
	public List<PostBean> getPostList() {
		return postList;
	}
	public void setPostList(List<PostBean> postList) {
		this.postList = postList;
	}
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public AuthorBean getAuthor() {
		return author;
	}
	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "BlogBean [blogId=" + blogId + ", blogName=" + blogName + ", blogTitle=" + blogTitle + ", author="
				+ author + ", postList=" + postList + "]";
	}
	public BlogBean() {
	}
	public BlogBean(int blogId, String blogName, String blogTitle, AuthorBean author) {
		super();
		this.blogId = blogId;
		this.blogName = blogName;
		this.blogTitle = blogTitle;
		this.author = author;
	}
	
}
