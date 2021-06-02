package fr.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.domain.Module;
import fr.formation.domain.Projet;
import fr.formation.repository.ModuleRepository;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	ModuleRepository moduleRepository;
	
	@Override
	public void add(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public void delete(Module module) {
		moduleRepository.delete(module);
	}

	@Override
	public void update(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public List<Module> findAll() {
		return moduleRepository.findAll();
	}

	@Override
	public Module findById(long id) {
		return moduleRepository.getOne(id);
	}
	
	@Override
	public List<Module> findByProjet(Projet id) {
		return moduleRepository.findByProjet(id);
	}
}