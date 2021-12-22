package com.controller;

import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Action;

public class RequestProcessor {
	public void process(HttpServletRequest request, HttpServletResponse response) {
		try {
		Properties prop = (Properties)request.getAttribute("prop");
		
		String formid = request.getParameter("formid");
		
		String actionClass = prop.getProperty(formid);
		
		Action action = (Action)Class.forName(actionClass).getConstructor(null).newInstance(null);
		
		String result = action.execute(request,response);
		
		String nextPage = prop.getProperty(result);
		
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("RP");
		}
	}

}
