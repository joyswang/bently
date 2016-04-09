package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "useractivity")
public class Useractivity {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 活动开始时间
     */
    private Date begintime;

    /**
     * 活动结束时间
     */
    private Date endtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 更新人
     */
    private String username;

    /**
     * 活动内容
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
     * 获取活动标题
     *
     * @return title - 活动标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置活动标题
     *
     * @param title 活动标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取活动开始时间
     *
     * @return begintime - 活动开始时间
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * 设置活动开始时间
     *
     * @param begintime 活动开始时间
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * 获取活动结束时间
     *
     * @return endtime - 活动结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置活动结束时间
     *
     * @param endtime 活动结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
     * 获取活动内容
     *
     * @return context - 活动内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置活动内容
     *
     * @param context 活动内容
     */
    public void setContext(String context) {
        this.context = context;
    }
}