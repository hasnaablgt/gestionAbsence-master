package com.ensa.service;

import java.util.List;

import com.ensa.entity.Professeur;

public interface ProfesseurService {
	public List<Professeur> getProfesseurs();
	public Professeur getProfesseurById(Long id);
	public Professeur addProfesseur(Professeur p);
	public Professeur updateProfesseur(Professeur p);
	public void deleteProfesseur(long id);

}
