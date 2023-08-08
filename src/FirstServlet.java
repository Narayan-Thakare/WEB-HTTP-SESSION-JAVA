

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	
		
		
		   try{  
			   
		        response.setContentType("text/html");  
		        PrintWriter out = response.getWriter();  
		          
		        String n=request.getParameter("userName");  
		        out.print("Welcome "+n);  
		          
		        HttpSession session=request.getSession();  
		        session.setAttribute("uname",n);  
		        out.print("<br>");  

		        out.print("<a href='SecondServlet'>visit</a>");  
		                  
		        out.close();  
		  
		                }catch(Exception e){System.out.println(e);}  

	
	
	
	}

}
