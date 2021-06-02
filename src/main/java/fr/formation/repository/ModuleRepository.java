package fr.formation.repository;

import fr.formation.domain.Module;
import fr.formation.domain.Projet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Long> {

	List<Module> findByProjet(Projet id);

}
