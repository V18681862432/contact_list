package com.xust.entity;

/**
 * @author: Victor
 * @create: 2020-01-04 17:18
 **/

public class User {
    private Integer id;
    private String name;
    private String address;
    private String number;
    private Integer postid;
    private String email;
    public User() {
        this(null,null,null,null,null,null);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", postid=" + postid +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String address, String number, Integer postid, String email) {
        this(null,name,address,number,postid,email);
    }

    public User(Integer id, String name, String address, String number, Integer postid, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.postid = postid;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }


}
