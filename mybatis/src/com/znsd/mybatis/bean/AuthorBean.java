package com.znsd.mybatis.bean;

public class AuthorBean {
	
	private int authorId;
	private String authorName;
	private String gender;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "AuthorBean [authorId=" + authorId + ", authorName=" + authorName + ", gender=" + gender + "]";
	}
	public AuthorBean(int authorId, String authorName, String gender) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.gender = gender;
	}
	public AuthorBean() {
	}
	
}
