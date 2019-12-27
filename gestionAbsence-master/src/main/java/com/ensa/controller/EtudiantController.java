package com.ensa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ensa.entity.Etudiant;

import com.ensa.entity.User;
import com.ensa.service.EtudiantService;
import com.ensa.service.UserService;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {
	
	@Autowired
	private EtudiantService etudiantService;
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	@GetMapping
	public List<Etudiant> getEtudiants() {
		return etudiantService.getEtudiants();
	}
	
	@GetMapping
	public Etudiant getEtudiantById(@PathVariable("id") Long id) {
		Etudiant e = etudiantService.getEtudiantById(id);
		return e;
	}
	
	@PostMapping
	public Etudiant addEtudiant(@RequestBody Etudiant e) {
		e.setPassword(passwordEncoder.encode(e.getPassword()));
		User u = e.toUser();
		userService.addUser(u);
		return etudiantService.addEtudiant(e);
	}
	
	@PutMapping
	public Etudiant updateEtudiant(@RequestBody Etudiant e) {
		e.setPassword(passwordEncoder.encode(e.getPassword()));
		User u = e.toUser();
		userService.updateUser(u);
		return etudiantService.updateEtudiant(e);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProfesseur(@PathVariable Long id) {
		Etudiant e = etudiantService.getEtudiantById(id);
		User u = userService.getUserByUsername(e.getUsername());
		userService.deleteUser(u.getId());
		etudiantService.deleteEtudiant(id);
	}

	
}
