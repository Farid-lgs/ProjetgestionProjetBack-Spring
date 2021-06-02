package fr.formation.service;

import java.util.List;

import fr.formation.domain.Module;
import fr.formation.domain.Tache;

public interface TacheService extends GlobalService<Tache> {

	List<Tache> findByModule(Module module);

}
