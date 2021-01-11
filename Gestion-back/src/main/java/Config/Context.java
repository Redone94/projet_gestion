package Config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.IDAOCompte;
import dao.IDAOConge;
import dao.IDAOEmploye;
//import dao.IDAOManager;
import dao.IDAOService;
import dao.jpa.DAOCompte;
import dao.jpa.DAOConge;
import dao.jpa.DAOEmploye;
//import dao.jpa.DAOManager;
import dao.jpa.DAOService;





public class Context {
	private static Context _instance;
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion");
	
	private IDAOCompte daoCompte=new DAOCompte();
	private IDAOEmploye daoEmploye=new DAOEmploye();
	private IDAOConge daoConge=new DAOConge();
	private IDAOService daoService=new DAOService();
	
	
	public IDAOService getDaoService() {
		return daoService;
	}
	public void setDaoService(IDAOService daoService) {
		this.daoService = daoService;
	}
	public Context() {
		super();
	}
	public static Context getInstance()
	{
		if(_instance==null) 
		{
			_instance=new Context();
		}
		return _instance;
	}
	public static void set_instance(Context _instance) {
		Context._instance = _instance;
	}
	public EntityManagerFactory getEmf() {
		return emf;
	}
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	public IDAOCompte getDaoCompte() {
		return daoCompte;
	}
	public void setDaoCompte(IDAOCompte daoCompte) {
		this.daoCompte = daoCompte;
	}
	public IDAOEmploye getDaoEmploye() {
		return daoEmploye;
	}
	public void setDaoEmploye(IDAOEmploye daoEmploye) {
		this.daoEmploye = daoEmploye;
	}

	public IDAOConge getDaoConge() {
		return daoConge;
	}
	public void setDaoConge(IDAOConge daoConge) {
		this.daoConge = daoConge;
	}
	public void closeEmf() 
	{
		emf.close();
	}
}
