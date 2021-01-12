package model;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("employe")
public class Employe extends Compte {
	
	@OneToMany(mappedBy = "employe")
	private List<Conge> conge;
	
	@ManyToOne
	@JoinColumn(name = "id_s")
	protected Service service;
	protected Integer id_manager;


	public Employe() {
	}

	public Employe(String nom,String prenom,String password,String mail, Service service,List<Conge> conge) {
		super(nom, prenom, password, mail);
		this.conge = conge;
		this.service = service;
	}
	public Employe(String nom,String prenom,String password,String mail) {
		
		super(nom, prenom, password, mail);
	} 
	public Employe(String nom,String prenom,String password,String mail, List<Conge> conge) {
		
		super(nom, prenom, password, mail);
		this.conge=conge;
	}
	public Employe(String nom,String prenom,String password,String mail, Service service,Integer id_manager) {
		
		super(nom, prenom, password, mail);
		this.service=service;
		this.id_manager=id_manager;
	}
	
	
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public List<Conge> getConge() {
		return conge;
	}
	public void setConge(List<Conge> conge) {
		this.conge = conge;
	}
	
	
	public Integer getId_manager() {
		return id_manager;
	}

	public void setId_manager(Integer id_manager) {
		this.id_manager = id_manager;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", password="
				+ password + ", mail=" + mail + ", service=" + service + "]";
	} 
	

	
}
