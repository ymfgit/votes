package com.yc.vote.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor {
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();//取到session的封装对象
		Object obj=session.get("loginUser");
		
		if(obj==null){
			session.put("errorMsg", "请登录后,再进行操作");
			return "Tologin";
		}
		return invocation.invoke();
	}

}
