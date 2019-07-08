package com.uca.capas.dto;

import java.sql.Date;

public class ContribuyenteDTO {
	
	private Integer cContribuyente;
	private Integer importancia;
		private String sNombre;
		private String sApellido;
		private String sNit;
		private Date fIngreso;
		public Integer getcContribuyente() {
			return cContribuyente;
		}
		public void setcContribuyente(Integer cContribuyente) {
			this.cContribuyente = cContribuyente;
		}
		public Integer getImportancia() {
			return importancia;
		}
		public void setImportancia(Integer importancia) {
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
		public Date getfIngreso() {
			return fIngreso;
		}
		public void setfIngreso(Date fIngreso) {
			this.fIngreso = fIngreso;
		}
		
		
}
