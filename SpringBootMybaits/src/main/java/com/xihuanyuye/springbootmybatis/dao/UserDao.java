package com.xihuanyuye.springbootmybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xihuanyuye.springbootmybatis.bean.User;

@Mapper
public interface UserDao {

	/**
	 * 用户数据新增
	 */
	@Insert("insert into t_user(id,name,age) values (#{id},#{name},#{age})")
	void addUser(User user);

	/**
	 * 用户数据修改
	 */
	@Update("update t_user set name=#{name},age=#{age} where id=#{id}")
	void updateUser(User user);

	/**
	 * 用户数据删除
	 */
	@Delete("delete from t_user where id=#{id}")
	void deleteUser(int id);

	/**
	 * 根据用户名称查询用户信息
	 *
	 */
	@Select("SELECT id,name,age FROM t_user where name=#{userName}")
	User findByName(@Param("userName") String userName);

	/**
	 * 根据用户ID查询用户信息
	 *
	 */
	@Select("SELECT id,name,age FROM t_user where id=#{userId}")
	User findById(@Param("userId") int userId);

	/**
	 * 根据用户age查询用户信息
	 */
	@Select("SELECT id,name,age FROM t_user where age = #{userAge}")
	User findByAge(@Param("userAge") int userAge);
	
	/**
	 * 查询总记录数
	 */
	@Select("select count(*) from t_user")
    public int gettusernumber( );
	
	/**
	 * 分页查询
	 */
	@Select("select * from t_user limit #{startRecord},#{pageSize}")
    public List<User> gettuserlist(@Param("startRecord")int startRecord,@Param("pageSize")int pageSize);
	
}
