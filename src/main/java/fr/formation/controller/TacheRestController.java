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

import fr.formation.domain.Module;
import fr.formation.domain.Tache;
import fr.formation.service.TacheService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/tache")
public class TacheRestController {
	
	@Autowired
	TacheService tacheService;
	
	@GetMapping("/list")
	public List<Tache> findAll() {
		return tacheService.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Tache findById(@PathVariable long id) {
		return tacheService.findById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Tache tache) {
		tacheService.add(tache);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable long id, @RequestBody Tache tache) {
		tache.setIdtache(id);
		tacheService.update(tache);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		Tache tache = tacheService.findById(id);
		tacheService.delete(tache);
	}
	
	@GetMapping("/module/{id}")
	public List<Tache> readByModuleId(@PathVariable long id) {
		return tacheService.findByModule(new Module(id));
	}
}
