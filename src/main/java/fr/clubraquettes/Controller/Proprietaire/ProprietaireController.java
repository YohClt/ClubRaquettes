package fr.clubraquettes.Controller.Proprietaire;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ProprietaireController extends HttpServlet{

	/*
	 * URL/club/admin_connexion
	 * Method GET
	 * Renvois du formulaire de connexion
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/Proprietaire/form_login.jsp")
		.forward(request, response);
	}
}
