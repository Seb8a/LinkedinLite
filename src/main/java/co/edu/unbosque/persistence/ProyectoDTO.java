package co.edu.unbosque.persistence;

import java.util.Date;

public class ProyectoDTO {

	private String nombreCompania;
	private String cargo;
	private Date fechaInicio;
	private Date fechaFin;
	private String tecnologiaUsada;
	private String role;
	
	public ProyectoDTO(String nombreCompania, String cargo, Date fechaInicio, Date fechaFin, String tecnologiaUsada,
			String role) {

		this.nombreCompania = nombreCompania;
		this.cargo = cargo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tecnologiaUsada = tecnologiaUsada;
		this.role = role;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getTecnologiaUsada() {
		return tecnologiaUsada;
	}

	public void setTecnologiaUsada(String tecnologiaUsada) {
		this.tecnologiaUsada = tecnologiaUsada;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
