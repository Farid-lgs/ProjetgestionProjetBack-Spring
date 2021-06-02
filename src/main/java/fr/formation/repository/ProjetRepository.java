package fr.formation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.domain.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

	List<Projet> findByDatedebutAndDatefinestimee(Date dateDebut, Date dateFin);

}
