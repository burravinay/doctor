package com.drApp.webservlets;

import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.drApp.ejb.LoginHelper;
import com.drApp.ejb.LoginHelperRemote;


public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try{
			String uid=req.getParameter("userName"); 
			String pass=req.getParameter("Password");
			HttpSession a=req.getSession();
			
			/*
			 * 
			 * 
			 */
			
			System.out.println("recieved userid:"+uid+", pwd:"+pass);	
		InitialContext ic = new InitialContext();
		LoginHelperRemote lr= (LoginHelperRemote)ic.lookup("login#com.drApp.ejb.LoginHelperRemote");
			//LoginHelper jdbc= new LoginHelper();
			String role = lr.authenicateNAuthorize(uid,pass);
			PrintWriter out = res.getWriter();
			out.println(role);
			
			//res.getOutputStream().write(byteAr);	
			// db calls.. uid pwd
			
			/*if(uid.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
			{	res.sendRedirect("AppointmentHistory.html");
				//req.getRequestDispatcher("welcome.").forward(req, res);
				//a.setAttribute("isUserLoggedIn", true);
			}
			else
			{
				a.setAttribute("isUserLoggedIn", false);
				res.sendRedirect("error.html");
			}
				
			*/
			
		}catch(Exception e)
		{
			
		}
	}

	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{}
}
