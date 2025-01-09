package com.maya.ehecatl.app.registro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

}
