package com.user.mapper;

import com.user.entity.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserInfoMapper {
    @Delete({
        "delete from user_info_t",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_info_t (id, user_name, ",
        "user_password, user_email, ",
        "user_phone_number, user_key)",
        "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{userPassword,jdbcType=VARCHAR}, #{userEmail,jdbcType=VARCHAR}, ",
        "#{userPhoneNumber,jdbcType=VARCHAR}, #{userKey,jdbcType=VARCHAR})"
    })
    int insert(UserInfo record);

    @InsertProvider(type=UserInfoSqlProvider.class, method="insertSelective")
    int insertSelective(UserInfo record);

    @Select({
        "select",
        "id, user_name, user_password, user_email, user_phone_number, user_key",
        "from user_info_t",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone_number", property="userPhoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_key", property="userKey", jdbcType=JdbcType.VARCHAR)
    })
    UserInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserInfo record);

    @Update({
        "update user_info_t",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "user_password = #{userPassword,jdbcType=VARCHAR},",
          "user_email = #{userEmail,jdbcType=VARCHAR},",
          "user_phone_number = #{userPhoneNumber,jdbcType=VARCHAR},",
          "user_key = #{userKey,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserInfo record);
}