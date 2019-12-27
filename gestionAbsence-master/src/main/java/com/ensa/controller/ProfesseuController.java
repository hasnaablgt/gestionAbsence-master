package com.ensa.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ensa.entity.Professeur;
import com.ensa.entity.User;
import com.ensa.service.ProfesseurService;
import com.ensa.service.UserService;

@RestController
public class ProfesseuController {

	@Autowired
	ProfesseurService professeurService;
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping
	public List<Professeur> getProfesseurs() {
		return professeurService.getProfesseurs();
	}
	
	@GetMapping
	public Professeur getProfesseurById(@PathVariable("id") Long id) {
		Professeur p = professeurService.getProfesseurById(id);
		return p;
	}
	
	@PostMapping
	public Professeur addProfesseur(@RequestBody Professeur p) {
		p.setPassword(passwordEncoder.encode(p.getPassword()));
		User u = p.toUser();
		userService.addUser(u);
		return professeurService.addProfesseur(p);
	}
	
	@PutMapping
	public Professeur updateProfesseur(@RequestBody Professeur p) {
		p.setPassword(passwordEncoder.encode(p.getPassword()));
		User u = p.toUser();
		userService.updateUser(u);
		return professeurService.updateProfesseur(p);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProfesseur(@PathVariable Long id) {
		Professeur p = professeurService.getProfesseurById(id);
		User u = userService.getUserByUsername(p.getUsername());
		userService.deleteUser(u.getId());
		professeurService.deleteProfesseur(id);
	}

}
