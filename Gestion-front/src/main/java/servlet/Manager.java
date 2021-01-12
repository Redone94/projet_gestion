package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Config.Context;
import model.Employe;
import model.Compte;
import model.Conge;
@WebServlet("/manager")
public class Manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {}
		Compte m=(Compte) request.getSession().getAttribute("e");
		Integer id_manager=m.getId();
		List<Employe> e =Context.getInstance().getDaoEmploye().findByIdM(id_manager);
		List<Conge> c=Context.getInstance().getDaoConge().findAll();
		int id_emp=Integer.parseInt(request.getParameter("id_emp"));
		List<Conge> cemp=Context.getInstance().getDaoConge().FindByEmpId(id_emp);
		
		request.setAttribute("employes", e);
		request.setAttribute("conge", c);
		request.setAttribute("cong_emp", cemp);
		this.getServletContext().getRequestDispatcher("/WEB-INF/manager.jsp").forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
