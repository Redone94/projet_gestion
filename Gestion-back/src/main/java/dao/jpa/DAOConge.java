package dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Config.Context;
import dao.IDAOConge;
import model.Conge;
import model.Manager;

public class DAOConge implements IDAOConge {

	@Override
	public Conge save(Conge t) {

		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		try{t=em.merge(t);}
		catch(Exception e) {System.out.println("Error save Conge");}
		em.getTransaction().commit();
		em.close();
		return t;
	}

	@Override
	public void delete(Conge t) {
		
		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		try{em.remove(em.merge(t));}
		catch(Exception e) {System.out.println("Error delete Conge");}
		em.getTransaction().commit();
		em.close();		
	}

	@Override
	public Conge findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conge> findAll() {
		List<Conge> conges = new ArrayList();
		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		try 
		{
			Query query= em.createQuery("from Conge",Conge.class);
			conges=query.getResultList();
		}
		catch(Exception e){System.out.println("Error findAll Conge");}
		em.close();
		return conges;
	}

	@Override
	public List<Conge> FindByEmpId(Integer id) {
		List<Conge> conges = new ArrayList();
		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		try 
		{
			Query query= em.createQuery("SELECT c from Conge c LEFT JOIN c.employe e where e.user=:id",Conge.class);
			query.setParameter("id", id);
			conges=query.getResultList();
		}
		catch(Exception e){System.out.println("Error findAll Conge");}
		em.close();
		return conges;
	}

	@Override
	public List<Conge> FindByMId(Integer id) {
		List<Conge> conges = new ArrayList();
		EntityManager em=Context.getInstance().getEmf().createEntityManager();
		try 
		{
			Query query= em.createQuery("SELECT c from Conge c JOIN c.employe e where e.id_manager=:id",Conge.class);
			query.setParameter("id", id);

			conges=query.getResultList();
		}
		catch(Exception e){System.out.println("Error findAll Conge");}
		em.close();
		return conges;
	}




}
