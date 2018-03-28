package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends   HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responde) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, responde);
		request.setAttribute("email", request.getParameter("email"));
		request.setAttribute("password", request.getParameter("password"));
		PrintWriter out=responde.getWriter();
		out.println(request.getParameter("email")+"  "+request.getParameter("password"));
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse responde) throws ServletException, IOException {
		request.setAttribute("email", request.getParameter("email"));
		request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, responde);
	}
	

}
