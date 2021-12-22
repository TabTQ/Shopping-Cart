package com.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoLoginAction extends Action{
	public GoLoginAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		return "gologin.success";
	}
}
