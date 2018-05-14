package com.znsd.mybatis.bean;

public class PostBean {
	
	private int postId;
	private String postTitle;
	private String postBody;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostBody() {
		return postBody;
	}
	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}
	@Override
	public String toString() {
		return "PostBean [postId=" + postId + ", postTitle=" + postTitle + ", postBody=" + postBody + "]";
	}
	
}
