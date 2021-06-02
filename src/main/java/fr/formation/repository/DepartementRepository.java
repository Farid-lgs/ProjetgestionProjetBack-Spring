package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.domain.Departement;


public interface DepartementRepository extends JpaRepository<Departement, Long> {

	Iterable<Departement> findByLibelle(String libelle);

}
