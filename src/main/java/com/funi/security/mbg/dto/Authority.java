package com.funi.security.mbg.dto;

import com.funi.security.supports.BasicDto;

import java.io.Serializable;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table authority
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Authority extends BasicDto implements Serializable {
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
     * 权限名
     */
    private String authorityName;

    /**
     * key
     */
    private String keyValue;

    /**
     * 父id
     */
    private String pid;

    /**
     * 排序
     */
    private String sort;

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
     * 得到权限名
     * @return  权限名
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * 设置权限名
     * @param authorityName 权限名
     */
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    /**
     * 得到key
     * @return  key
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * 设置key
     * @param keyValue key
     */
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue == null ? null : keyValue.trim();
    }

    /**
     * 得到父id
     * @return  父id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置父id
     * @param pid 父id
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * 得到排序
     * @return  排序
     */
    public String getSort() {
        return sort;
    }

    /**
     * 设置排序
     * @param sort 排序
     */
    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
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