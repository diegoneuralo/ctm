package main.java.br.com.ctm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="livro_eletronico", schema="ctm")
public class LivroEletronico extends Livro{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idLivroEletronico;
	@OneToOne
	private Base base;
	@Column
	private Date data;
	@Column
	private Double tsn;
	@Column
	private Integer csn;
	
	public Integer getIdLivroEletronico() {
		return idLivroEletronico;
	}
	public void setIdLivroEletronico(Integer idLivroEletronico) {
		this.idLivroEletronico = idLivroEletronico;
	}
	public Base getBase() {
		return base;
	}
	public void setBase(Base base) {
		this.base = base;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getTsn() {
		return tsn;
	}
	public void setTsn(Double tsn) {
		this.tsn = tsn;
	}
	public Integer getCsn() {
		return csn;
	}
	public void setCsn(Integer csn) {
		this.csn = csn;
	}
	
	
}
