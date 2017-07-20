package com.funi.security.mbg.dto;

import com.funi.security.supports.BasicDto;
import java.io.Serializable;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_login_rec
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class UserLoginRec extends BasicDto implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * serialVersionUID 序列号 
     */
    private static final long serialVersionUID = 1L;

    /**
     * pk_id
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 登录ip
     */
    private String lastLoginIp;

    /**
     * 登录时间
     */
    private Date lastLoginDate;

    /**
     * 得到pk_id
     * @return  pk_id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置pk_id
     * @param id pk_id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 得到用户id
     * @return  用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 得到登录ip
     * @return  登录ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置登录ip
     * @param lastLoginIp 登录ip
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * 得到登录时间
     * @return  登录时间
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置登录时间
     * @param lastLoginDate 登录时间
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

	//自定义属性或方法
}