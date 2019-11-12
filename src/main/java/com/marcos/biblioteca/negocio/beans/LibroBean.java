package com.marcos.biblioteca.negocio.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="libro")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

//@NamedQueries({
//    @NamedQuery(name="Libro.findByEditorial",query="SELECT * FROM libro l WHERE l.editorial = :editorial")
//})
public class LibroBean {

	

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idLibro;

	@Column
	private String titulo;

	@Column
	private String isbn;
	
		
	@Column
	private String editorial;
	
		
	@Column
	private Integer paginas;


	
	@ManyToMany
	private List<AutorBean> autores = new ArrayList<AutorBean>();
		
	
	
	
	
	
	public List<AutorBean> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorBean> autores) {
		this.autores = autores;
	}

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	
	
	
	
	
	
	
	public void add(AutorBean autorBean) {
		if(!autores.contains(autorBean)) {
			
			autores.add(autorBean);
			autorBean.addLibros(this);
		}
	}
	
		
			
	
}
