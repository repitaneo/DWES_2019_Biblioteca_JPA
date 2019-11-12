package com.marcos.biblioteca.negocio.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.ArrayList;



@Entity
@Table(name="autor")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class AutorBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idAutor;

	@Column
	private String nombre;

	
	@ManyToMany(mappedBy="autores")
	private List<LibroBean> libros = new ArrayList<LibroBean>();
	
	
	
	
	
	
	
	public void addLibros(LibroBean libro) {
		
		if(!libros.contains(libro)) {
			
			libros.add(libro);
			libro.add(this);
		}
	}
	
	
	
	
	
	public long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
