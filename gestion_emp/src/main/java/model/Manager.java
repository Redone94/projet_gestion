package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("manager")
public class Manager extends Compte{
	public Manager() {}
	public Manager(String nom, String prenom, String password, String mail) {
		super(nom,prenom,password,mail);
	}
	

}
