package com.znsd.mybatis.test;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.znsd.mybatis.bean.BlogBean;
import com.znsd.mybatis.bean.IBlogMapper;
import com.znsd.mybatis.bean.UserBean;
import com.znsd.mybatis.bean.Vehicle;
import com.znsd.mybatis.bean.VehicleDao;

public class MyTest {

	SqlSessionFactory factory;
	@Before
	public void init() throws IOException{
	//读取配置文件
	InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
	//创建SqlSessionFactory对象
	factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void test() {
		//创建Session对象
		SqlSession session = factory.openSession();
		
		UserBean userBean=new UserBean("one","疯");
		UserBean userBean2=new UserBean("two","疯");
		UserBean userBean3=new UserBean("three","疯");
		List<UserBean> userList=new ArrayList<UserBean>();
		userList.add(userBean);
		userList.add(userBean2);
		userList.add(userBean3);
		//读取配置文件中的查询方法
		IBlogMapper mapper=session.getMapper(IBlogMapper.class);
		//List<BlogBean> list = session.selectList("BlogMapper.findBlog");
		/*List<BlogBean> list=mapper.selectBlog();*/
		BlogBean blogBean=new BlogBean();
		blogBean.setBlogName("张三");
		List<BlogBean> list=mapper.findBlog(blogBean);

		/*BlogBean blogBean=new BlogBean();
		blogBean.setBlogTitle("xxx");
		List<BlogBean> lists=mapper.findBlogs(blogBean);*/
		System.out.println(list);
	
		/*for (UserBean user : list) {
		}*/
		/*int result = session.insert("UserMapper.insertUser",userList);
		session.commit();
		System.out.println("增加成功"+result);
		session.close();*/

	}
	
	@Test
	public void update() {
		//创建Session对象
		SqlSession session = factory.openSession();
		/*UserBean userBean=new UserBean(3,"李四","瞎");
		int result=session.update("UserMapper.userUpdate",userBean);*/
		IBlogMapper mapper=session.getMapper(IBlogMapper.class);
		BlogBean blogBean=new BlogBean();
		blogBean.setBlogId(2);
		blogBean.setBlogName("赵六");
		blogBean.setBlogTitle("人妖2");
		mapper.updateBlog(blogBean);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		session.commit();
		/*System.out.println("修改成功"+result);*/
		session.close();
	}
	
	@Test
	public void delete() {
		//创建Session对象
		SqlSession session = factory.openSession();
		List userList=new ArrayList();
		userList.add(12);
		userList.add(13);
		userList.add(14);
		int result=session.delete("UserMapper.userDelete",userList);
		session.commit();
		System.out.println("删除成功"+result);
		session.close();
	}
	
	@Test
    public void test6() {
		SqlSession session = factory.openSession();
        VehicleDao dao = session.getMapper(VehicleDao.class);
        List<Vehicle> list = dao.findAll();
        for (Vehicle v : list) {
            System.out.println(v);
        }
    }

}
