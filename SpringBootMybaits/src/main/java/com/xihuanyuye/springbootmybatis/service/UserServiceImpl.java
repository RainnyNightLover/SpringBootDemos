package com.xihuanyuye.springbootmybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xihuanyuye.springbootmybatis.bean.User;
import com.xihuanyuye.springbootmybatis.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		boolean flag = false;
		try {
			userDao.addUser(user);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		boolean flag = false;
		try {
			userDao.updateUser(user);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean flag = false;
		try {
			userDao.deleteUser(id);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public User findUserByName(String userName) {
		return userDao.findByName(userName);
	}

	@Override
	public User findUserById(int userId) {
		return userDao.findById(userId);
	}

	@Override
	public User findUserByAge(int userAge) {
		return userDao.findByAge(userAge);
	}

	@Override
    public int gettusernumber(){
        return userDao.gettusernumber();
    }
	
	@Override
    public List<User> gettuserlist(int startRecord,int pageSize){
        return userDao.gettuserlist(startRecord, pageSize);
    }
	
}
