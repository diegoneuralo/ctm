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
import main.java.br.com.ctm.model.Frota;

@Stateless
@LocalBean
public class FrotaRepository implements IDao<Frota> {
	@PersistenceContext(name="ctm")
	private EntityManager manager;

	@Override
	public void adicionar(Frota object) {
		this.manager.persist(object);
	}

	@Override
	public void editar(Frota object) {
		this.manager.merge(object);
	}

	@Override
	public void deletar(Frota object) {
		this.manager.remove(object);
	}

	@Override
	public void deletarPorId(Integer id) {
		Frota frota = this.manager.find(Frota.class, id);
		this.manager.remove(frota);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Frota> procurarEmTudo(Frota object) {
		TypedQuery<Frota> query = this.manager.createQuery("select x from frota x", Frota.class);
		return query.getResultList();
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Frota procurarById(Frota object) {
		return this.manager.find(Frota.class, object.getId());
	}

	@Override
	public List<Frota> listarTudo() {
		TypedQuery<Frota> query = this.manager.createQuery(
				"select * from frota", Frota.class);
		return query.getResultList();
	}

	@Override
	public List<Frota> selectOneMenu() {
		TypedQuery<Frota> query = this.manager.createQuery("select x from frota", Frota.class);
		return query.getResultList();
	}

	@Override
	public List<Frota> filter(Frota object) {
		TypedQuery<Frota> query = this.manager.createQuery("select x from frota x", Frota.class);
		return query.getResultList();
	}

	@Override
	public Frota select(Frota object) {
		return this.manager.find(Frota.class, object);
	}

}
