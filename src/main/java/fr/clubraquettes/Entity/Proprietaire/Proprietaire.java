package fr.clubraquettes.Entity.Proprietaire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrateur")
public class Proprietaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="courriel_admin")
	private String courriel;
	
	@Column(name="mdp_admin")
	private String motDePasse;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom=prenom;
	}
	
	public void setCourriel(String courriel)
	{
		this.courriel=courriel;
	}
	
	public void setMotDePasse(String motDePasse)
	{
		this.motDePasse = motDePasse;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public String getCourriel()
	{
		return this.courriel;
	}
	
	public String getMotDePasse()
	{
		return this.motDePasse;
	}
}
