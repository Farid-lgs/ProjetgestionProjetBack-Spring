package fr.formation.service;

import java.util.Date;
import java.util.List;

import fr.formation.domain.Projet;

public interface ProjetService extends GlobalService<Projet> {

	List<Projet> findByDatedebutAndDatefinestimee(Date dDebut, Date dFin);

}
