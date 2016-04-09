package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "waxing")
public class Waxing {
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
     * Ԥ��ʱ��
     */
    private Date destinetime;

    /**
     * �ص�
     */
    private String location;

    /**
     * ����������
     */
    private String handleuser;

    /**
     * �Ƿ��Ѱ����
     */
    private Integer idhandle;

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
     * ��ȡԤ��ʱ��
     *
     * @return destinetime - Ԥ��ʱ��
     */
    public Date getDestinetime() {
        return destinetime;
    }

    /**
     * ����Ԥ��ʱ��
     *
     * @param destinetime Ԥ��ʱ��
     */
    public void setDestinetime(Date destinetime) {
        this.destinetime = destinetime;
    }

    /**
     * ��ȡ�ص�
     *
     * @return location - �ص�
     */
    public String getLocation() {
        return location;
    }

    /**
     * ���õص�
     *
     * @param location �ص�
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * ��ȡ����������
     *
     * @return handleuser - ����������
     */
    public String getHandleuser() {
        return handleuser;
    }

    /**
     * ���ð���������
     *
     * @param handleuser ����������
     */
    public void setHandleuser(String handleuser) {
        this.handleuser = handleuser;
    }

    /**
     * ��ȡ�Ƿ��Ѱ����
     *
     * @return idhandle - �Ƿ��Ѱ����
     */
    public Integer getIdhandle() {
        return idhandle;
    }

    /**
     * �����Ƿ��Ѱ����
     *
     * @param idhandle �Ƿ��Ѱ����
     */
    public void setIdhandle(Integer idhandle) {
        this.idhandle = idhandle;
    }
}