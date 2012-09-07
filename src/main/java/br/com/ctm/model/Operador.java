package main.java.br.com.ctm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="operador", schema="ctm")
public class Operador extends Cliente{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOperador;

	public Integer getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(Integer idOperador) {
		this.idOperador = idOperador;
	}
	
}
