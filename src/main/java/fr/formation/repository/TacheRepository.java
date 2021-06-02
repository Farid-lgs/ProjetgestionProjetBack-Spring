package fr.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.domain.Module;
import fr.formation.domain.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long> {
	
	List<Tache> findByModule(Module module);

}