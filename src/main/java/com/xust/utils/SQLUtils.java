package com.xust.utils;


import com.xust.entity.Admin;
import com.xust.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Victor
 * @create: 2020-01-04 17:24
 **/

public class SQLUtils {
    private static Connection connection ;
    private static Logger logger = LoggerFactory.getLogger(SQLUtils.class);
    private static final String url = "jdbc:mysql://localhost:3306/contact?useSSL=true&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
    private static final String name = "com.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "mysql111";
    private static PreparedStatement preparedStatement;
    static {
        try {
            Class.forName(name);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    private SQLUtils() {}

    public static User query(String name) {
        ResultSet set = null;
        String sql = "select * from user where name='"+name+"';";
        User user = new User();
        try {
            logger.info(sql);
            set = connection.prepareStatement(sql).executeQuery();
            if(set.next()) {
                user.setId(Integer.parseInt(set.getString("id")));
                user.setName(set.getString("name"));
                user.setEmail(set.getString("email"));
                user.setPostid(Integer.parseInt(set.getString("postid")));
                user.setNumber(set.getString("number"));
                user.setAddress(set.getString("address"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public static Admin check(String name, String password)  {
        String sql = "select * from admin where admin_name='"+name+"' and admin_password='"+password+"';";
        ResultSet result ;
        Admin admin = new Admin();
        try {
            result = connection.prepareStatement(sql).executeQuery();
            if(result.next()) {
                admin.setName(result.getString("admin_name"));
                admin.setPassword(result.getString("admin_password"));
                admin.setId(result.getString("admin_id"));
                logger.info(result.getString("admin_id"));
                logger.info(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return admin;
    }

    public static List<User> getAll() {
        String sql = "select * from user;";
        List<User> list = new ArrayList<>();
        CallableStatement call = null;
        ResultSet result = null;
        try{
            call = connection.prepareCall(sql);
            result = call.executeQuery();
            boolean tag = call.execute();
            int count = 1;
            while (tag){
                result = call.getResultSet();
                while (result.next()) {
                    ResultSetMetaData rsmd = result.getMetaData();
                    int column = rsmd.getColumnCount();
                    Map<String,Object> map = new HashMap<>();
                    for (int i = 0; i < column; i++) {
                        map.put(rsmd.getColumnName(i+1).toLowerCase(), result.getObject(i+1));
                    }
                    User user = new User();
                    user.setId(count++);
                    user.setName((String) map.get("name"));
                    user.setAddress((String) map.get("address"));
                    user.setNumber((String) map.get("number"));
                    user.setPostid((Integer) map.get("postid"));
                    user.setEmail((String) map.get("email"));
                    list.add(user);
                }
                tag = call.getMoreResults();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static void delete(String name) {
        String sql = "delete from user where name='"+name+"';";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean insert(User user) {
        String sql = "insert into user (name,address,number,postid,email) values (?,?,?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getAddress());
            preparedStatement.setString(3,user.getNumber());
            preparedStatement.setInt(4,user.getPostid());
            preparedStatement.setString(5,user.getEmail());
            int t = preparedStatement.executeUpdate();
            if( t != 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void update(User user) {
        String sql = "update user set address='"+user.getAddress()+"',number='"+user.getNumber()+"',postid="+ user.getPostid()+",email='"+user.getEmail()+"' where name='"+user.getName()+"';";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<User> order(String type) {
        String sql = "select * from user order by " + type +";";
        List<User> list = new ArrayList<>();
        CallableStatement call = null;
        ResultSet result = null;
        try{
            call = connection.prepareCall(sql);
            result = call.executeQuery();
            boolean tag = call.execute();
            int count = 1;
            while (tag){
                result = call.getResultSet();
                while (result.next()) {
                    ResultSetMetaData rsmd = result.getMetaData();
                    int column = rsmd.getColumnCount();
                    Map<String,Object> map = new HashMap<>();
                    for (int i = 0; i < column; i++) {
                        map.put(rsmd.getColumnName(i+1).toLowerCase(), result.getObject(i+1));
                    }
                    User user = new User();
                    user.setId(count++);
                    user.setName((String) map.get("name"));
                    user.setAddress((String) map.get("address"));
                    user.setNumber((String) map.get("number"));
                    user.setPostid((Integer) map.get("postid"));
                    user.setEmail((String) map.get("email"));
                    list.add(user);
                }
                tag = call.getMoreResults();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
