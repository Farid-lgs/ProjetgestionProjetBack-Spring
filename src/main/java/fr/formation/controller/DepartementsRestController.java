package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.domain.Departement;
import fr.formation.service.DepartementService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/departement")
public class DepartementsRestController {

	@Autowired
	DepartementService departementsService;
	
	@GetMapping("/list/{id}")
	public Departement findById(@PathVariable long id) {
		return departementsService.findById(id);
	}
	
	@GetMapping("/list")
	public List<Departement> findAll() {
		return departementsService.findAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody Departement departement) {
		departementsService.add(departement);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable long id, @RequestBody Departement departement) {
		Departement depart = departementsService.findById(id);
		depart.setLibelle(departement.getLibelle());
		departementsService.update(depart);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		Departement departement = departementsService.findById(id);
		departementsService.delete(departement);
	}
}