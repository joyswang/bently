package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "useractivity")
public class Useractivity {
    /**
     * ����id
     */
    @Id
    private Integer id;

    /**
     * �����
     */
    private String title;

    /**
     * ���ʼʱ��
     */
    private Date begintime;

    /**
     * �����ʱ��
     */
    private Date endtime;

    /**
     * ����ʱ��
     */
    private Date updatetime;

    /**
     * ������
     */
    private String username;

    /**
     * �����
     */
    private String context;

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
     * ��ȡ�����
     *
     * @return title - �����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���û����
     *
     * @param title �����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ���ʼʱ��
     *
     * @return begintime - ���ʼʱ��
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * ���û��ʼʱ��
     *
     * @param begintime ���ʼʱ��
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * ��ȡ�����ʱ��
     *
     * @return endtime - �����ʱ��
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * ���û����ʱ��
     *
     * @param endtime �����ʱ��
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return updatetime - ����ʱ��
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updatetime ����ʱ��
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * ��ȡ������
     *
     * @return username - ������
     */
    public String getUsername() {
        return username;
    }

    /**
     * ���ø�����
     *
     * @param username ������
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ�����
     *
     * @return context - �����
     */
    public String getContext() {
        return context;
    }

    /**
     * ���û����
     *
     * @param context �����
     */
    public void setContext(String context) {
        this.context = context;
    }
}