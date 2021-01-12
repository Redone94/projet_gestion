package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Config.Context;
import model.Compte;
import model.Employe;
import model.Manager;
@WebServlet("/home")
public class Home extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/acceuil.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {}
		
		
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		Compte c=Context.getInstance().getDaoCompte().connect(mail, password);
		System.out.println("test");

		if(c instanceof Manager) {
			System.out.println("man");
			request.getSession().setAttribute("compte", c);
			response.sendRedirect("manager");
		}else if(c instanceof Employe) {
			System.out.println("emp");
			this.getServletContext().getRequestDispatcher("/WEB-INF/employe.jsp").forward(request, response);
			request.getSession().setAttribute("compte", c);
//			response.sendRedirect("employe");

		}else {
			System.out.println("ELSE");
			doGet(request, response);
		}
		
		
	}

}
