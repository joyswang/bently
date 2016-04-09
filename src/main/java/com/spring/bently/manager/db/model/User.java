package com.spring.bently.manager.db.model;

import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否超级会员
     */
    private Integer isadmin;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取是否超级会员
     *
     * @return isadmin - 是否超级会员
     */
    public Integer getIsadmin() {
        return isadmin;
    }

    /**
     * 设置是否超级会员
     *
     * @param isadmin 是否超级会员
     */
    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }
}