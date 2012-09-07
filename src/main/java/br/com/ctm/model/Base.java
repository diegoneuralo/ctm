package main.java.br.com.ctm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="base", schema="ctm")
public class Base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBase;

	public Integer getIdBase() {
		return idBase;
	}

	public void setIdBase(Integer idBase) {
		this.idBase = idBase;
	}
}
