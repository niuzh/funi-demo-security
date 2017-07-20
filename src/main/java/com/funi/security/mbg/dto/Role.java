package com.funi.security.mbg.dto;

import com.funi.security.supports.BasicDto;
import java.io.Serializable;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Role extends BasicDto implements Serializable {
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
     * 角色名
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

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
     * 得到角色名
     * @return  角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 得到备注
     * @return  备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	//自定义属性或方法
}