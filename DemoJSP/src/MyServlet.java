import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

@WebServlet("/addAlien")
public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		
		PrintWriter out=response.getWriter();
		String name= request.getParameter("name");
		System.out.println("hi entered in servlets"+name);
		out.println("Hello ghvh"+name);
	}
}
