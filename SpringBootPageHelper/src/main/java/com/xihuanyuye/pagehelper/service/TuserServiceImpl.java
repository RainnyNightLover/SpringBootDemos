package com.xihuanyuye.pagehelper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xihuanyuye.pagehelper.bean.Tuser;
import com.xihuanyuye.pagehelper.dao.TuserMapper;

@Service
public class TuserServiceImpl implements TuserService {

	@Autowired
	private TuserMapper tuserMapper;

	@Override
	public List<Tuser> findAll() {
		return tuserMapper.findAll();
	};

	@Override
	public Page<Tuser> findByPage(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		return tuserMapper.findByPage();
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void insert(Tuser tuser) {
		tuserMapper.insert(tuser);
	}

}
