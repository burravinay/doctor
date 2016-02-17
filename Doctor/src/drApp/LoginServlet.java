package drApp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
			//res.getOutputStream().write(byteAr);	
			// db calls.. uid pwd
			
			if(uid.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
			{	res.sendRedirect("AppointmentHistory.html");
				//req.getRequestDispatcher("welcome.").forward(req, res);
				//a.setAttribute("isUserLoggedIn", true);
			}
			else
			{
				a.setAttribute("isUserLoggedIn", false);
				res.sendRedirect("error.html");
			}
				
			
			
		}catch(Exception e)
		{
			
		}
	}

	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{}
}
