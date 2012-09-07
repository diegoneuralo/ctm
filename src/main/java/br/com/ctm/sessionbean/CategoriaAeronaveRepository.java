package main.java.br.com.ctm.sessionbean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import main.java.br.com.ctm.dao.IDao;
import main.java.br.com.ctm.model.CategoriaAeronave;

@Stateless
@LocalBean
public class CategoriaAeronaveRepository implements IDao<CategoriaAeronave> {
	@PersistenceContext(name="ctm")
	private EntityManager manager;

	@Override
	public void adicionar(CategoriaAeronave object) {
		this.manager.persist(object);
	}

	@Override
	public void editar(CategoriaAeronave object) {
		this.manager.merge(object);
	}

	@Override
	public void deletar(CategoriaAeronave object) {
		this.manager.remove(object);
	}

	@Override
	public void deletarPorId(Integer id) {
		CategoriaAeronave categoriaAeronave = this.manager.find(CategoriaAeronave.class, id);
		this.manager.remove(categoriaAeronave);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<CategoriaAeronave> procurarEmTudo(CategoriaAeronave object) {
		TypedQuery<CategoriaAeronave> query = this.manager.createQuery("select x from CategoriaAeronave x where x.idCategoriaAeronave = :idCategoriaAeronave OR x.descricao like :descricao", CategoriaAeronave.class);
		query.setParameter("idCategoriaAeronave", object.getIdCategoriaAeronave());
		query.setParameter("descricao", "%"+object.getDescricao()+"%");
		return query.getResultList();
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public CategoriaAeronave procurarById(CategoriaAeronave object) {
		return this.manager.find(CategoriaAeronave.class, object.getIdCategoriaAeronave());
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<CategoriaAeronave> listarTudo() {
		TypedQuery<CategoriaAeronave> query = this.manager.createQuery("select x from CategoriaAeronave x", CategoriaAeronave.class);
		return query.getResultList();
	}

	@Override
	public List<CategoriaAeronave> selectOneMenu() {
		TypedQuery<CategoriaAeronave> query = this.manager.createQuery("select x from CategoriaAeronave x", CategoriaAeronave.class);
		return query.getResultList();
	}

	@Override
	public List<CategoriaAeronave> filter(CategoriaAeronave object) {
		TypedQuery<CategoriaAeronave> query = this.manager.createQuery("select x from CategoriaAeronave x", CategoriaAeronave.class);
		return query.getResultList();
	}

	@Override
	public CategoriaAeronave select(CategoriaAeronave object) {
		return this.manager.find(CategoriaAeronave.class, object);
	}

}
