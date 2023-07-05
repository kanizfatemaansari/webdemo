

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalculatorServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		double num1= Double.parseDouble(request.getParameter("txt1"));
		double num2= Double.parseDouble(request.getParameter("txt2"));
		double result=0;
		String opr= request.getParameter("opr");
		if(opr.equals("+")) result= num1+num2;
		if(opr.equals("-")) result= num1-num2;
		if(opr.equals("*")) result= num1*num2;
		if(opr.equals("/")) result= num1/num2;
		out.print("<h1>Result=</h1>"+"<h1>"+result+"</h1>");
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
