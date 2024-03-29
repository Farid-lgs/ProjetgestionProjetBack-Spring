package fr.formation.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.domain.Projet;
import fr.formation.repository.ProjetRepository;

@Service
@Transactional
public class ProjetServiceImpl implements ProjetService {

	@Autowired
	ProjetRepository projetRepository;
	
	@Override
	public void add(Projet projet) {
		projetRepository.save(projet);
	}

	@Override
	public void delete(Projet projet) {
		projetRepository.delete(projet);
	}

	@Override
	public void update(Projet projet) {
		projetRepository.save(projet);
	}

	@Override
	public List<Projet> findAll() {
		return projetRepository.findAll();
	}

	@Override
	public Projet findById(long id) {
		return projetRepository.getOne(id);
	}

	@Override
	public List<Projet> findByDatedebutAndDatefinestimee(Date dateDebut, Date dateFin) {
		System.out.println("deb " + dateDebut + " " + " fin " + dateFin);
		return projetRepository.findByDatedebutAndDatefinestimee(dateDebut, dateFin);
	}

}