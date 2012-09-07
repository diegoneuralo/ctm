package main.java.br.com.ctm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moeda", schema="ctm")
public class Moeda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMoeda;

	public Integer getIdMoeda() {
		return idMoeda;
	}

	public void setIdMoeda(Integer idMoeda) {
		this.idMoeda = idMoeda;
	}
}
