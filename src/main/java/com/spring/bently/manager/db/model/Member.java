package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "member")
public class Member {
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
     * 会员开始时间
     */
    private Date begintime;

    /**
     * 会员结束时间
     */
    private Date endtime;

    /**
     * 洗车次数
     */
    private Integer washcarnum;

    /**
     * 上门打蜡次数
     */
    private Integer waxingnum;

    /**
     * 保养次数
     */
    private Integer maintenum;

    /**
     * 室内救援次数
     */
    private Integer indoorrenum;

    /**
     * 是否会员
     */
    private Integer isvip;

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
     * 获取会员开始时间
     *
     * @return begintime - 会员开始时间
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * 设置会员开始时间
     *
     * @param begintime 会员开始时间
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * 获取会员结束时间
     *
     * @return endtime - 会员结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置会员结束时间
     *
     * @param endtime 会员结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取洗车次数
     *
     * @return washcarnum - 洗车次数
     */
    public Integer getWashcarnum() {
        return washcarnum;
    }

    /**
     * 设置洗车次数
     *
     * @param washcarnum 洗车次数
     */
    public void setWashcarnum(Integer washcarnum) {
        this.washcarnum = washcarnum;
    }

    /**
     * 获取上门打蜡次数
     *
     * @return waxingnum - 上门打蜡次数
     */
    public Integer getWaxingnum() {
        return waxingnum;
    }

    /**
     * 设置上门打蜡次数
     *
     * @param waxingnum 上门打蜡次数
     */
    public void setWaxingnum(Integer waxingnum) {
        this.waxingnum = waxingnum;
    }

    /**
     * 获取保养次数
     *
     * @return maintenum - 保养次数
     */
    public Integer getMaintenum() {
        return maintenum;
    }

    /**
     * 设置保养次数
     *
     * @param maintenum 保养次数
     */
    public void setMaintenum(Integer maintenum) {
        this.maintenum = maintenum;
    }

    /**
     * 获取室内救援次数
     *
     * @return indoorrenum - 室内救援次数
     */
    public Integer getIndoorrenum() {
        return indoorrenum;
    }

    /**
     * 设置室内救援次数
     *
     * @param indoorrenum 室内救援次数
     */
    public void setIndoorrenum(Integer indoorrenum) {
        this.indoorrenum = indoorrenum;
    }

    /**
     * 获取是否会员
     *
     * @return isvip - 是否会员
     */
    public Integer getIsvip() {
        return isvip;
    }

    /**
     * 设置是否会员
     *
     * @param isvip 是否会员
     */
    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }
}