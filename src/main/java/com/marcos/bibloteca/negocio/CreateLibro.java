package com.marcos.bibloteca.negocio;

import javax.persistence.EntityManager;

import com.marcos.biblioteca.negocio.beans.LibroBean;
import com.marcos.bibloteca.util.ConnectionEntityManagerFactory;



/**
 * Clase que inserta autores en la base de datos
 * @author marcos
 *
 */
public class CreateLibro {

	

	public void create(LibroBean libro) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(libro);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
