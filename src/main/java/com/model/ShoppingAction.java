package com.model;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action{
	public ShoppingAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String shopid=request.getParameter("shopid");
		HttpSession session=request.getSession();
		Enumeration<String> e=request.getParameterNames();
		while(e.hasMoreElements()) {
			String name=e.nextElement();
			String value=request.getParameter(name);
			session.setAttribute(name, value);
		}
		return shopid;
	}
}
