package com.ensa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiant implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_etudiant;
	private int cne;
	private String cin;
	private String email;
	private String nom_etudiant;
	private String prenom_etudiant;
	private String username;
	private String password;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Etudiant(Long id_etudiant, int cne, String cin, String email, String nom_etudiant, String prenom_etudiant,
			String username, String password) {
		super();
		this.id_etudiant = id_etudiant;
		this.cne = cne;
		this.cin = cin;
		this.email = email;
		this.nom_etudiant = nom_etudiant;
		this.prenom_etudiant = prenom_etudiant;
		this.username = username;
		this.password = password;
	}


	
	public Etudiant(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Long getId_etudiant() {
		return id_etudiant;
	}
	public void setId_etudiant(Long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	public String getNom_etudiant() {
		return nom_etudiant;
	}
	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}
	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}
	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
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
	public int getCne() {
		return cne;
	}
	public void setCne(int cne) {
		this.cne = cne;
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
		
		return new User(this.username, this.password, Role.ETUDIANT);
	}
	
	
}
