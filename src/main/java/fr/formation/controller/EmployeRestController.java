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

import fr.formation.domain.Employe;
import fr.formation.domain.Projet;
import fr.formation.service.DepartementService;
import fr.formation.service.EmployeService;
import fr.formation.service.ProjetService;
import fr.formation.service.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/employe")
public class EmployeRestController {

	@Autowired
	EmployeService employeService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	ProjetService projetsService;
	
	@Autowired
	DepartementService departementsService;
	
	@GetMapping("/list")
	public List<Employe> findAll() {
		return employeService.findAll();
	}
	@GetMapping("/list/{id}")
	public Employe findById(@PathVariable long id) {
		return employeService.findById(id);
	}
	
	@GetMapping("/projet/{id}")
	public List<Employe> listByProjetId(@PathVariable long id) {
		return employeService.findByProjet(new Projet(id));
		
	}

	@PostMapping("/add")
	public void add(@RequestBody Employe employe) {
		employeService.add(employe);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable long id, @RequestBody Employe employe) {
		employe.setIdemploye(id);
		employeService.update(employe);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		Employe employe = employeService.findById(id);
		employeService.delete(employe);
	}
}
