package com.uca.capas.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(schema = "public", name = "importancia")
public class Importancia {
	
	@Id
	@GeneratedValue(generator="importancia_c_importancia_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "importancia_c_importancia_seq", sequenceName = "public.importancia_c_importancia_seq")
	@Column(name = "c_importancia")
	private Integer cImportancia;
	
	@Column(name = "s_importancia")
	private String sImportancia;
	
	@OneToMany(mappedBy="importancia",fetch= FetchType.EAGER,orphanRemoval=true,cascade=CascadeType.PERSIST)
	private List<Contribuyente> contribuyentes;

	
	
	public List<Contribuyente> getContribuyentes() {
		return contribuyentes;
	}

	public void setContribuyentes(List<Contribuyente> contribuyentes) {
		this.contribuyentes = contribuyentes;
	}

	public Integer getcImportancia() {
		return cImportancia;
	}

	public void setcImportancia(Integer cImportancia) {
		this.cImportancia = cImportancia;
	}

	public String getsImportancia() {
		return sImportancia;
	}

	public void setsImportancia(String sImportancia) {
		this.sImportancia = sImportancia;
	}
	
	

}
