package fr.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.domain.Employe;
import fr.formation.domain.Projet;
import fr.formation.repository.EmployeRepository;


@Service
@Transactional
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public void add(Employe employe) {
		employeRepository.save(employe);
	}

	@Override
	public void delete(Employe employe) {
		employeRepository.delete(employe);
	}

	@Override
	public void update(Employe employe) {
		employeRepository.save(employe);
	}

	@Override
	public List<Employe> findAll() {
		return employeRepository.findAll();
	}

	@Override
	public Employe findById(long id) {
		return employeRepository.findById(id).get();
	}
	@Override
	public List<Employe> findByProjet(Projet id) {
		return employeRepository.findByProjet(id);
	}

}