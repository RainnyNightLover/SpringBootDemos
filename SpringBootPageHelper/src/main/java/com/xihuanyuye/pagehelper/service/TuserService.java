package com.xihuanyuye.pagehelper.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.xihuanyuye.pagehelper.bean.Tuser;

public interface TuserService {

	List<Tuser> findAll();

	/**
	 * 分页查询
	 * 
	 * @param pageNo
	 *            页号
	 * @param pageSize
	 *            每页显示记录数
	 * @return
	 */
	Page<Tuser> findByPage(int pageNo, int pageSize);

	void insert(Tuser person);

}
