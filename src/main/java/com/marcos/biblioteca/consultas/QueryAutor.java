package com.marcos.biblioteca.consultas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.marcos.biblioteca.negocio.beans.LibroBean;
import com.marcos.bibloteca.util.ConnectionEntityManagerFactory;



/**
 * Clase que inserta autores en la base de datos
 * @author marcos
 *
 */
public class QueryAutor {

	

	public List<LibroBean> getLibroByEditorial(String editorial) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		
		TypedQuery<LibroBean> consultaLibrosEditorial = 
				 entityManager.createNamedQuery("Libro.findByEditorial", LibroBean.class);
				 
		consultaLibrosEditorial.setParameter("editorial", "SM");
		List<LibroBean> lista = consultaLibrosEditorial.getResultList();	
			 
		entityManager.close();
		 
		return lista;
	}

}
