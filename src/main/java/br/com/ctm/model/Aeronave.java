package main.java.br.com.ctm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="aeronave", schema="ctm")
public class Aeronave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAeronave;
	@Column
	private Integer serial;
	@Column
	private Date dataDeFabricacao;
	@Column
	private String prefixo;
	@Column
	private String corPredominante;
	@OneToOne
	private Modelo modelo;
	@OneToOne
	private CategoriaAeronave categoriaAeronave;
	@OneToOne
	private Proprietario proprietario;
	@OneToOne
	private Operador operador;
	@OneToOne
	private RegulamentoBrasileiroDeHomologacaoAeronautica rbha;
	@Column
	private Date dataDeChegada;
	//Base Inicial De Operacao
	@OneToOne
	private Base base;
	@Column
	private Double tsn;
	@Column
	private Integer csn;
	// Data do livro eletronico, Base inicial do livro eletronico, TSN inicial
	// do livro eletronico, CSN inicial do livro eletronico.
	@OneToOne
	private LivroEletronico livroEletronico;
	@OneToOne
	private Frota frota;
	
	
	public Integer getIdAeronave() {
		return idAeronave;
	}
	public void setIdAeronave(Integer idAeronave) {
		this.idAeronave = idAeronave;
	}
	public Integer getSerial() {
		return serial;
	}
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}
	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getCorPredominante() {
		return corPredominante;
	}
	public void setCorPredominante(String corPredominante) {
		this.corPredominante = corPredominante;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public CategoriaAeronave getCategoriaAeronave() {
		return categoriaAeronave;
	}
	public void setCategoriaAeronave(CategoriaAeronave categoriaAeronave) {
		this.categoriaAeronave = categoriaAeronave;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	public RegulamentoBrasileiroDeHomologacaoAeronautica getRbha() {
		return rbha;
	}
	public void setRbha(RegulamentoBrasileiroDeHomologacaoAeronautica rbha) {
		this.rbha = rbha;
	}
	public Date getDataDeChegada() {
		return dataDeChegada;
	}
	public void setDataDeChegada(Date dataDeChegada) {
		this.dataDeChegada = dataDeChegada;
	}
	public Base getBase() {
		return base;
	}
	public void setBase(Base base) {
		this.base = base;
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
	public LivroEletronico getLivroEletronico() {
		return livroEletronico;
	}
	public void setLivroEletronico(LivroEletronico livroEletronico) {
		this.livroEletronico = livroEletronico;
	}
	public Frota getFrota() {
		return frota;
	}
	public void setFrota(Frota frota) {
		this.frota = frota;
	}
}
