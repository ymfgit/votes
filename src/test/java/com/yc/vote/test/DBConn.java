package com.yc.vote.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DBConn {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Test
	public void test() {
		Connection con=null;
		con=sqlSessionFactory.openSession().getConnection();
		assertNotNull("链接不成功",con);
	}

}
