package fr.formation.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the TACHES database table.
 * 
 */
@Entity
@Table(name="TACHES")
public class Tache implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "TACHE_SEQ")
    @SequenceGenerator(name = "TACHE_SEQ", sequenceName = "TACHE_SEQ", allocationSize = 1)
	private long idtache;

	private Date datedebut;

	private Date datefinestimee;

	private Date datefinreel;

	private String libelle;

	//bi-directional many-to-one association to Module
	@ManyToOne
	@JoinColumn(name="IDMODULE")
	@JsonIgnore
	private Module module;

	public Tache() {
	}

	public long getIdtache() {
		return this.idtache;
	}

	public void setIdtache(long idtache) {
		this.idtache = idtache;
	}

	public Date getDatedebut() {
		return this.datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefinestimee() {
		return this.datefinestimee;
	}

	public void setDatefinestimee(Date datefinestimee) {
		this.datefinestimee = datefinestimee;
	}

	public Date getDatefinreel() {
		return this.datefinreel;
	}

	public void setDatefinreel(Date datefinreel) {
		this.datefinreel = datefinreel;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}