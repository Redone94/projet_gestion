package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Config.Context;
import model.Employe;
import model.Conge;

public class Manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {}
		List<Employe> e =Context.getInstance().getDaoEmploye().findAll();
		List<Conge> c=Context.getInstance().getDaoConge().findAll();
		int id_emp=Integer.parseInt(request.getParameter("id_emp"));
		List<Conge> cemp=Context.getInstance().getDaoConge().FindByEmpId(id_emp);
		//String statut=
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/manager.jsp").forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
