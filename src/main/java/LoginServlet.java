

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out= response.getWriter();
	String username= request.getParameter("un");
	String password = request.getParameter("pw");
	
	if(username.equals("admin")&& password.equals("admin123"))
	{
		
		
	out.println("<body bgcolor=green><h1>Welcome!!!!  </h1>"+" <h1>"+username+"</h1></body>");
	}
	else
	{
		
		out.println("<body bgcolor=Red><h1>Invalid Credentials!!!! Login failed  </h1></body>");
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
