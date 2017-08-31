package com.user.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.user.entity.UserInfo;

public class UserInfoSqlProvider {

    public String insertSelective(UserInfo record) {
        BEGIN();
        INSERT_INTO("user_info_t");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            VALUES("user_password", "#{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            VALUES("user_email", "#{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhoneNumber() != null) {
            VALUES("user_phone_number", "#{userPhoneNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserKey() != null) {
            VALUES("user_key", "#{userKey,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(UserInfo record) {
        BEGIN();
        UPDATE("user_info_t");
        
        if (record.getUserName() != null) {
            SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            SET("user_password = #{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            SET("user_email = #{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhoneNumber() != null) {
            SET("user_phone_number = #{userPhoneNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserKey() != null) {
            SET("user_key = #{userKey,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}