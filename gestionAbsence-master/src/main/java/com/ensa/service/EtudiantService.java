package com.ensa.service;

import java.util.List;

import com.ensa.entity.Etudiant;

public interface EtudiantService {


	public List<Etudiant> getEtudiants();
	public Etudiant getEtudiantById(Long id);
	public Etudiant addEtudiant(Etudiant e);
	public Etudiant updateEtudiant(Etudiant e);
	public void deleteEtudiant(long id);
}
