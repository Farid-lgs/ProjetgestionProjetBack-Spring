package fr.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.domain.Module;
import fr.formation.domain.Tache;
import fr.formation.repository.TacheRepository;

@Service
@Transactional
public class TacheServiceImpl implements TacheService {

	@Autowired
	TacheRepository tacheRepository;
	
	@Override
	public void add(Tache tache) {
		tacheRepository.save(tache);
	}

	@Override
	public void delete(Tache tache) {
		tacheRepository.delete(tache);
	}

	@Override
	public void update(Tache tache) {
		tacheRepository.save(tache);
	}

	@Override
	public List<Tache> findAll() {
		return tacheRepository.findAll();
	}

	@Override
	public Tache findById(long id) {
		return tacheRepository.getOne(id);
	}

	@Override
	public List<Tache> findByModule(Module module) {
		return tacheRepository.findByModule(module);
	}

}