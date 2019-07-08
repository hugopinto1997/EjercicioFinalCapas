package com.uca.capas.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(schema = "public", name = "contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator="contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "contribuyente_c_contribuyente_seq", sequenceName = "public.contribuyente_c_contribuyente_seq")
	@Column(name = "c_contribuyente")
	private Integer cContribuyente;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="c_importancia")
	private Importancia importancia;
	
	@Column(name = "s_nombre")
	private String sNombre;
	
	@Column(name = "s_apellido")
	private String sApellido;
	
	@Column(name = "s_nit")
	private String sNit;
	
	@Column(name = "f_fecha_ingreso")
	private Date fIngreso;

	public Integer getcContribuyente() {
		return cContribuyente;
	}

	public void setcContribuyente(Integer cContribuyente) {
		this.cContribuyente = cContribuyente;
	}

	

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public String getsNit() {
		return sNit;
	}

	public void setsNit(String sNit) {
		this.sNit = sNit;
	}
	
	public String getfecha() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		return formato.format(fIngreso).toString();
	}

	public Date getfIngreso() {		
		return fIngreso;
	}

	public void setfIngreso(Date fIngreso) {
		this.fIngreso = fIngreso;
	}
	
	
	
}
