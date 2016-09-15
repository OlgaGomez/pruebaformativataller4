package py.edu.facitec.springtaller.dao;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Vendedor;

@Repository
public class VendedorDAO extends DAOGenerico<Vendedor> {
	
	@PersistenceContext
	private EntityManager manager;
	
	public VendedorDAO() {
		super(Vendedor.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return manager;
	}
	
	public void save(Vendedor vendedor) {
		manager.persist(vendedor);
		
	}
	
	
}
