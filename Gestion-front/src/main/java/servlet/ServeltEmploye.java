package servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Config.Context;
import model.*;

@WebServlet("/employe")
public class ServeltEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employe emp=(Employe) request.getSession().getAttribute("compte");
		Compte m = Context.getInstance().getDaoCompte().findById(emp.getId_manager());
		DateTimeFormatter dateD = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		request.setAttribute("dateDemande",LocalDate.now().format(dateD));
		request.setAttribute("dateDD",LocalDate.now());
		request.setAttribute("emp", emp);
		System.out.println(emp);
		request.setAttribute("m", m);
		System.out.println(m);
		this.getServletContext().getRequestDispatcher("/WEB-INF/employe.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {}
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/employe.jsp").forward(request, response);
	}

}
