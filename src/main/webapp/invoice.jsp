<%@page import="com.dao.InvoiceGeneration"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invoice</title>
</head>
<body>
	<h1> </h1>
	<% 	Enumeration e=session.getAttributeNames();
		int i=0;
		List<Integer> itemList = new ArrayList<Integer>();
		String username=new String();
		while(e.hasMoreElements()){
			String name=(String)e.nextElement();
			if(name.equals("uname")){
				username=(String)session.getAttribute(name);
			}
			else if(name.equals("formid")||name.equals("shopid")){	
				i=i+1;
			}
			else{
				itemList.add(Integer.parseInt(name));
				//out.println("<h1>"+name+":"+value+"</h1>");
			}
		}
		InvoiceGeneration obj=new InvoiceGeneration(username, itemList, out);
		//int[] array=obj.getArray();
		//out.println("<h1>Invoice Generated</h1>");
		//for(int j=0;j<array.length;j++){
			//out.println("<h2>"+array[j]+"</h2>");
		//} 
	%>
</body>
</html>