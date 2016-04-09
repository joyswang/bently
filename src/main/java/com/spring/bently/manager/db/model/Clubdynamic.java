package com.spring.bently.manager.db.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "clubdynamic")
public class Clubdynamic {
    /**
     * ����id
     */
    @Id
    private Integer id;

    /**
     * ����
     */
    private String title;

    /**
     * ����ʱ��
     */
    private Date updatetime;

    /**
     * ������
     */
    private String username;

    /**
     * ���
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
     * ��ȡ����
     *
     * @return title - ����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���ñ���
     *
     * @param title ����
     */
    public void setTitle(String title) {
        this.title = title;
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
     * ��ȡ���
     *
     * @return context - ���
     */
    public String getContext() {
        return context;
    }

    /**
     * ���ü��
     *
     * @param context ���
     */
    public void setContext(String context) {
        this.context = context;
    }
}