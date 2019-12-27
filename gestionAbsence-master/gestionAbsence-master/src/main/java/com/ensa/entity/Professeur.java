package com.ensa.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Professeur implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_professeur;
	private String cin;
	private String email;
	private String nom_professeur;
	private String prenom_professeur;
	private String username;
	private String password;

	public Professeur() {
		// TODO Auto-generated constructor stub
	}

	

	public Professeur(Long id_professeur, String cin, String email, String nom_professeur, String prenom_professeur,
			String username, String password) {
		super();
		this.id_professeur = id_professeur;
		this.cin = cin;
		this.email = email;
		this.nom_professeur = nom_professeur;
		this.prenom_professeur = prenom_professeur;
		this.username = username;
		this.password = password;
	}



	public Professeur(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public Long getId_professeur() {
		return id_professeur;
	}

	public void setId_professeur(Long id_professeur) {
		this.id_professeur = id_professeur;
	}

	public String getNom_professeur() {
		return nom_professeur;
	}

	public void setNom_professeur(String nom_professeur) {
		this.nom_professeur = nom_professeur;
	}

	public String getPrenom_professeur() {
		return prenom_professeur;
	}

	public void setPrenom_professeur(String prenom_professeur) {
		this.prenom_professeur = prenom_professeur;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public User toUser() {
		
		return new User(this.username, this.password, Role.PROFESSEUR);
	}

	
}
