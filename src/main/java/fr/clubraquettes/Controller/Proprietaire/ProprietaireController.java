package fr.clubraquettes.Controller.Proprietaire;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.clubraquettes.Entity.Proprietaire.Proprietaire;

@WebServlet( urlPatterns = "/club/*")
@SuppressWarnings("serial")
public class ProprietaireController extends HttpServlet{

	/*
	 * Method GET
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		String path = request.getPathInfo();
		
		switch(path){
			case "/admin_connexion":
				loginAction(request, response);
				break;
			case "/espace_club":
				espaceClubAction(request, response);
				break;
			case "/liste_adherents":
				listAdherentsAction(request, response);
				break;
			case "/ca_mois_precedent":
				caMoisAction(request, response);
				break;
			case "/status_club":
				statusClubAction(request, response);
				break;
			default: 
				this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/PagesErreur/404.jsp")
				.forward(request, response);
		}
		
	}
	
	/*
	 * Groupe d'actions METHOD GET
	 */
	
	/*
	 * Renvoi le formulaire de connexion 
	 */
	public void loginAction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/Proprietaire/form_login.jsp")
		.forward(request, response);
	}
	
	/*
	 * Renvoi vers l'espace d'administration
	 */
	public void espaceClubAction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/Proprietaire/espace_club.jsp")
		.forward(request, response);
	}
	
	/*
	 * Affiche la liste des adhérents
	 */
	public void listAdherentsAction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/Proprietaire/liste_adherents_club.jsp")
		.forward(request, response);
	}
	
	/*
	 * Affiche le chiffre d'affaire du mois -1 
	 */
	public void caMoisAction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/Proprietaire/ca_mois-un_club.jsp")
		.forward(request, response);
	}
	
	/*
	 * Affiche l'etat des installations
	 * Terrains
	 * Nombre
	 * status
	 * 
	 */
	public void statusClubAction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/Proprietaire/status_club.jsp")
		.forward(request, response);
	}
	
	/*
	 * Method POST
	 * Redirige vers l'espace d'administration si authentification OK
	 * Renvois formulaire si authentification KO
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		Proprietaire admin = new Proprietaire();
		
		admin.setCourriel(request.getParameter("courriel"));
		admin.setMotDePasse(request.getParameter("motDePasse"));
		
		request.setAttribute("admin", admin);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/views/Proprietaire/espace_club.jsp")
		.forward(request, response);
	}
	
}
