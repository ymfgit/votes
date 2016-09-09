package com.yc.vote.action;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.SubjectBeans;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.entity.VoteItem;
import com.yc.vote.entity.VoteSubject;
import com.yc.vote.service.VoteService;


@Transactional
@Controller("voteAction")
public class VoteAction implements SessionAware, ModelDriven<VoteItem> {
	private VoteItem voteItem;
	@Autowired
	private VoteService voteService;
	private Map<String, Object> session;

	public String list() {
		// System.out.println("进来了..........");
		List<SubjectBeans> subjects = voteService.findAllSubjectBeans();
		session.put("subjects", subjects);

		return "list";
	}

	public String view() {
		// LogManager.getLogger().debug("取到id"+vsId);
		OptionBean options = voteService.findOptionsByVsId(voteItem.getVsId());
		// System.out.println("各种选项"+options);
		session.put("optionBean", options);
		return "view";
	}

	public String vote() {
		// System.out.println("取到的vsid值"+voteItem.getVsId());
		// LogManager.getLogger().debug("取到id"+voteItem.getVsId());
		VoteBean voteBean = voteService.findVoteBeansByVsId(voteItem.getVsId());
		// System.out.println("各种选项"+voteBean);
		session.put("voteBean", voteBean);
		return "vote";
	}

	public String save() {
		String[] vopid=ServletActionContext.getRequest().getParameterValues("vopid");
		
		LogManager.getLogger().debug("索取到的item" + voteItem+"选项id"+Arrays.toString(vopid));
		try {
			voteService.saveVote(voteItem,vopid);
			return "saveSuccess";
		} catch (Exception e) {}
		session.put("saveMsg", "投票失败!!!");
		return "saveFail";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public VoteItem getModel() {
		voteItem = new VoteItem();
		return voteItem;
	}
}
