package com.spring.bently.manager.db.model;

import javax.persistence.*;

@Table(name = "activitysign")
public class Activitysign {
    /**
     * ����id
     */
    @Id
    private Integer id;

    /**
     * ΢��id
     */
    private String wechatid;

    /**
     * ΢������
     */
    private String wechatname;

    /**
     * �id
     */
    private Integer activityid;

    /**
     * �����
     */
    private String activitytitle;

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ΢��id
     *
     * @return wechatid - ΢��id
     */
    public String getWechatid() {
        return wechatid;
    }

    /**
     * ����΢��id
     *
     * @param wechatid ΢��id
     */
    public void setWechatid(String wechatid) {
        this.wechatid = wechatid;
    }

    /**
     * ��ȡ΢������
     *
     * @return wechatname - ΢������
     */
    public String getWechatname() {
        return wechatname;
    }

    /**
     * ����΢������
     *
     * @param wechatname ΢������
     */
    public void setWechatname(String wechatname) {
        this.wechatname = wechatname;
    }

    /**
     * ��ȡ�id
     *
     * @return activityid - �id
     */
    public Integer getActivityid() {
        return activityid;
    }

    /**
     * ���ûid
     *
     * @param activityid �id
     */
    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    /**
     * ��ȡ�����
     *
     * @return activitytitle - �����
     */
    public String getActivitytitle() {
        return activitytitle;
    }

    /**
     * ���û����
     *
     * @param activitytitle �����
     */
    public void setActivitytitle(String activitytitle) {
        this.activitytitle = activitytitle;
    }
}