package com.yc.vote.serviceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.SubjectBeans;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.entity.VoteSubject;
import com.yc.vote.service.VoteService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class VoteServiceImplTest {
	@Autowired
	private VoteService voteService;
	@Test
	public void testFindAllSubject() {
		List<VoteSubject> subjects=voteService.findAllSubject();
		System.out.println(subjects);
		assertNotNull("结果不为空",subjects);
	}
	
	@Test
	public void testFindAllSubjectBeans() {
		List<SubjectBeans> subjects=voteService.findAllSubjectBeans();
		System.out.println(subjects);
		assertNotNull("结果不为空",subjects);
	}
	
	@Test
	public void testFindOptionBeans() {
		OptionBean options=voteService.findOptionsByVsId(105);
		System.out.println(options);
		assertNotNull("结果不为空",options);
	}
	
	@Test
	public void testFindVoteBeans() {
		VoteBean options=voteService.findVoteBeansByVsId(101);
		System.out.println(options);
		assertNotNull("结果不为空",options);
	}

}
