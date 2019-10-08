package com.example.demo;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.service.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	org.apache.logging.log4j.Logger log = LogManager.getLogger(DemoApplicationTests.class);

	@Resource
	UserInfoMapper userInfoMaper;

	@Resource
	DemoService demoService;

	@Test
	public void testInsert() {
		demoService.insert();
	}

	@Test
	public void testQuery() {
		log.info(demoService.query().toString());
	}
	@Test
	public void testUpdate() {
		demoService.update();
	}
}
