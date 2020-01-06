package com.xust.entity;

/**
 * @author: Victor
 * @create: 2020-01-05 14:53
 **/

public class Admin {
    private String id;
    private String name;
    private String password;

    public Admin() {
        this(null,null,null);
    }

    public Admin(String name, String password) {
        this(null,name,password);
    }

    public Admin(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String user_name) {
        this.name = user_name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user_name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
