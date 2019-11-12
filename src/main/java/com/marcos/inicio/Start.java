package com.marcos.inicio;

import com.marcos.biblioteca.negocio.beans.AutorBean;
import com.marcos.biblioteca.negocio.beans.EjemplarBean;
import com.marcos.biblioteca.negocio.beans.LibroBean;
import com.marcos.biblioteca.negocio.beans.SacaBean;
import com.marcos.biblioteca.negocio.beans.UsuarioBean;
import com.marcos.bibloteca.negocio.CreateAutor;
import com.marcos.bibloteca.negocio.CreateEjemplar;
import com.marcos.bibloteca.negocio.CreateLibro;
import com.marcos.bibloteca.negocio.CreateSaca;
import com.marcos.bibloteca.negocio.CreateUsuario;

public class Start {

	public static void main(String[] args) {


		
		
		AutorBean kenFollet = new AutorBean();
		kenFollet.setNombre("Ken Follet");
		
		AutorBean jkRowling = new AutorBean();
		jkRowling.setNombre("JK Rowling");
	
		
		LibroBean harryPotterI = new LibroBean();
		harryPotterI.setEditorial("SM");
		harryPotterI.setIsbn("34567M");
		harryPotterI.setPaginas(182);
		harryPotterI.setTitulo("Harry Potter I");
		

		LibroBean harryPotterII = new LibroBean();
		harryPotterII.setEditorial("SM");
		harryPotterII.setIsbn("3466567M");
		harryPotterII.setPaginas(242);
		harryPotterII.setTitulo("Harry Potter II");
		

		LibroBean pilares = new LibroBean();
		pilares.setEditorial("Anaya");
		pilares.setIsbn("346sfes6567M");
		pilares.setPaginas(842);
		pilares.setTitulo("Los pilares de la tierra");

		
		
		jkRowling.addLibros(harryPotterI);
		jkRowling.addLibros(harryPotterII);
		kenFollet.addLibros(pilares);
		
		
		
		CreateAutor createAutor = new CreateAutor();
		createAutor.create(kenFollet);
		createAutor.create(jkRowling);		
		
		CreateLibro createLibro = new CreateLibro();
		createLibro.create(harryPotterI);
		createLibro.create(harryPotterII);
		createLibro.create(pilares);	
		
			
		
		
		
		
		
		UsuarioBean marcos = new UsuarioBean();
		marcos.setNombre("Marcos");
		marcos.setDireccion("Oviedo");
		marcos.setTelefono("666777888");
		
		UsuarioBean maria = new UsuarioBean();
		maria.setNombre("Maria");
		maria.setDireccion("Gijon");
		maria.setTelefono("444555666");
		
		CreateUsuario createUsuario = new CreateUsuario();
		createUsuario.create(marcos);
		createUsuario.create(maria);
		
		
		
		
		
		EjemplarBean ejemplarHarryPotterI = new EjemplarBean();
		ejemplarHarryPotterI.setLocalizacion("5D6H");
		
		EjemplarBean ejemplarHarryPotterII = new EjemplarBean();
		ejemplarHarryPotterII.setLocalizacion("7H9B");
		
		CreateEjemplar createEjemplar = new CreateEjemplar();
		createEjemplar.create(ejemplarHarryPotterI);
		createEjemplar.create(ejemplarHarryPotterII);
		
		
		
		
		SacaBean extraccion1 = new SacaBean();
		extraccion1.setEjemplar(ejemplarHarryPotterI);
		extraccion1.setUsuario(marcos);
		extraccion1.setFechaPrestamo("enero");
		extraccion1.setFechaDevolucion("febrero");
		
		SacaBean extraccion2 = new SacaBean();
		extraccion2.setEjemplar(ejemplarHarryPotterI);
		extraccion2.setUsuario(maria);
		extraccion2.setFechaPrestamo("enero");
		extraccion2.setFechaDevolucion("febrero");

		SacaBean extraccion3 = new SacaBean();
		extraccion3.setEjemplar(ejemplarHarryPotterII);
		extraccion3.setUsuario(marcos);
		extraccion3.setFechaPrestamo("enero");
		extraccion3.setFechaDevolucion("febrero");
		
		CreateSaca createSaca = new CreateSaca();
		createSaca.create(extraccion1);
		createSaca.create(extraccion2);
		createSaca.create(extraccion3);
	}

}
