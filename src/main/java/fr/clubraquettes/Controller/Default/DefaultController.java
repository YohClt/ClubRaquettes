package fr.clubraquettes.Controller.Default;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DefaultController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
			this.getServletContext()
			.getRequestDispatcher("/WEB-INF/index.jsp")
			.forward(request, response);
	}
}