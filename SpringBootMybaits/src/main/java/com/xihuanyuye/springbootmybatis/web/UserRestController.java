package com.xihuanyuye.springbootmybatis.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xihuanyuye.springbootmybatis.bean.User;
import com.xihuanyuye.springbootmybatis.service.UserService;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public boolean addUser(User user) {
		System.out.println("开始新增...");
		return userService.addUser(user);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public boolean updateUser(User user) {
		System.out.println("开始更新...");
		return userService.updateUser(user);
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	public boolean delete(@RequestParam(value = "userId", required = true) int userId) {
		System.out.println("开始删除...");
		return userService.deleteUser(userId);
	}

	@RequestMapping(value = "/userName", method = RequestMethod.GET)
	public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
		System.out.println("开始查询...");
		return userService.findUserByName(userName);
	}

	@RequestMapping(value = "/userId", method = RequestMethod.GET)
	public User findByUserId(@RequestParam(value = "userId", required = true) int userId) {
		System.out.println("开始查询...");
		return userService.findUserById(userId);
	}

	@RequestMapping(value = "/userAge", method = RequestMethod.GET)
	public User findByUserAge(@RequestParam(value = "userAge", required = true) int userAge) {
		System.out.println("开始查询...");
		return userService.findUserByAge(userAge);
	}

	/*
	 * 用户信息列表
	 */
	@GetMapping(value = "/gettuserlist")
	@ResponseBody
	public Map getStuinforList(HttpServletRequest request) {
		// response.setHeader("Access-Control-Allow-Origin", "*");
		int page = Integer.parseInt(request.getParameter("page"));
		int pageSzie = Integer.parseInt(request.getParameter("rows"));// pageSzie
		int startRecord = (page - 1) * pageSzie + 1;
		int total = userService.gettusernumber();
		List<User> stuinforlist = userService.gettuserlist(startRecord, pageSzie);
		Map resultMap = new HashMap();
		resultMap.put("total", total - 1);
		resultMap.put("rows", stuinforlist);
		return resultMap;
	}

}
