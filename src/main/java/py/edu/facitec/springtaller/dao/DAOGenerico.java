package py.edu.facitec.springtaller.dao;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class DAOGenerico<T> {
	
	private Class<T> entityClass;
	
	public DAOGenerico(Class<T> entityClass) {
		this.entityClass=entityClass;
	}
	
	protected abstract EntityManager getEntityManager();
		//metodo para registrar
							///objeto x
		public void insertar(T entity){
				//convierte el objeto recibido en sentencia sql
			getEntityManager().persist(entity);
		}
	
		public void actualizar(T entity){
			getEntityManager().merge(entity);
		}
		
		public T buscar(Object id){
			return getEntityManager().find(entityClass, id);
		}
		
		public void guardar(T entity,Object id){
			if(id==null||id==""){
				insertar(entity);
			}else{
				if (buscar(id)==null) {
					insertar(entity);
				}else {
					actualizar(entity);
				}
			}
			
		}
		
		public void eliminar(T entity){
			getEntityManager().remove(getEntityManager().contains(entity)?
								entity:getEntityManager().merge(entity));
		}
		

		public List<T> buscarTodos(){
			return getEntityManager().createQuery("from "+entityClass.getSimpleName(),entityClass).getResultList();
		}
		
		
}