package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "member")
public class Member {
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
     * ��Ա��ʼʱ��
     */
    private Date begintime;

    /**
     * ��Ա����ʱ��
     */
    private Date endtime;

    /**
     * ϴ������
     */
    private Integer washcarnum;

    /**
     * ���Ŵ�������
     */
    private Integer waxingnum;

    /**
     * ��������
     */
    private Integer maintenum;

    /**
     * ���ھ�Ԯ����
     */
    private Integer indoorrenum;

    /**
     * �Ƿ��Ա
     */
    private Integer isvip;

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
     * ��ȡ��Ա��ʼʱ��
     *
     * @return begintime - ��Ա��ʼʱ��
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * ���û�Ա��ʼʱ��
     *
     * @param begintime ��Ա��ʼʱ��
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * ��ȡ��Ա����ʱ��
     *
     * @return endtime - ��Ա����ʱ��
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * ���û�Ա����ʱ��
     *
     * @param endtime ��Ա����ʱ��
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * ��ȡϴ������
     *
     * @return washcarnum - ϴ������
     */
    public Integer getWashcarnum() {
        return washcarnum;
    }

    /**
     * ����ϴ������
     *
     * @param washcarnum ϴ������
     */
    public void setWashcarnum(Integer washcarnum) {
        this.washcarnum = washcarnum;
    }

    /**
     * ��ȡ���Ŵ�������
     *
     * @return waxingnum - ���Ŵ�������
     */
    public Integer getWaxingnum() {
        return waxingnum;
    }

    /**
     * �������Ŵ�������
     *
     * @param waxingnum ���Ŵ�������
     */
    public void setWaxingnum(Integer waxingnum) {
        this.waxingnum = waxingnum;
    }

    /**
     * ��ȡ��������
     *
     * @return maintenum - ��������
     */
    public Integer getMaintenum() {
        return maintenum;
    }

    /**
     * ���ñ�������
     *
     * @param maintenum ��������
     */
    public void setMaintenum(Integer maintenum) {
        this.maintenum = maintenum;
    }

    /**
     * ��ȡ���ھ�Ԯ����
     *
     * @return indoorrenum - ���ھ�Ԯ����
     */
    public Integer getIndoorrenum() {
        return indoorrenum;
    }

    /**
     * �������ھ�Ԯ����
     *
     * @param indoorrenum ���ھ�Ԯ����
     */
    public void setIndoorrenum(Integer indoorrenum) {
        this.indoorrenum = indoorrenum;
    }

    /**
     * ��ȡ�Ƿ��Ա
     *
     * @return isvip - �Ƿ��Ա
     */
    public Integer getIsvip() {
        return isvip;
    }

    /**
     * �����Ƿ��Ա
     *
     * @param isvip �Ƿ��Ա
     */
    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }
}