package com.spring.bently.manager.db.model;

import javax.persistence.*;

@Table(name = "activitysign")
public class Activitysign {
    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 微信id
     */
    private String wechatid;

    /**
     * 微信名称
     */
    private String wechatname;

    /**
     * 活动id
     */
    private Integer activityid;

    /**
     * 活动名称
     */
    private String activitytitle;

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
     * 获取微信id
     *
     * @return wechatid - 微信id
     */
    public String getWechatid() {
        return wechatid;
    }

    /**
     * 设置微信id
     *
     * @param wechatid 微信id
     */
    public void setWechatid(String wechatid) {
        this.wechatid = wechatid;
    }

    /**
     * 获取微信名称
     *
     * @return wechatname - 微信名称
     */
    public String getWechatname() {
        return wechatname;
    }

    /**
     * 设置微信名称
     *
     * @param wechatname 微信名称
     */
    public void setWechatname(String wechatname) {
        this.wechatname = wechatname;
    }

    /**
     * 获取活动id
     *
     * @return activityid - 活动id
     */
    public Integer getActivityid() {
        return activityid;
    }

    /**
     * 设置活动id
     *
     * @param activityid 活动id
     */
    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    /**
     * 获取活动名称
     *
     * @return activitytitle - 活动名称
     */
    public String getActivitytitle() {
        return activitytitle;
    }

    /**
     * 设置活动名称
     *
     * @param activitytitle 活动名称
     */
    public void setActivitytitle(String activitytitle) {
        this.activitytitle = activitytitle;
    }
}