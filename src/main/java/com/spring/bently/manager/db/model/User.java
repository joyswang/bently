package com.spring.bently.manager.db.model;

import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * ����id
     */
    @Id
    private Integer id;

    /**
     * �û���
     */
    private String username;

    /**
     * ����
     */
    private String password;

    /**
     * �Ƿ񳬼���Ա
     */
    private Integer isadmin;

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
     * ��ȡ�û���
     *
     * @return username - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ�Ƿ񳬼���Ա
     *
     * @return isadmin - �Ƿ񳬼���Ա
     */
    public Integer getIsadmin() {
        return isadmin;
    }

    /**
     * �����Ƿ񳬼���Ա
     *
     * @param isadmin �Ƿ񳬼���Ա
     */
    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }
}