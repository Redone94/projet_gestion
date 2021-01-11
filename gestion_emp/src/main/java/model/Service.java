package model;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "service")
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String libelle;
	@OneToMany(mappedBy = "service")
	private List<Employe> employe;
	
	public Service() {
	}

	public Service(String libelle) {
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Employe> getEmploye() {
		return employe;
	}

	public void setEmploye(List<Employe> employe) {
		this.employe = employe;
	}
	
}
