package com.ensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensa.entity.Professeur;
import com.ensa.repository.ProfesseurRepository;

public class ProfesseurServiceImpl implements ProfesseurService{
	
	@Autowired
    private ProfesseurRepository professeurRepository;
	@Override
	public List<Professeur> getProfesseurs() {
		// TODO Auto-generated method stub
		return professeurRepository.findAll();
	}

	@Override
	public Professeur getProfesseurById(Long id) {
		// TODO Auto-generated method stub
		return professeurRepository.getOne(id);
	}

	@Override
	public void addProfesseur(Professeur p) {
		// TODO Auto-generated method stub
		professeurRepository.save(p);
		
	}

	@Override
	public void updateProfesseur(Professeur p) {
		// TODO Auto-generated method stub
		professeurRepository.save(p);
		
	}

	@Override
	public void deleteProfesseur(long id) {
		// TODO Auto-generated method stub
		professeurRepository.deleteById(id);
		
	}

	

}
