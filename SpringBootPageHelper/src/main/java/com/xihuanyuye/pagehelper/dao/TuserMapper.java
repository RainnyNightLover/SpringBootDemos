package com.xihuanyuye.pagehelper.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;
import com.xihuanyuye.pagehelper.bean.Tuser;

@Mapper
public interface TuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
    
    
    //后续添加
    /**
     * 获取所有数据
     * @return
     */
    List<Tuser> findAll();

    /**
     * 分页查询数据
     * @return
     */
    Page<Tuser> findByPage();
    
}