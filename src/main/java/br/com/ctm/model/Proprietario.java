package main.java.br.com.ctm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="proprietario", schema="ctm")
public class Proprietario extends Cliente{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProprietario;

	public Integer getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(Integer idProprietario) {
		this.idProprietario = idProprietario;
	}
}
