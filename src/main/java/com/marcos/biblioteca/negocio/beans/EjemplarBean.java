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
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="ejemplar")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EjemplarBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idEjemplar;

	@Column
	private String localizacion;

	
	
	@OneToMany(mappedBy="ejemplar")
	private List<SacaBean> extracciones = new ArrayList<SacaBean>();
	
		
	
	public void addUsuario(SacaBean extraccion) {
		
		if(!extracciones.contains(extraccion)) {
			
			extracciones.add(extraccion);
			extraccion.setEjemplar(this);
		}
	}
	
	
	
	
	public long getIdEjemplar() {
		return idEjemplar;
	}

	public void setIdEjemplar(long idEjemplar) {
		this.idEjemplar = idEjemplar;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	
	
	
	
	

}
