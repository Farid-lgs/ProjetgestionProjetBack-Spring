package fr.formation.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="PROJETS")
public class Projet implements Serializable {
	
	public Projet() {
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROJETS_SEQ")
    @SequenceGenerator(sequenceName = "PROJETS_SEQ", allocationSize = 1, name = "PROJETS_SEQ")
	private long idprojet;

	private String client;

	private BigDecimal code;

	private String titre;

	private String type;
	
	@Temporal(TemporalType.DATE)
	private Date datedebut;
	@Temporal(TemporalType.DATE)
	private Date datefinestimee;
	@Temporal(TemporalType.DATE)
	private Date datefinreel;

	private String description;

	//bi-directional many-to-one association to Employe
	@OneToMany(mappedBy="projet", cascade = CascadeType.PERSIST )
	@JsonIgnore
	private List<Employe> employes;

	//bi-directional many-to-one association to Module
	@OneToMany(mappedBy="projet", cascade = CascadeType.PERSIST )
	@JsonIgnore
	private List<Module> modules;

	public Projet(long id) {
	}

	public long getIdprojet() {
		return this.idprojet;
	}

	public void setIdprojet(long idprojet) {
		this.idprojet = idprojet;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public BigDecimal getCode() {
		return this.code;
	}

	public void setCode(BigDecimal code) {
		this.code = code;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employe> getEmployes() {
		return this.employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public Employe addEmploye(Employe employe) {
		getEmployes().add(employe);
		employe.setProjet(this);

		return employe;
	}

	public Employe removeEmploye(Employe employe) {
		getEmployes().remove(employe);
		employe.setProjet(null);

		return employe;
	}

	public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Module addModule(Module module) {
		getModules().add(module);
		module.setProjet(this);

		return module;
	}

	public Module removeModule(Module module) {
		getModules().remove(module);
		module.setProjet(null);

		return module;
	}

}