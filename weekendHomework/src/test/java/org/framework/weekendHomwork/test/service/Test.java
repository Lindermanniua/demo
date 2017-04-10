package org.framework.weekendHomwork.test.service;

import javax.annotation.Resource;

import org.framestudy.weekendHomework.beans.Customer;
import org.framestudy.weekendHomework.beans.Order;
import org.framestudy.weekendHomework.dao.TestDao;
import org.framestudy.weekendHomework.dao.impl.TestDaoImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class Test {
	
//	@Resource
//	private IUserInfoSe/rvice userInfoService;
	@Resource
	private TestDao TestDaoImpl;
//	@Resource
//	private IDeptService deptServiceImpl;
	
	
	
	@Before
	public void before(){
		
	}
	
	@org.junit.Test
	public void test(){
		try {
//			userInfoService.updateUserInfo(new UserInfo(1l, "С��", 18));
//			deptServiceImpl.saveDept(new DeptInfo("���Ѳ���"));
			TestDaoImpl.trade(new Customer("�׷�"),new Order("һ����С��Ŀ"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
