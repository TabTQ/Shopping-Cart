package com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
@WebServlet(
			loadOnStartup = 1,
			urlPatterns = {"*.do"},
			initParams = {
					@WebInitParam(name="configFile", value="/WEB-INF/config.properties")
			}
		)
public class ActionServlet extends HttpServlet {  
	private Properties prop;
	private RequestProcessor rp;
    /**
     * @see HttpServlet#HttpServlet()
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
    	try {
    		rp=new RequestProcessor();
    		String configFile = config.getInitParameter("configFile");
    		ServletContext app=config.getServletContext();
    		String path = app.getRealPath(configFile);
    		prop=new Properties();
    		prop.load(new FileInputStream(path));
    	}catch(Exception e) {
//    		e.printStackTrace();
    		System.out.println("AS");
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("prop", prop);
		rp.process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
