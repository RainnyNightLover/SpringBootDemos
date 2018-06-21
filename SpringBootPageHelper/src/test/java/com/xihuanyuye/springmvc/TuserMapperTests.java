package com.xihuanyuye.springmvc;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.xihuanyuye.pagehelper.bean.Tuser;
import com.xihuanyuye.pagehelper.page.PageInfo;
import com.xihuanyuye.pagehelper.service.TuserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TuserMapperTests {

	private Logger logger = LoggerFactory.getLogger(TuserMapperTests.class);

	@Autowired
	private TuserService tuserService;

	@Before
	public void testInsert() {
		Tuser tuser = new Tuser();
		tuser.setName("测试");
		tuser.setAge(10);
		tuserService.insert(tuser);

		Assert.assertNotNull(tuser.getId());
		logger.debug(JSON.toJSONString(tuser));
	}

	@Test
	public void testFindAll() {
		List<Tuser> tusers = tuserService.findAll();
		Assert.assertNotNull(tusers);
		logger.debug(JSON.toJSONString(tusers));
	}

	@Test
	public void testFindByPage() {
		Page<Tuser> persons = tuserService.findByPage(1, 2);
		// 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
		PageInfo<Tuser> pageInfo = new PageInfo<>(persons);
		Assert.assertNotNull(persons);
		logger.debug(pageInfo.toString());
		logger.debug(JSON.toJSONString(pageInfo));
	}

	@Test
	public void testCacheByPage() {
		long begin = System.currentTimeMillis();
		List<Tuser> persons = tuserService.findAll();
		long ing = System.currentTimeMillis();
		tuserService.findAll();
		long end = System.currentTimeMillis();
		logger.debug("第一次请求时间：" + (ing - begin) + "ms");
		logger.debug("第二次请求时间:" + (end - ing) + "ms");

		Assert.assertNotNull(persons);
		logger.debug(persons.toString());
		logger.debug(JSON.toJSONString(persons));
	}

}
