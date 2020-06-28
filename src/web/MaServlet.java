package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MaServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String VUE = "/bonjour.jsp";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
	    String prenom = request.getParameter("prenom");
	    
	    HttpSession session = request.getSession();
		
		session.setAttribute("nom" , nom);
		session.setAttribute("prenom" , prenom);
		System.out.println(session);
	    
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		System.out.println("tkhrbi9a");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
		
		
	}

}
