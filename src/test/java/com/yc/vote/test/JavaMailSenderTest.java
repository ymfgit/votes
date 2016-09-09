package com.yc.vote.test;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JavaMailSenderTest {
	@Autowired
	private JavaMailSender javaMailSender;//邮箱发送对象
	
	@Test
	public void testSendMail(){
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("15580334325@163.com");//发送者
		smm.setTo("1636905447@qq.com");//接受者
		smm.setSubject("玩一下......");//发送主题
		smm.setText("能不能严肃一点.....");//发送的消息
		
		javaMailSender.send(smm);//发送邮件
		System.out.println("邮箱认证正确.......");
	}
	
	@Test
	public void testSendMail02(){
		MimeMessage mm=javaMailSender.createMimeMessage();//邮件信息类
		
		try {
			MimeMessageHelper smm=new MimeMessageHelper(mm,true);
			smm.setFrom("15580334325@163.com");
			smm.setTo("1636905447@qq.com");
			smm.setSubject("玩一下......");
			smm.setText("hello,我就玩一下,你继续........<br>"
					+"<a href='http://www.baidu.com'>不会找度娘啊,点这里</a><br>"
					+"<img src='cid:pic123'/",true);//邮件内容
			FileSystemResource fsr=new FileSystemResource("d:/a.png");
			smm.addInline("pic123", fsr);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		javaMailSender.send(mm);//发送邮件
		System.out.println("邮箱认证正确.......");
	}
}
