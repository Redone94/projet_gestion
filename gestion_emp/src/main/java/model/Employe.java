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

	public Employe() {
	}
	public Employe(String nom,String prenom,String mail,String password) {
		
		super(nom, prenom, password, mail);
	} 
	public Employe(String nom,String prenom,String mail,String password, List<Conge> conge) {
		
		super(nom, prenom, password, mail);
		this.conge=conge;
	}
	public Employe(String nom,String prenom,String mail,String password, Service service) {
		
		super(nom, prenom, password, mail);
		this.service=service;
	}
	
	
	public List<Conge> getConge() {
		return conge;
	}
	public void setConge(List<Conge> conge) {
		this.conge = conge;
	}
	@Override
	public String toString() {
		return "Employe [conge=" + conge + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", password="
				+ password + ", mail=" + mail + ", service=" + service + "]";
	} 
	

	
}
