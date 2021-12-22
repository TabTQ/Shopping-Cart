package com.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerCheck;
import com.dao.CustomerEntry;

public class RegisterAction extends Action{
	public RegisterAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String city=request.getParameter("city");
		String add=request.getParameter("address");
		CustomerCheck obj = new CustomerCheck(uname);
		if(obj.getStr().equals("valid")) {
			new CustomerEntry(name, city, add, uname, upass, mobile, email);
			return "register.success";
		}
		else {
			return "register.already";
		}
	}
}
