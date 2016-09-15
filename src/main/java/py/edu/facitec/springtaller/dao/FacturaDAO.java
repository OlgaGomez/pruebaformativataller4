package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Factura;

@Repository
public class FacturaDAO extends DAOGenerico<Factura>{

	@PersistenceContext
	private EntityManager em;
	
	
	public FacturaDAO() {
		super(Factura.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public void save(Factura factura) {
		em.persist(factura);
	}
	
}
