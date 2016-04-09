package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "clubprofile")
public class Clubprofile {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 更新人
     */
    private String username;

    /**
     * 简介
     */
    private String context;

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
     * 获取更新时间
     *
     * @return updatetime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取更新人
     *
     * @return username - 更新人
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置更新人
     *
     * @param username 更新人
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取简介
     *
     * @return context - 简介
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置简介
     *
     * @param context 简介
     */
    public void setContext(String context) {
        this.context = context;
    }
}