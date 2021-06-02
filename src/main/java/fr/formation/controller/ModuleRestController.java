package fr.formation.controller;

import fr.formation.domain.Module;
import fr.formation.domain.Projet;
import fr.formation.service.ModuleService;

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

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/module")
public class ModuleRestController {
	
	@Autowired
	ModuleService moduleService;
	
	@GetMapping("/list")
	public List<Module> findAll() {
		return moduleService.findAll();
	}
	
	@GetMapping("/projet/{id}")
	public List<Module> findByProjetId(@PathVariable long id) {
		return moduleService.findByProjet(new Projet(id));
	}

	@PostMapping("/add")
	public void add(@RequestBody Module module) {
		moduleService.add(module);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable long id, @RequestBody Module module) {
		module.setIdmodule(id);
		moduleService.update(module);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		Module module = moduleService.findById(id);
		moduleService.delete(module);
	}
}
