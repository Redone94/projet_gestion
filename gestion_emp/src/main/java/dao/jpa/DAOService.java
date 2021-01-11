package dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Config.Context;
import dao.IDAOService;
import model.Service;

public class DAOService implements IDAOService{

	@Override
	public Service save(Service t) {
		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		try{t=em.merge(t);}
		catch(Exception e) {System.out.println("Error save Service");}
		em.getTransaction().commit();
		em.close();
		return t;
	}

	@Override
	public void delete(Service t) {
		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		try{em.remove(em.merge(t));}
		catch(Exception e) {System.out.println("Error delete Service");}
		em.getTransaction().commit();
		em.close();			
	}

	@Override
	public Service findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Service> findAll() {
		List<Service> services = new ArrayList();
		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		try 
		{
			Query query= em.createQuery("from Conge",Service.class);
			services=query.getResultList();
		}
		catch(Exception e){System.out.println("Error findAll Service");}
		em.close();
		return services;
	}

}
