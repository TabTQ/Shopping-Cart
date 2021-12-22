package com.dao;

import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.jsp.JspWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class InvoiceGeneration {
	private int size;
	private int[] array=new int[size];
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public String spaces(String str) {
		String a = "          ";
		String ans = new String();
		String count = " ";
		for(int i=0;i<(a.length()-str.length());i++) {
			ans = ans + count;
		}
		return ans;
	}
	public InvoiceGeneration(String uname, List<Integer> itemList, JspWriter out) {
		setSize(itemList.size());
//		int[] arr=new int[getSize()];
//		int i=0;
//		for(int a:itemList) {
//			arr[i]=a;
//			i+=1;
//		}
//		setArray(arr);
		
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		User obj = (User)session.load(User.class, uname);
		
//		String OWNER_PASSWORD = "mypass";
//		String USER_PASSWORD = obj.getUpass();
		
		CustomerDTO customer = obj.getUser();
		String name = customer.getCustomer_name();
		String city = customer.getCustomer_city();
		String add = customer.getCustomer_address();
		String email = customer.getEmail();
		String mob = customer.getMobile();
		
//		try  {  
//			String pdfname = uname;
//			String filepath= "D:\\JavaPDF\\";
//			String ext=".pdf";
//			filepath=filepath+pdfname+ext;
//			
//			FileOutputStream fos = new FileOutputStream(filepath);  
//			Document doc = new Document();  
//			PdfWriter writer = PdfWriter.getInstance(doc, fos);  
//			writer.setEncryption(USER_PASSWORD.getBytes(), OWNER_PASSWORD.getBytes(), PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);  
//			doc.open();  
//			doc.add(new Paragraph("INVOICE"));  
//			doc.add(new Paragraph("                                       "));  
//			doc.add(new Paragraph("Name      : "+name));  
//			doc.add(new Paragraph("City      : "+city));  
//			doc.add(new Paragraph("Address   : "+add));  
//			doc.add(new Paragraph("Mobile No : "+mob));  
//			doc.add(new Paragraph("Email     : "+email));  
//			doc.add(new Paragraph("                                       "));  
//			int itemNo=0;
//			int total=0;
//			for(int a:itemList) {
//				ItemDTO items = (ItemDTO)session.load(ItemDTO.class, Integer.valueOf(a));
//				doc.add(new Paragraph("Item No : "+itemNo+"Item Name : "+items.getItemname()+"Unit : "+items.getUnit()+"Price : "+items.getPrice()));
//				total+=items.getPrice();
//				itemNo+=1;
//			}
//			doc.add(new Paragraph("Total Amount     : "+total));
//			doc.close();  
//			fos.close();  
//		}catch (Exception e){  
//			System.out.println("Invoice Generation Error!!!!"); 
//		}
		try {
		out.println("<h1>INVOICE</h1>");  
		out.println("<h2>        </h2>");  
		out.println("<h2>Name      : "+name+"</h2>");  
		out.println("<h2>City      : "+city+"</h2>");  
		out.println("<h2>Address   : "+add+"</h2>");  
		out.println("<h2>Mobile No : "+mob+"</h2>");  
		out.println("<h2>Email     : "+email+"</h2>");  
		out.println("<h2>                </h2>");  
		int itemNo=1;
		float total=0;
		for(int a:itemList) {
			ItemDTO items = (ItemDTO)session.load(ItemDTO.class, Integer.valueOf(a));
			String itemName = items.getItemname();
			String itemUnit = items.getUnit();
			float itemPrice = items.getPrice();
			String price = Float.toString(itemPrice);
			out.println("<h3>Item No : "+itemNo+" | Item Name : "+itemName+" | Unit : "+itemUnit+" | Price : "+price+"</h3>");
			total+=itemPrice;
			itemNo+=1;
		}
		out.println("<h2>Total Amount     : "+total+"</h2>");
		}
		catch(Exception e) {
			System.out.println("IG ERROR");
		}
	}
}
