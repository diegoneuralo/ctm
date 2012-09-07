package main.java.br.com.ctm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria_aeronave", schema="ctm")
public class CategoriaAeronave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategoriaAeronave;
	@Column
	private String descricao;
	
	@Column
	private Boolean status;
	
	
	public Integer getIdCategoriaAeronave() {
		return idCategoriaAeronave;
	}
	public void setIdCategoriaAeronave(Integer idCategoriaAeronave) {
		this.idCategoriaAeronave = idCategoriaAeronave;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}
