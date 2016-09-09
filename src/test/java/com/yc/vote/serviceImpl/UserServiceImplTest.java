package com.yc.vote.serviceImpl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.vote.entity.VoteUser;
import com.yc.vote.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceImplTest {
	@Autowired
	private UserService us;
	@Test
	public void testGetUser() {
		
		VoteUser user = new VoteUser();
		user.setVuusername("ss");
		user.setVupassword("a");
		
		user=us.login(user);
		System.out.println(user);
		assertNotNull("成功", user);
	}
	
}
