package fr.formation.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.domain.Departement;
import fr.formation.repository.DepartementRepository;

@Service
@Transactional
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	DepartementRepository departementsRepository;
	
	@Override
	public void add(Departement departement) {
		departementsRepository.save(departement);
	}

	@Override
	public void delete(Departement departement) {
		departementsRepository.delete(departement);
	}

	@Override
	public void update(Departement departement) {
		departementsRepository.save(departement);
	}

	@Override
	public List<Departement> findAll() {
		return departementsRepository.findAll();
	}

	@Override
	public Departement findById(long id) {
		return departementsRepository.findById(id).get();
	}

}