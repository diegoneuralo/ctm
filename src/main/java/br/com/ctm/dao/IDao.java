package main.java.br.com.ctm.dao;

import java.util.List;

public interface IDao<T> {
	public void adicionar(T object);
	public void editar(T object);
	public void deletar(T object);
	public void deletarPorId(Integer id);
	public List<T> procurarEmTudo(T object);
	public T procurarById(T object);
	public List<T> listarTudo();
	public List<T> selectOneMenu();
	public List<T> filter(T object);
	public T select(T object);
}
