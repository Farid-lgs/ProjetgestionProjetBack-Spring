package fr.formation.service;

import java.util.List;

import fr.formation.domain.Module;
import fr.formation.domain.Projet;

public interface ModuleService extends GlobalService<fr.formation.domain.Module> {

	List<Module> findByProjet(Projet id);


}
