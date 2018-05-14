package com.znsd.dbutils.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.BeanMapHandler;
import org.junit.Test;

import com.znsd.dbutils.bean.UserBean;
import com.znsd.dbutils.utils.JdbcUtils;
import com.znsd.dbutils.utils.MyHandler;

public class MyTest {

	@Test
	public void test() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "insert into t_users values(null,?,?)";
		try {
		 
			int update = qr.update(sql, "狗剩","789");
			 
			System.out.println(update);
		 
		} catch (SQLException e) {
		 
		e.printStackTrace();
		 
		}
	}
	
	@Test
	public void testUpdate() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "update t_users set userName = ? where id = ?";
		try {
			 
			int update = qr.update(sql,"狗屎",2);
			 
			System.out.println(update);
		 
		} catch (SQLException e) {
		 
		e.printStackTrace();
		 
		}
		
	}
	
	@Test
	public void testDelete() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "delete from t_users where id = ?";
		try {
		 
			int update = qr.update(sql, 3);
			 
			System.out.println(update);
			 
		} catch (SQLException e) {
		 
		e.printStackTrace();
		 
		}
		
	}
	
	@Test
	public void testSelect() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "select * from t_users";
		try {
			 
			List<UserBean> userList = qr.query(sql, new MyHandler());
			 
			for (UserBean userBean : userList) {
				System.out.println(userBean);
			}
		 
		} catch (SQLException e) {
		 
		e.printStackTrace();
		 
		}
	}
	
	@Test
	public void test2() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "select * from t_users";
		try {
			//BeanHandler     将查询结果的第一行数据，封装到user对象
			UserBean user = qr.query(sql, new BeanHandler<UserBean>(UserBean.class));
			System.out.println(user);
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "select * from t_users";
		try {
			//BeanListHandler     将查询结果的每一行封装到user对象，然后再存入List集合
			List<UserBean> userList = qr.query(sql, new BeanListHandler<UserBean>(UserBean.class));
			System.out.println(userList);
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test4() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "select * from t_users";
		try {
			//BeanMapHandler     将查询结果的每一行数据，封装到User对象，再存入mao集合中（key==列名，value==列值）
			Map<UserBean, UserBean> userList = qr.query(sql, new BeanMapHandler<UserBean,UserBean>(UserBean.class));
			System.out.println(userList);
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test5() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "select * from t_users";
		try {
			//ArrayHandler：     将查询结果的第一行数据，保存到Object数组中
			Object[] obj = qr.query(sql, new ArrayHandler());
			System.out.println(obj[1]);
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test6() {
		//第一步：创建queryRunner对象，用来操作sql语句
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		//第二步：创建sql语句
		String sql = "select * from t_users";
		try {
			//ArrayListHandler     将查询的结果，每一行先封装到Object数组中，然后将数据存入List集合
			List<Object[]> userList = qr.query(sql, new ArrayListHandler());
			System.out.println(userList);
			for (Object[] objects : userList) {
				System.out.println(objects[1]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
