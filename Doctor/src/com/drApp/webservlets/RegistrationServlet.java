package com.drApp.webservlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RegistrationServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		
	}

	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try{
		/*	String name=req.getParameter("name"); 
			String lastname=req.getParameter("lastname");
			String mobilenumber=req.getParameter("mobilenumber"); 
			String homenumber=req.getParameter("homenumber");
			String streetname=req.getParameter("streetname"); 
			String city=req.getParameter("city");
			String state=req.getParameter("state"); 
			String zipcode=req.getParameter("zipcode");
			String insurancename=req.getParameter("insurancename");
			String insuranceid=req.getParameter("insuranceid");
			String creditcardnumber=req.getParameter("creditcardnumber");
			String expirydate=req.getParameter("expirydate"); 
			String userid=req.getParameter("userid");
			String emailid=req.getParameter("emailid");
			String npass=req.getParameter("npass"); 
			String cpass=req.getParameter("cpass");
			HttpSession a=req.getSession();
			
			
			 * 
			 * 
			 
			*/
			System.out.println("user successfully registered");
			//res.getOutputStream().print("user successfully registered");			// db calls.. uid pwd
			
	res.sendRedirect("HomePage.html");
	
			
			
			
		}catch(Exception e)
		{
			
		}
		
	}
}
