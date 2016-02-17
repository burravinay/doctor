package drApp;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.jobhunt.PrintWriter;


public class AppointmentHistory extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		
	}

	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
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
			

			res.setContentType("application/json");
			PrintWriter out = res.getWriter();
	        out.println("{");

				out.println("\"appointments\":[{\"doctorname\": \"Dr.Jackson\", \"date\" : \"01-20-2016\", \"illness\" : \"Diabties\",\"prescription\": \"tydsjsf\",\"bill\":\"190$\",\"status\":\"paid\",\"PDF\":\"pdf\"},");
						out.println("{\"doctorname\": \"Dr.Azam\", \"date\" : \"01-25-2016\", \"illness\" : \"Hypertension\",\"prescription\": \"tylenol\",\"bill\":\"120$\",\"status\":\"paid\",\"PDF\":\"pdf\"},");
						out.println("{\"doctorname\": \"Dr.Jack\", \"date\" : \"01-29-2016\", \"illness\" : \"Fever,Cold\",\"prescription\": \"tylenol,advil\",\"bill\":\"120$\",\"status\":\"paid\",\"PDF\":\"pdf\"}]");

			out.println("}");
	        out.close();
		
			
			System.out.println("user was successfully returned history");
			//res.getOutputStream().print("user successfully registered");			// db calls.. uid pwd
	
		}catch(Exception e)
		{
			
		}
		
	}
}
