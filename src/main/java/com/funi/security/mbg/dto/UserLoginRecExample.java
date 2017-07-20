package com.funi.security.mbg.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserLoginRecExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * serialVersionUID 序列号 
     */
    private static final long serialVersionUID = 1L;

    /**
     * user_login_rec
     */
    protected String orderByClause;

    /**
     * user_login_rec
     */
    protected boolean distinct;

    /**
     * user_login_rec
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public UserLoginRecExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterionForJDBCDate("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_login_date not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdIsNull() {
            addCriterion("sys_create_id is null");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdIsNotNull() {
            addCriterion("sys_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdEqualTo(String value) {
            addCriterion("sys_create_id =", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdNotEqualTo(String value) {
            addCriterion("sys_create_id <>", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdGreaterThan(String value) {
            addCriterion("sys_create_id >", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_create_id >=", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdLessThan(String value) {
            addCriterion("sys_create_id <", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdLessThanOrEqualTo(String value) {
            addCriterion("sys_create_id <=", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdLike(String value) {
            addCriterion("sys_create_id like", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdNotLike(String value) {
            addCriterion("sys_create_id not like", value, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdIn(List<String> values) {
            addCriterion("sys_create_id in", values, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdNotIn(List<String> values) {
            addCriterion("sys_create_id not in", values, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdBetween(String value1, String value2) {
            addCriterion("sys_create_id between", value1, value2, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateIdNotBetween(String value1, String value2) {
            addCriterion("sys_create_id not between", value1, value2, "sysCreateId");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIsNull() {
            addCriterion("sys_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIsNotNull() {
            addCriterion("sys_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sys_create_time =", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sys_create_time <>", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sys_create_time >", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_create_time >=", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("sys_create_time <", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_create_time <=", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sys_create_time in", values, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sys_create_time not in", values, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_create_time between", value1, value2, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_create_time not between", value1, value2, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdIsNull() {
            addCriterion("sys_update_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdIsNotNull() {
            addCriterion("sys_update_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdEqualTo(String value) {
            addCriterion("sys_update_id =", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdNotEqualTo(String value) {
            addCriterion("sys_update_id <>", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdGreaterThan(String value) {
            addCriterion("sys_update_id >", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_update_id >=", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdLessThan(String value) {
            addCriterion("sys_update_id <", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("sys_update_id <=", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdLike(String value) {
            addCriterion("sys_update_id like", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdNotLike(String value) {
            addCriterion("sys_update_id not like", value, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdIn(List<String> values) {
            addCriterion("sys_update_id in", values, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdNotIn(List<String> values) {
            addCriterion("sys_update_id not in", values, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdBetween(String value1, String value2) {
            addCriterion("sys_update_id between", value1, value2, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateIdNotBetween(String value1, String value2) {
            addCriterion("sys_update_id not between", value1, value2, "sysUpdateId");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIsNull() {
            addCriterion("sys_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIsNotNull() {
            addCriterion("sys_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sys_update_time =", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sys_update_time <>", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sys_update_time >", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_update_time >=", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("sys_update_time <", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_update_time <=", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sys_update_time in", values, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sys_update_time not in", values, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_update_time between", value1, value2, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_update_time not between", value1, value2, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdIsNull() {
            addCriterion("sys_delete_id is null");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdIsNotNull() {
            addCriterion("sys_delete_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdEqualTo(String value) {
            addCriterion("sys_delete_id =", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdNotEqualTo(String value) {
            addCriterion("sys_delete_id <>", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdGreaterThan(String value) {
            addCriterion("sys_delete_id >", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_delete_id >=", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdLessThan(String value) {
            addCriterion("sys_delete_id <", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdLessThanOrEqualTo(String value) {
            addCriterion("sys_delete_id <=", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdLike(String value) {
            addCriterion("sys_delete_id like", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdNotLike(String value) {
            addCriterion("sys_delete_id not like", value, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdIn(List<String> values) {
            addCriterion("sys_delete_id in", values, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdNotIn(List<String> values) {
            addCriterion("sys_delete_id not in", values, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdBetween(String value1, String value2) {
            addCriterion("sys_delete_id between", value1, value2, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteIdNotBetween(String value1, String value2) {
            addCriterion("sys_delete_id not between", value1, value2, "sysDeleteId");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeIsNull() {
            addCriterion("sys_delete_time is null");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeIsNotNull() {
            addCriterion("sys_delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeEqualTo(Date value) {
            addCriterionForJDBCDate("sys_delete_time =", value, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sys_delete_time <>", value, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("sys_delete_time >", value, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_delete_time >=", value, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeLessThan(Date value) {
            addCriterionForJDBCDate("sys_delete_time <", value, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_delete_time <=", value, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeIn(List<Date> values) {
            addCriterionForJDBCDate("sys_delete_time in", values, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sys_delete_time not in", values, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_delete_time between", value1, value2, "sysDeleteTime");
            return (Criteria) this;
        }

        public Criteria andSysDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_delete_time not between", value1, value2, "sysDeleteTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_rec
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

	//自定义属性或方法
}