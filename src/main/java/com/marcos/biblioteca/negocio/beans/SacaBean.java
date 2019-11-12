package com.marcos.biblioteca.negocio.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;
import java.util.ArrayList;



@Entity
@Table(name="saca")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class SacaBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idSaca;

	@Column
	private String fechaPrestamo;

	@Column
	private String fechaDevolucion;

	@ManyToOne
	private UsuarioBean usuario;
	
	@ManyToOne
	private EjemplarBean ejemplar;

	
	
	
	public long getIdSaca() {
		return idSaca;
	}

	public void setIdSaca(long idSaca) {
		this.idSaca = idSaca;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public EjemplarBean getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(EjemplarBean ejemplar) {
		this.ejemplar = ejemplar;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
}
