package fr.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.domain.Employe;
import fr.formation.domain.Projet;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

	List<Employe> findByProjet(Projet id);
	
}
