package model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Conge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private TypeC typec;
	
	@Column(name = "Date_demande",columnDefinition = "DATE")
	private LocalDate demande=LocalDate.now();
	
	@Column(name = "Date_début",columnDefinition = "DATE")
	private LocalDate debut;
	
	@Column(name = "Date_fin",columnDefinition = "DATE")
	private LocalDate fin;
	
	@Column(name = "Nbr_jours")
	private double nbr_jours;
	
	private String motif;
	private String statut;
	private String commentaire;
	@ManyToOne
	private Employe employe;
	
	
	
	
	
	public Conge() {
	}


	public Conge(TypeC typec, LocalDate debut, LocalDate fin, String motif) {
		this.typec = typec;
		this.debut = debut;
		this.fin = fin;
		this.motif = motif;
	}


	public Conge(TypeC typec, LocalDate debut, LocalDate fin, String motif, Employe employe) {
		this.typec = typec;
		this.debut = debut;
		this.fin = fin;
		this.motif = motif;
		this.employe = employe;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TypeC getTypec() {
		return typec;
	}
	public void setTypec(TypeC typec) {
		this.typec = typec;
	}
	public LocalDate getDemande() {
		return demande;
	}
	public void setDemande(LocalDate demande) {
		this.demande = demande;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	public double getNbr_jours() {
		return nbr_jours;
	}
	public void setNbr_jours(double nbr_jours) {
		this.nbr_jours = nbr_jours;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	@Override
	public String toString() {
		return "Conge [id=" + id + ", typec=" + typec + ", demande=" + demande + ", debut=" + debut + ", fin=" + fin
				+ ", nbr_jours=" + nbr_jours + ", motif=" + motif + ", statut=" + statut + ", commentaire="
				+ commentaire + ", employe=" + employe + "]";
	}



	
	
}
