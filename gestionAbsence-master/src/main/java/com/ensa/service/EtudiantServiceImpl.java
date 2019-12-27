package com.ensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entity.Etudiant;
import com.ensa.repository.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService{

	@Autowired
	private EtudiantRepository etudiantRepository;
	@Override
	public List<Etudiant> getEtudiants() {
		// TODO Auto-generated method stub
		return etudiantRepository.findAll();
	}

	@Override
	public void addEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		etudiantRepository.save(e);
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		etudiantRepository.save(e);
	}

	@Override
	public void deleteEtudiant(long id) {
		// TODO Auto-generated method stub
		etudiantRepository.deleteById(id);
	}

	@Override
	public Etudiant getEtudiantById(Long id) {
		// TODO Auto-generated method stub
		return etudiantRepository.getOne(id);
	}

}
