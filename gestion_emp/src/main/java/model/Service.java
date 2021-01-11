package model;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "service")
public class Service {
	@Id
	private Integer id;
	private String libelle;
	@OneToMany(mappedBy = "service",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Employe> employe;
	
	public Service() {
	}

	public Service(String libelle) {
		this.libelle = libelle;
	}
	
}
