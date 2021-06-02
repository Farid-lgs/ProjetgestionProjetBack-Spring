package fr.formation.service;

import java.util.List;

import fr.formation.domain.Employe;
import fr.formation.domain.Projet;

public interface EmployeService extends GlobalService<Employe> {

	List<Employe> findByProjet(Projet id);

}
