package main.java.br.com.ctm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="regulamento", schema="ctm")
public abstract class Regulamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer idRegulamento;
}
