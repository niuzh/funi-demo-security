package com.funi.security.mbg.dto;

import com.funi.security.supports.BasicDto;
import java.io.Serializable;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table resource
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Resource extends BasicDto implements Serializable {
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
     * 资源名
     */
    private String resourceName;

    /**
     * 资源类型
     */
    private String type;

    /**
     * 资源
     */
    private String resource;

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
     * 得到资源名
     * @return  资源名
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置资源名
     * @param resourceName 资源名
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * 得到资源类型
     * @return  资源类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资源类型
     * @param type 资源类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 得到资源
     * @return  资源
     */
    public String getResource() {
        return resource;
    }

    /**
     * 设置资源
     * @param resource 资源
     */
    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
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