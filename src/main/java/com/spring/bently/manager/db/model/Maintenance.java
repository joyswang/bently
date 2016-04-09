package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "maintenance")
public class Maintenance {
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
     * 预定时间
     */
    private Date destinetime;

    /**
     * 地点
     */
    private String location;

    /**
     * 办理人名称
     */
    private String handleuser;

    /**
     * 是否已办理好
     */
    private Integer idhandle;

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
     * 获取预定时间
     *
     * @return destinetime - 预定时间
     */
    public Date getDestinetime() {
        return destinetime;
    }

    /**
     * 设置预定时间
     *
     * @param destinetime 预定时间
     */
    public void setDestinetime(Date destinetime) {
        this.destinetime = destinetime;
    }

    /**
     * 获取地点
     *
     * @return location - 地点
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置地点
     *
     * @param location 地点
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取办理人名称
     *
     * @return handleuser - 办理人名称
     */
    public String getHandleuser() {
        return handleuser;
    }

    /**
     * 设置办理人名称
     *
     * @param handleuser 办理人名称
     */
    public void setHandleuser(String handleuser) {
        this.handleuser = handleuser;
    }

    /**
     * 获取是否已办理好
     *
     * @return idhandle - 是否已办理好
     */
    public Integer getIdhandle() {
        return idhandle;
    }

    /**
     * 设置是否已办理好
     *
     * @param idhandle 是否已办理好
     */
    public void setIdhandle(Integer idhandle) {
        this.idhandle = idhandle;
    }
}