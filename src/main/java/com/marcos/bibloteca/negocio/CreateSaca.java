package com.marcos.bibloteca.negocio;

import javax.persistence.EntityManager;

import com.marcos.biblioteca.negocio.beans.AutorBean;
import com.marcos.biblioteca.negocio.beans.SacaBean;
import com.marcos.bibloteca.util.ConnectionEntityManagerFactory;



/**
 * Clase que inserta autores en la base de datos
 * @author marcos
 *
 */
public class CreateSaca {

	

	public void create(SacaBean extraccion) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(extraccion);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
