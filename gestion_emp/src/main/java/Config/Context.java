package Config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.IDAOCompte;
import dao.IDAOConge;
import dao.IDAOEmploye;
import dao.IDAOManager;
import dao.jpa.DAOCompte;
import dao.jpa.DAOConge;
import dao.jpa.DAOEmploye;
import dao.jpa.DAOManager;





public class Context {
	private static Context _instance;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion");
	
	private IDAOCompte daoCompte=new DAOCompte();
	private IDAOEmploye daoEmploye=new DAOEmploye();
	private IDAOManager daoManager=new DAOManager();
	private IDAOConge daoConge=new DAOConge();
	
	
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
	public IDAOManager getDaoManager() {
		return daoManager;
	}
	public void setDaoManager(IDAOManager daoManager) {
		this.daoManager = daoManager;
	}
	public IDAOConge getDaoConge() {
		return daoConge;
	}
	public void setDaoConge(IDAOConge daoConge) {
		this.daoConge = daoConge;
	}
	
}
