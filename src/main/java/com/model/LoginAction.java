package com.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dao.UserCheck;

public class LoginAction extends Action{
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response){
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		String action = new String();
		try {
			UserCheck obj = new UserCheck(uname, upass);
			action = obj.getStr();
		}catch(Exception e) {
			System.out.println("LA");
		}
		
		if(action.equals("valid")) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			return "login.success";
		}else if(action.equals("invalid")) {
			return "login.unsuccessful";
		}else {
			return "login.register";
		}
	}
}
