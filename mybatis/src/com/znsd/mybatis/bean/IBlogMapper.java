package com.znsd.mybatis.bean;

import java.util.List;

public interface IBlogMapper {

	public List<BlogBean> selectBlog();
	
	public List<BlogBean> findBlog(BlogBean blogBean);
	
	public void updateBlog(BlogBean blogBean);
	
	public List<BlogBean> findBlogs(BlogBean blogBean);
}
