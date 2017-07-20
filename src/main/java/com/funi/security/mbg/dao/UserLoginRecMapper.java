package com.funi.security.mbg.dao;

import com.funi.security.mbg.dto.UserLoginRec;
import com.funi.security.mbg.dto.UserLoginRecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginRecMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    long countByExample(UserLoginRecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int deleteByExample(UserLoginRecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int insert(UserLoginRec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int insertSelective(UserLoginRec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    List<UserLoginRec> selectByExample(UserLoginRecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    UserLoginRec selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserLoginRec record, @Param("example") UserLoginRecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserLoginRec record, @Param("example") UserLoginRecExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserLoginRec record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_rec
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserLoginRec record);

	//自定义属性或方法
}