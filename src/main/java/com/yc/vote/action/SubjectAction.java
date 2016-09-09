package com.yc.vote.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.entity.VoteOption;
import com.yc.vote.entity.VoteSubject;
import com.yc.vote.service.SubjectService;
import com.yc.vote.service.VoteService;

@Controller("subjectAction")
public class SubjectAction implements ModelDriven<AddSubjectBean>,SessionAware{

	private AddSubjectBean addSubjectBean;
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private VoteService voteService;
	VoteBean voteBean;
	private Map<String, Object> session;
	public String save(){
		LogManager.getLogger().debug("输出的值:"+addSubjectBean);
		try {
			subjectService.add(addSubjectBean);
			return "addSuccess";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "addFail";
	}
	
	
	public String search(){
		String vstitle=ServletActionContext.getRequest().getParameter("keywords");
		Map<String,String> map=new HashMap<String,String>();
		map.put("vsTitle", vstitle);
		System.out.println(vstitle+"模糊查询");
		List<VoteSubject> subject=subjectService.findSubjectByName(map);
		ActionContext.getContext().getSession().put("subjects", subject);
		
		return "search";
	}
	
	public String modify(){
		return "modify";
	}
	
	public String fix(){
		int vsId=addSubjectBean.getVsId();
		voteBean = voteService.findVoteBeansByVsId(vsId);
		session.put("voteBean", voteBean);
		return "fix";
	}
	
	public String update(){
		int vsId=Integer.parseInt(ServletActionContext.getRequest().getParameter("vsId"));
		String vsTitle=ServletActionContext.getRequest().getParameter("vsTitle");
		String vsType=ServletActionContext.getRequest().getParameter("vsType");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("vsId", vsId);
		map.put("vsTitle", vsTitle);
		map.put("vsType", vsType);
		
		int result=subjectService.updateSubject(map);
		int result1=subjectService.deleteOptionByVsid(vsId);
		
		List<String> options=addSubjectBean.getOptions();
		for (int i = 0; i < options.size(); i++) {
			VoteOption option=new VoteOption(options.get(i),addSubjectBean.getVsId(),i+1);
			subjectService.addOption(option);
		}
		if(result==1){
			return "updateSuccess";
		}else{
			return "updateFail";
		}
		
	}
	
	


	@Override
	public AddSubjectBean getModel() {
		addSubjectBean=new AddSubjectBean();
		return addSubjectBean;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
