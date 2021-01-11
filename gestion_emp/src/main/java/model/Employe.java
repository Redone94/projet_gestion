package model;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("employe")
public class Employe extends Compte {
	
	@OneToMany(mappedBy = "employe",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	
	private List<Conge> conge;

	public Employe() {
	}
	public Employe(String nom,String prenom,String mail,String password) {
		
		super(nom, prenom, password, mail);
	} 
	public Employe(String nom,String prenom,String mail,String password, List<Conge> conge) {
		
		super(nom, prenom, password, mail);
		this.conge=conge;
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
