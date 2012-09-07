package main.java.br.com.ctm.control;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import main.java.br.com.ctm.model.CategoriaAeronave;
import main.java.br.com.ctm.sessionbean.CategoriaAeronaveRepository;

@Named
@RequestScoped
public class CategoriaAeronaveBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private CategoriaAeronaveRepository categoriaAeronaveRepository;

	private CategoriaAeronave categoriaAeronave = new CategoriaAeronave();
	private CategoriaAeronave categoriaSelecionada = new CategoriaAeronave();

	private List<CategoriaAeronave> categorias;
	
	public CategoriaAeronaveBean(){
		
	}

	public void save() {
		if (this.categoriaAeronaveRepository.procurarById(categoriaAeronave) == null) {
			this.categoriaAeronaveRepository.adicionar(this.categoriaAeronave);
		} else {
			this.categoriaAeronaveRepository.editar(this.categoriaAeronave);
		}
		this.categoriaAeronave = new CategoriaAeronave();
		this.categoriaAeronave = null;
	}

	public void delete(Integer id) {
		this.categoriaAeronaveRepository.deletarPorId(id);
		this.categoriaAeronave = null;
	}
	
	public void deletar() {
		this.categoriaAeronaveRepository.deletarPorId(this.categoriaSelecionada.getIdCategoriaAeronave());
		this.categoriaSelecionada = null;
	}
	
	public void prepararEdicao(){
		this.categoriaAeronave = this.categoriaSelecionada;
	}

	public void prepareEdit() {
		this.categoriaAeronave = this.categoriaAeronaveRepository.procurarById(categoriaSelecionada);
	}
	
	public void filtrar(){
		this.categorias = this.categoriaAeronaveRepository.procurarEmTudo(this.categoriaAeronave);
		this.setCategorias(this.categorias);
	}

	public List<CategoriaAeronave> getCategorias() {
		if (this.categorias == null) {
			this.categorias = this.categoriaAeronaveRepository.listarTudo();
		}
		return categorias;
	}

	public void setCategorias(List<CategoriaAeronave> categorias) {
		this.categorias = categorias;
	}

	public CategoriaAeronave getCategoriaAeronave() {
		return categoriaAeronave;
	}

	public void setCategoriaAeronave(CategoriaAeronave categoriaAeronave) {
		this.categoriaAeronave = categoriaAeronave;
	}

	public CategoriaAeronave getCategoriaSelecionada() {
		return categoriaSelecionada;
	}

	public void setCategoriaSelecionada(CategoriaAeronave categoriaSelecionada) {
		this.categoriaSelecionada = categoriaSelecionada;
	}
	
	

}