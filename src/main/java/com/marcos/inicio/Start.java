package com.marcos.inicio;

import com.marcos.biblioteca.negocio.beans.AutorBean;
import com.marcos.biblioteca.negocio.beans.LibroBean;
import com.marcos.bibloteca.negocio.CreateAutor;
import com.marcos.bibloteca.negocio.CreateLibro;

public class Start {

	public static void main(String[] args) {


		
		
		AutorBean autor1 = new AutorBean();
		autor1.setNombre("Ken Follet");
		
		AutorBean autor2 = new AutorBean();
		autor2.setNombre("JK Rowling");
	
		
		LibroBean libro1 = new LibroBean();
		libro1.setEditorial("SM");
		libro1.setIsbn("34567M");
		libro1.setPaginas(182);
		libro1.setTitulo("Harry Potter I");
		

		LibroBean libro2 = new LibroBean();
		libro2.setEditorial("SM");
		libro2.setIsbn("3466567M");
		libro2.setPaginas(242);
		libro2.setTitulo("Harry Potter II");
		

		LibroBean libro3 = new LibroBean();
		libro3.setEditorial("Anaya");
		libro3.setIsbn("346sfes6567M");
		libro3.setPaginas(842);
		libro3.setTitulo("Los pilares de la tierra");

		
		
		autor2.addLibros(libro1);
		autor2.addLibros(libro2);
		autor1.addLibros(libro3);
		
		
		
		CreateAutor createAutor = new CreateAutor();
		createAutor.create(autor1);
		createAutor.create(autor2);		
		
		CreateLibro createLibro = new CreateLibro();
		createLibro.create(libro1);
		createLibro.create(libro2);
		createLibro.create(libro3);	
		
				
		
	}

}
