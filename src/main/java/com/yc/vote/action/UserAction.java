package com.yc.vote.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.VoteUser;
import com.yc.vote.service.UserService;
import com.yc.vote.util.voteData;

@Controller("userAction")
public class UserAction implements ModelDriven<VoteUser>,SessionAware{
	private VoteUser user;
	@Autowired
	private UserService userService;

	private Map<String, Object> session;
	
	public String login(){
		user=userService.login(user);
		if(user==null){
			session.put(voteData.ERROR_MSG, user);
			return "login";
		}
		session.put(voteData.LOGIN_USER, user);
		return "loginSuccess";
	}
	
	
	public String register(){
		int result=userService.register(user);
		if(result==1){
			return "registerSuccess";
		}else{
			return "failRegister";
		}
	}

	@Override
	public VoteUser getModel() {
		user=new VoteUser();
		return user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
}
