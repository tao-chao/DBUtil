package com.znsd.dbutils.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.ResultSetHandler;

import com.znsd.dbutils.bean.UserBean;

//ResultSetHandler<T>,<T>表示封装结果的类型
//MyHandler 是自定义的ResultSetHandler封装结果集策略对象
public class MyHandler implements ResultSetHandler<List<UserBean>>{

@Override
public List<UserBean> handle(ResultSet rs) throws SQLException {
   // 封装数据，数据从 Resultset 中获取
   List<UserBean> list = new ArrayList<UserBean>();
    while(rs.next()){
    	UserBean u = new UserBean();
      u.setId(rs.getInt( "id"));
      u.setUserName(rs.getString( "userName"));
      u.setPassword(rs.getString( "password"));

      list.add(u);
   }
    return list;
}

}
