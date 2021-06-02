package fr.formation.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ROLES" database table.
 * 
 */
@Entity
@Table(name="ROLES")
public class Role implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ROLE_SEQ")
    @SequenceGenerator(name = "ROLE_SEQ", sequenceName = "ROLE_SEQ", allocationSize = 1)
	private long idrole;
	
	@Enumerated(EnumType.STRING)
	private ERole name;

	public Role() {
	}

	public long getIdrole() {
		return this.idrole;
	}

	public void setIdrole(long idrole) {
		this.idrole = idrole;
	}

	public ERole getName() {
		return this.name;
	}

	public void setName(ERole libelle) {
		this.name = libelle;
	}

}